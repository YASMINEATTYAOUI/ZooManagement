import java.lang.constant.Constable;
import java.util.List;

public class Zoo {

    //int MaxAnimals = 25;
    private Animal[] animals;
    private String name;
    private String city;
    private  int nbrCages=25;


    public Zoo(String name, String city) {
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        //this.nbrCages = nbrCages;

    }

    public String toString() {
        return (name+city);
    }
/*
    public void addAnimal(Animal animal, int index) {
        if (index < animals.length) {
            animals[index] = animal;
        } else {
            System.out.println("Zoo is full, cannot add more animals.");
        }
    }
*/


}
