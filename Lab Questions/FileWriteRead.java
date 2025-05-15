import java.io.*;


public class FileWriteRead {
    public static void main(String[] args) {
        

        // Write to file
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("THIS IS A SAMPLE TEXT");
            writer.close();
            System.out.println("File written successfully.");


        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read from file
        try {
            FileReader reader = new FileReader("example.txt");
            int character;
            
            System.out.println("Reading from the file:");

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            reader.close();

        } catch (IOException e) {
            
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}