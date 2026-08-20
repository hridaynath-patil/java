package codewithhriday.abstraction;

abstract class Vehicles {
    void startEngine() {System.out.println("engine started");}
    abstract void accelerate();
}

class Cars extends Vehicles {
    @Override
    void accelerate() {System.out.println("car accelerates");}
}

public class partialabstractionclasses{
    public static void main(String[] args) {
        Vehicles v = new Cars();
        v.startEngine();
        v.accelerate();
    }
}