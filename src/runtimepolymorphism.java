class Animalsss {
    void makeSound() {System.out.println("ANIMALs");}
}

class Dogsss extends Animalsss {
    @Override
    void makeSound() {System.out.println("bark");}
}

class Catsss extends Animalsss {
    @Override
    void makeSound() {System.out.println("meow");}
}

public class runtimepolymorphism {
    public static void main(String[] args) {

        Animalsss myAnimal = new Animalsss();
        Animalsss myDog = new Dogsss();
        Animalsss myCat = new Catsss();

        myAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();
    }
}
