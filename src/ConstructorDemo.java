class Student {
    String name;
    int id;

    // no-arg constructor
    public Student() {
        name ="Guest Student";
        id =1000;
        System.out.println("Default constructor triggered");
    }

    // parameterized
    public Student(String name, int id) {
        this.name =name;
        this.id = id;
        System.out.println("Param constructor triggered for: ");
    }

    // copy constructor to clone object
    public Student(Student s) {
        this.name=s.name;
        this.id =s.id;
        System.out.println("Copy constructor triggered:");
    }

    public void show() {
        System.out.println("ID: "+id + " | Name: "+name);
    }
}

// private constructor
class MyUtils {
    private MyUtils() {
        // empty private constructor so no instance can be created
    }

    public static void log(String msg) {
        System.out.println("[SYSTEM LOG] " + msg);
    }
}

class ConstructorDemo {
    public static void main(String[] args) {
        System.out.println("Testing Constructors");
        System.out.println();

        // default
        Student s1 = new Student();
        s1.show();
        System.out.println();

        // parameterized
        Student s2 = new Student("Hridaynath Patil", 4447);
        s2.show();
        System.out.println();

        // 3. copy constructor
        Student s3 = new Student(s2);
        s3.show();
        System.out.println();

        // 4. private constructor
        MyUtils.log("Static method called directly without building an object.");
    }
}
