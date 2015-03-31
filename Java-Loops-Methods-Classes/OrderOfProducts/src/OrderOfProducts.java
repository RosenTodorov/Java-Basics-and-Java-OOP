import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class OrderOfProducts {
	/*
	 *Create a class Product to hold products, which have 
	 *name (string) and price (decimal number). 
	 *Read from a text file named "Input.txt" a list of products. 
	 *Each product will be in format name + space + price. 
	 *You should hold the products in objects of class Product. 
	 *Sort the products by price and write them in format price + space + name in a file named "Output.txt". 
	 *Ensure you close correctly all used resources. Examples: 
	 */
	public static void main(String[] args) {
		try (BufferedReader fileReader = new BufferedReader(new FileReader("input.txt"));
			 BufferedWriter orderWriter = new BufferedWriter(new FileWriter("order.txt"));
		     BufferedReader orderReader = new BufferedReader(new FileReader("order.txt"));
			 BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"));		
				) {
			ArrayList<Product> productList = new ArrayList();
		//	ArrayList<Product> productListTwo = new ArrayList();
			double sum = 0;
			
			while (true) {
				Product product = new Product();
				String line = fileReader.readLine();
				if (line == null) {
					break;
				}
				String[] tokens = line.split(" ");
				product.setName(tokens[0]);
				product.setPrice(Double.parseDouble(tokens[1]));
				productList.add(product);
			}
			for (Product pro : productList) {
				orderWriter.write(pro.getPrice() + " " + pro.getName() +"\r\n");
				System.out.println();
			}
			fileReader.close();
			orderWriter.close();	
			
			while (true) {
				Product product = new Product();
				String line = orderReader.readLine();
				if (line == null) {
					break;
				}
				String[] tokens = line.split(" ");
				String orderedProduct = tokens[1];
				
				double orderQuantity = Double.parseDouble(tokens[0]);
			//	product.setPrice(Double.parseDouble(tokens[0]));
		//		productListTwo.add(product);

			    for (Product pro : productList) {
				    if (orderedProduct.equals(pro.getName())) {
					sum += orderQuantity * pro.getPrice();
				}	
			    }
			}
			output.write(String.format("%.2f", sum));
			orderReader.close();
			output.close();			
		} catch (IOException e) {
			System.err.println("Error");
		}
	}
}
