class Emp {
    private int id;
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String n){
        name=n;
    }

    public void setId(int i){
        id = i;
    }

    public int getId(){
        return id;
    }

}
public class accessmodifiers1 {
    public static void main(String[] args) {
        Emp emp1 = new Emp();
        emp1.setName("Hridaynath P.");
        System.out.println("Name: " +emp1.getName());
        emp1.setId(1);
        System.out.println("Id: " +emp1.getId());
    }
}
