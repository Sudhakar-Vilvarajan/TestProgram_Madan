import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Addfile {


    void addfiletodirectory()
    {
        Main main=new Main();
        System.out.println("Enter the Filename");
        Scanner reader=new Scanner(System.in);
        String filename=reader.nextLine();
        String  directory ="C:\\Users\\rcon537\\Desktop\\TEST\\";
        File f = new File(directory+filename);
        if (f.exists())
        {
            System.out.println("File already exists");
        }
        else
            {
                System.out.println("No such file exists, creating now");
                Boolean success = null;
                try {
                    f.getParentFile().mkdir();
                    success = f.createNewFile();
                } catch (IOException e) {
                    System.out.println("Exception while creating file");
                    e.printStackTrace();
                }
                if (success) {
                    System.out.printf("Successfully created new file: %s%n", f);
                }
                else {
                    System.out.printf("Failed to create new file: %s%n", f);
                }
            }
    }
}
