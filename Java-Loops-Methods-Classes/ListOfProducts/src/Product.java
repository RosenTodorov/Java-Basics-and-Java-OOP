
public class Product implements Comparable<Product> {
	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public Product() {
		
	}
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
    public void setName(String name) {
	    this.name = name;
    }

    public void setPrice(double price) {
	    this.price = price;
    }
		    
	public int compareTo(Product Products) {
		double price = Products.getPrice();
		if (this.price > price) {
			return 1;
		} else if (this.price == price) {
			return 0;
		} else {
			return -1;
		}
	}
}
