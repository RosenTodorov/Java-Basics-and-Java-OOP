import java.io.*;
import java.util.*;
 
/**
 * Problem 5:
 * Write a program that saves and loads the information
 * from an ArrayList to a file using ObjectInputStream,
 * ObjectOutputStream. Set the name of the new file as
 * doubles.list
 */
public class SaveArrayListOfDoubles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(new Locale("en", "EN"));
        Scanner console = new Scanner(System.in);
        List<Double> doublesListArray = new ArrayList<>();
        doublesListArray.add(2.3);
        doublesListArray.add(2.4);
        doublesListArray.add(2.5);
        
        try {
            FileOutputStream doublesList = new FileOutputStream("resources/doubles.list");
            ObjectOutputStream save = new ObjectOutputStream(doublesList);
 
            save.writeObject(doublesListArray);
            save.flush();
 
            ObjectInputStream load = new ObjectInputStream(new FileInputStream("resources/doubles.list"));
            try {
                System.out.println(load.readObject());
            } catch (ClassNotFoundException classNotFoundEx) {
                System.out.print("Error: Class not found.");
            }
        } catch (FileNotFoundException fileNotFoundEx) {
            System.out.print("Error: File not found.");
        } catch (IOException inputOutputEx) {
            System.out.print("Error: Invalid file.");
        }
    }
}
