//Write a program to input three numbers(A, B & C) from user and print the minimum element among A, B & C.
package assignment1.Code6;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        if(a<b){
            System.out.println(a);
        } else if (a>b) {
            System.out.println(b);
        }else {
            System.out.println(a);
        }
    }
}
