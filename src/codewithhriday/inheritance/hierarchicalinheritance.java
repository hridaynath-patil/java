package codewithhriday.inheritance;

class Fatheer{
    Fatheer(){System.out.println("Father: Our family surname is Patil.");}
}

class Son extends Fatheer{
    Son(){System.out.println("codewithhriday.codewithhriday.inheritance.inheritance.Son: I like playing cricket");}
}

class Daughter extends Fatheer{
    Daughter(){System.out.println("codewithhriday.codewithhriday.inheritance.inheritance.Daughter: I like Playing Chess");}
}

public class hierarchicalinheritance {
    public static void main(String[] args) {
        System.out.println("-------------Testing codewithhriday.codewithhriday.inheritance.inheritance.Son Object -------------");
        Son obj = new Son();

        System.out.println("-----------Testing codewithhriday.codewithhriday.inheritance.inheritance.Daughter Object -------------");
        Daughter obj1 = new Daughter();
    }
}
