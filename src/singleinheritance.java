class Vehicle{
    Vehicle(){
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle{
    Car(){
        System.out.println("This is a Car");
    }
}
public class singleinheritance {
    public static void main(String[] args) {
        Car obj = new Car(); //creating obj of subclass invokes base class constr.
    }
}
