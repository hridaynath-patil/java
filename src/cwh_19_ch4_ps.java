import java.util.Scanner;
import java.util.Random;

public class cwh_19_ch4_ps {
    public static void main(String[] args) {


//        Question 4:

        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

//        Question 6
        Scanner sc1 = new Scanner(System.in);
        String website = sc1.next();
        if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a Commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }
//        Random r = new Random();
//        int a = r.nextInt();
//        System.out.println(a);

    }
}
