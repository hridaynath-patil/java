package codewithhriday.abstraction;

interface Flyable {
    void fly();
}

class Airplane implements Flyable {
    public void fly() {System.out.println("Aeroplane flies by jet engines.");}
}

class Bird implements Flyable {
    public void fly() {System.out.println("bird flies by wings.");}
}

public class fullabstractioninterfaces  {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.fly();
        Bird bird = new Bird();
        bird.fly();
    }
}