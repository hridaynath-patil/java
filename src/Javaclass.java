class Employee{
    int id;
    int salary;
    String name;

    public void prindetails(int id, int salary, String name) {
        System.out.println(name+" "+id+" "+salary);
    }

    public int getSalary() {
        return salary;
    }
}
public class Javaclass {
    public static void main(String[] args) {
        System.out.println("This is Custom class");
        Employee hriday = new Employee();

        //setting attributes
        hriday.id =4447;
        hriday.salary = 15000;
        hriday.name ="Hridaynath Patil";

        //printing attributes
        System.out.println("Employee Name is "+hriday.name);
        System.out.println("Employee Salary is "+hriday.salary);
        System.out.println("Employee ID is "+hriday.id);
    }
}
