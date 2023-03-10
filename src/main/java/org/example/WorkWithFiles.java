import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WorkWithFiles {
    public static void main(String[] args) {
        File ourFile = new File("our_file.txt");
        /*try {
            boolean created = ourFile.createNewFile();
            if (created) {
                System.out.println("File was created");
            } else {
                System.out.println("File was not created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*try {
            FileWriter writer = new FileWriter("our_file_1.txt");
            writer.write("Hello, Dmitry!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        try {
            FileWriter writer = new FileWriter("our_file_1.txt");
            writer.write("Hello, Olga!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File("our_file_1.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("File name: " + file.getName());
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("File size: " + file.length());

        //file.delete();


    }
}

