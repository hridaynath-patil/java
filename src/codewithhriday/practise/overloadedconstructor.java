package codewithhriday.practise;

class Guest{
    String name;
    int id;

    // parameterised constructor takes both name and id
    Guest(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // overloaded constructor takes only name
    Guest (String name){
        this.name=name;
        this.id = -1; // fallback temporary id
        System.out.println("overloaded constructor Name Parameter only: ");
    }

    public void show() {
        System.out.println("ID: " + id + "| Name : " + name);
    }
}

class overloadedconstructor {
    public static void main(String[] args) {

        Guest s3 = new Guest("Amit Sharma");
        s3.show();
        System.out.println();
    }
}
