package codewithhriday.practise;

class Student {
    String name;
    int id;

    //basic constructor
    public Student() {
        name = "Guest1";
        id = 7248;
        System.out.println("Default constructor");

    }

    //parameterised
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Parameterised constructor");
    }

    //copy constructor
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        System.out.println("Copy Constructor trigerred");
    }

    public void show() {
        System.out.println("ID: " + id + "| Name : " + name);
    }
}

    class MyUtils{
        private MyUtils(){

        }
        public static void log(String msg){
            System.out.println(msg);
        }
    }

    class ConstructorDemo{
        public static void main(String[] args){
            System.out.println("Testing constructor");
            System.out.println(" ");

            //defailt

            Student s1 =  new Student();
            s1.show();
            System.out.println();

            //parameterised
            Student s2 = new Student("Hriday Patil", 449799);
            s2.show();
            System.out.println();

            //copy constructor
            Student s3 = new Student(s2);
            s3.show();
            System.out.println();

            //private constructor
            MyUtils.log("Static Metihod caled directly without buitlding an object");

        }
    }

