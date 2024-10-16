import java.net.SocketOption;

public class Main {


    public static void main(String[] args) {

        //Animal animal = new Animal("lion", "Simba",5,true);
        Zoo zoo = new Zoo("My Zoo","Zoo Land");

        //zoo.addAnimal(animal);

        System.out.println(zoo.toString());
        System.out.println();
        //zoo.searchAnimal(animal);

        zoo.displayAnimals();

    }

}
