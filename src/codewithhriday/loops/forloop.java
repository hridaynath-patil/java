package codewithhriday.loops;

import java.util.Scanner;

public class forloop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter n value:");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("the odd values are: " +(2*i+1));
            System.out.println("the even values are: " +(2*i));
        }
    }
}