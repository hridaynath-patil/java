package codewithhriday.encapsulation;

class encap {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class encapsulation{
    public static void main(String[] args) {
        encap e =  new encap();
        e.setName("Hridaynath");
        System.out.println("Name is : " + e.getName());
    }
}
