package codewithhriday.loops;

public class breakloop {
    public static void main(String[] args) {
        for (int i = 0; i<10; i++){
            System.out.println("Java Loop is running");
            System.out.println(i);
           if (i==7){
               System.out.println("Java Loop Breaked");
               break;
           }
        }
    }
}
