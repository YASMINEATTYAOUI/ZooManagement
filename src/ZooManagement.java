import java.util.Scanner;

public class ZooManagement {

    private int nbrCages = 20;
    private String zooName = "my_zoo";

    public static void main(String[] args) {
        // Create an instance of ZooManagement to access the instance variables
        ZooManagement zoo = new ZooManagement();

        // Print the message using concatenation
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");


    Scanner scanner= new Scanner(System.in);
            ZooManagement Zm1= new ZooManagement();
    Zm1.nbrCages = scanner.nextInt();
    Zm1.zooName = scanner.nextLine();
    System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");
    }
}
