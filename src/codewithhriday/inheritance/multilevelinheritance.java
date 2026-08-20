package codewithhriday.inheritance;

class Grandfather{
    Grandfather(){System.out.println("codewithhriday.inheritance.Grandfather: I own the family land.");}
}

class Father extends Grandfather{
    Father(){System.out.println("codewithhriday.inheritance.Father: I built a family business on the land.");}
}

class Child extends Father{
    Child(){System.out.println("codewithhriday.inheritance.Child: I am expanding the family business globally.");}
}

public class multilevelinheritance {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
