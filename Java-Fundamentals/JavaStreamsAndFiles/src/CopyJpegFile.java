import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
 
/**
 * Problem 4:
 * Write a program that copies the contents of a .jpg file
 * to another using FileInputStream, FileOutputStream, and
 * byte[] buffer. Set the name of the new file as
 * my-copied-picture.jpg.
 */
public class CopyJpegFile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(new Locale("en", "EN"));
        File oldCat = new File("resources/cat.jpg");
        File newCat = new File("resources/my-copied-picture.jpg"); // Pun intended.
 
        try {
            FileInputStream reader = new FileInputStream(oldCat);
            FileOutputStream writer = new FileOutputStream(newCat);
 
            try {
                int currentByte = reader.read();
 
                while (currentByte != -1) {
                    writer.write(currentByte);
                    currentByte = reader.read();
                }
            } catch (FileNotFoundException fileNotFoundEx) {
                System.out.print("Error: File not found!");
            } catch (IOException inputOutputEx) {
                System.out.print("Error: Invalid file!");
            }
 
            reader.close();
            writer.close();
        } catch (IOException inputOutputEx) {
            System.out.print("Error: Invalid file!");
        }
    }
}
