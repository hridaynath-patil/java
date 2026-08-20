package codewithhriday.practise;

import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        System.out.println("Taking Input from User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number2 : ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);
//
//        String str = sc.nextLine();
//        System.out.println(str);
    }
}
