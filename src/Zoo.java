public class Zoo {

    //int MaxAnimals = 25;
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages=25;
    private int animalCount = 0;

    public Zoo(String name, String city) {
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        //this.nbrCages = nbrCages;

    }

    public String toString() {
        return (name+" "+city);
    }

    public boolean addAnimal(Animal animal) {
        if (animalCount < animals.length) {
            animals[animalCount] = animal;
            System.out.println(animalCount);
            animalCount++;
            return true;
        } else {
            System.out.println("Zoo is full, cannot add more animals.");
            return false;
        }
    }

    public void displayAnimals() {
        System.out.println("Liste des animaux dans le zoo :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i].getName());
        }
    }

    public int searchAnimal(Animal animal){
        int index = -1;
        for (int i = 0; i < animalCount; i++) {

           if (animals[i].getName() == animal.getName()){
               index = i;
           }
        }
        return index;
    }


}
