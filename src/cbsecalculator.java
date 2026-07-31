import java.util.Scanner;

public class cbsecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CBSE Board Percentage Calculator");
        System.out.println("Enter Subject1 Marks : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Subject2 Marks : ");
        int num2 = sc.nextInt();
        System.out.println("Enter Subject3 Marks : ");
        int num3 = sc.nextInt();
        System.out.println("Enter Subject4 Marks : ");
        int num4 = sc.nextInt();
        System.out.println("Enter Subject5 Marks : ");
        int num5 = sc.nextInt();

        float  sum = (num1 + num2 + num3 + num4 + num5) / 5 ;
        System.out.println("CBSE Board Percentage: " + sum);
    }
}
