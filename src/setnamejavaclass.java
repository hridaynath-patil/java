class Employees {
    int salary;
    String name;

    public Employees(int salary, String name) {
        this.salary= salary;
        this.name=name;
    }

    public int getSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class setnamejavaclass {
    public static void main(String[] arg){
        Employees emp=new Employees(15000, "Hridaynath Patil");
        System.out.println("Original Name: " +emp.getName());
        System.out.println("Salary: " +emp.getSalary());

        emp.setName("H. B. Patil");

        System.out.println("Updated Name: "+emp.getName());
    }
}
