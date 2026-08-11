class Fatheer{
    Fatheer(){System.out.println("Father: Our family surname is Patil.");}
}

class Son extends Fatheer{
    Son(){System.out.println("Son: I like playing cricket");}
}

class Daughter extends Fatheer{
    Daughter(){System.out.println("Daughter: I like Playing Chess");}
}

public class hierarchicalinheritance {
    public static void main(String[] args) {
        System.out.println("-------------Testing Son Object -------------");
        Son obj = new Son();

        System.out.println("-----------Testing Daughter Object -------------");
        Daughter obj1 = new Daughter();
    }
}
