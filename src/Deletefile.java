import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.File;
import java.util.Scanner;

public class Deletefile {

    void deletefromrepository(){
        System.out.println("Enter the Filename");
        Scanner reader=new Scanner(System.in);
        String filename=reader.nextLine();
        String  directory ="C:\\Users\\rcon537\\Desktop\\TEST\\";
        File f = new File(directory+filename);
        if (!f.exists())
        {
            System.out.println("File doesn't exists");
        }
        else
        {
            Boolean Success = f.delete();
            if(Success) {
             System.out.println("File deleted successfully");
            }
            else {
                System.out.println("Failed to Delete the file");
            }
        }
        }
    }

