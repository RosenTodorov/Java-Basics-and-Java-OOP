import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Problem 2:
 * Write a program that reads a text file and changes
 * the casing of all letters to upper. The file should
 * be overwritten. Use BufferedReader, FileReader,
 * FileWriter, and PrintWriter.
 */
public class AllCapitals {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(new Locale("en", "EN"));
		
		try (BufferedReader reader = new BufferedReader(new FileReader("resources/linesCapital.txt"))) {
			String line = reader.readLine();
		    List<String> lineArray = new ArrayList<String>();
		    
			while(line != null) {
				lineArray.add(line.toUpperCase());
				
				line = reader.readLine();
			}
			
			reader.close();
			
			try (BufferedWriter writer = new BufferedWriter(new FileWriter("resources/linesCapital.txt"))) {
				PrintWriter printWriter = new PrintWriter("resources/linesCapital.txt");
				
				for (int i = 0; i < lineArray.size(); i++) {
					printWriter.println(lineArray.get(i));
				}
				
				printWriter.close();
				writer.close();
				
				System.out.print("Success!");				
			}
		} catch (FileNotFoundException fileNotFoundex) {
			System.out.println("Error. File not found.");
		} catch (IOException inputOutputEx) {
			System.out.print("Error. Invalid file.");
		}
	}
}
