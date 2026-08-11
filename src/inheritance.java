class Animals{
    void sound(){System.out.println("I'm a Animal");}
}
class Dogs extends Animals{
    void sound(){System.out.println("I'm a Dog");}
}

class Cats extends Animals{
    void sound(){System.out.println("I'm a Cat");}
}

public class inheritance {
    public static void main(String[] args) {
        Animals a;
        a = new Dogs();
        a.sound();
        a = new Cats();
        a.sound();
    }
}
