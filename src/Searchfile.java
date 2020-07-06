import java.io.File;
import java.util.Scanner;

public class Searchfile {

    void searchfileinrepository(){
        System.out.println("Enter the Filename");
        Scanner reader=new Scanner(System.in);
        String filename=reader.nextLine();
        String  directory ="C:\\Users\\rcon537\\Desktop\\TEST\\";
        File f = new File(directory+filename);
        if (f.exists())
        {
            System.out.println("File exists");
        }
        else
        {
            System.out.println("File doesn't exist");
        }
    }
}
