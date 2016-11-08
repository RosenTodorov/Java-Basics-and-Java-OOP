import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
/**
 * Problem 1:
 * Write a program that reads a text file and prints
 * on the console the sum of the ASCII symbols of each
 * of its lines. Use BufferedReader in combination with FileReader.
 */
public class SumLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(new Locale("en", "EN"));
		
		try (BufferedReader reader = new BufferedReader(new FileReader("resources/lines.txt"))) {
			String line = reader.readLine();
			
			while (line != null) {
				int symbolTotalCount = 0;
				for (int i = 0; i < line.length(); i++) {
					symbolTotalCount += line.charAt(i);
				}
				System.out.println(symbolTotalCount);
				
				line = reader.readLine();
			}
			
			reader.close();
		} catch (FileNotFoundException fileNotFoundEx) {
			System.out.print("File not found.");
		} catch (IOException inputOutputEx) {
			System.out.print("Invalid file.");
		}
	}
}
