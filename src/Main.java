import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Main main=new Main();
    main.welcome();
    }


    void welcome()
    {
        Addfile af=new Addfile();
        Deletefile df=new Deletefile();
        Searchfile sf=new Searchfile();
        findallfiles ff=new findallfiles();

        System.out.println("\nWelcome");
        System.out.println("1.Add file");
        System.out.println("2.Delete file");
        System.out.println("3.search file");
        System.out.println("4.Files in repository");
        System.out.println("5.Exit");
        Scanner scanner=new Scanner(System.in);
        String choice = scanner.nextLine();
        switch(choice){
            case "1":
            {
                af.addfiletodirectory();
                welcome();
            }
            case "2":
            {
                df.deletefromrepository();
                welcome();
            }
            case "3":
            {
                sf.searchfileinrepository();
                welcome();
            }
            case "4":
            {
                ff.findallfilesinrepo();
                welcome();
            }
            case "5":
            {
                break;
            }
            default:
            {
                System.out.println("Enter the correct choice");
                welcome();
            }
        }
    }
}
