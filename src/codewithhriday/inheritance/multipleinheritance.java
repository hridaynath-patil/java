package codewithhriday.inheritance;

interface Fathers{void BusinessMind();}
interface Mothers{void skills();}

class Children implements Fathers, Mothers{
    @Override
    public void BusinessMind() {System.out.println("codewithhriday.inheritance.Fathers Business Mind");}

    @Override
    public void skills() {System.out.println("codewithhriday.inheritance.Mothers Skills");}
}


public class multipleinheritance {
    public static void main(String[] args) {
        Children obj = new Children();
        obj.BusinessMind();
        obj.skills();
    }
}
