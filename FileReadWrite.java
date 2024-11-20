//4. Write a Java program to read content from a file and write content to a new file. 
//Handle IOException and ensure proper resource management.
package Project;
import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        String input = "input.txt";  // Make sure this file exists
        String output = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(input));
             BufferedWriter writer = new BufferedWriter(new FileWriter(output))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File content copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


 //BufferedReader is used to read text from a file. 
 //It efficiently reads large chunks of data at once (using an internal buffer),
 //which reduces the number of I/O operations, making it faster than reading one byte or one character at a time