import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
 
/**
 * // Problem 3:
 * Write a program that reads a list of words from the
 * file words.txt and finds the count of vowels (гласни букви),
 * consonants (съгласни) and other punctuation marks.
 * Since English is a bit tricky, assume that a, e, i, o, u
 * are vowels and all others are consonants. Punctuation marks
 * are (!,.?). Do not count whitespace.
 * Write the results in file count-chars.txt.
 */
public class CountCharacterTypes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(new Locale("en", "EN"));
        File countChars = new File("resources/count-chars.txt");
 
        try (BufferedReader reader = new BufferedReader(new FileReader("resources/words.txt"))) {
            String line = reader.readLine();
            List<String> lineArray = new ArrayList<>();
 
            while (line != null) {
                lineArray.add(line);
                line = reader.readLine();
            }
 
            reader.close();
            System.out.println("words.txt successfully loaded!");
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(countChars))) {
            	String[] array = new String[lineArray.size()];
            	int countVowels = 0;
            	int countConsonants = 0;
            	int countPunctuation = 0;
            	
            	for (int i = 0; i < lineArray.size(); i++) {
            		array[i] = lineArray.get(i);
            		String inputLine = array[i];
            		for (int j = 0; j < inputLine.length(); j++) {
            			switch(inputLine.charAt(j)) {
            			case 'a': countVowels += 1; break;
            			 case 'e': countVowels += 1; break;
                         case 'i': countVowels += 1; break;
                         case 'o': countVowels += 1; break;
                         case 'u': countVowels += 1; break;
                         case ' ': break;
                         case '!': countPunctuation += 1; break;
                         case ',': countPunctuation += 1; break;
                         case '.': countPunctuation += 1; break;
                         case '?': countPunctuation += 1; break;
                         default: countConsonants += 1; break;
                     }
                 }
             }
            	writer.write("Vowels: " + countVowels);
            	writer.newLine();
            	writer.write("Consonants: " + countConsonants);
                writer.newLine();
                writer.write("Punctuation: " + countPunctuation);
 
                writer.close();
                System.out.print("count-chars.txt successfully created!");
            }
        } catch (FileNotFoundException fileNotFoundEx) {
            System.out.print("Error: File Not Found!");
        } catch (IOException inputOutputEx) {
            System.out.print("Error: Invalid file!");
        }
    }
}