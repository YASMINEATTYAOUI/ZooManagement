public class ZooManagement {

    private int nbrCage = 20;
    private String zooName = "my_zoo";

    public static void main(String[] args) {
        // Create an instance of ZooManagement to access the instance variables
        ZooManagement zoo = new ZooManagement();

        // Print the message using concatenation
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCage + " cages");
    }
}
