package codewithhriday.encapsulation;

class Animal {
    protected String name;

    public Animal(String name) {
        this.name=name;
    }
    public void eat() {
        System.out.println(name+ " is eating food.");
    }
    public void makeNoise() {
        System.out.println(name+ " animal sound.");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name); //calls constructor of parent class
        this.breed = breed;
    }

    public void fetch() {
        System.out.println(name + " the " + breed + " is Man Friendly!");
    }
}

public class encapsulation1 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Bruno", "German-Shephard");

        myDog.eat();
        myDog.makeNoise();
        myDog.fetch();
    }
}
