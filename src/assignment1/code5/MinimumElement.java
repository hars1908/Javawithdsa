//Write a program to input two numbers(A & B) from user and print the minimum element among A & B in each line.
package assignment1.code5;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b && b<c){
            System.out.println(a);
        } else if (a>b && b<c) {
            System.out.println(b);
        } else if (a>b && b>c) {
            System.out.println(c);
        }else {
            System.out.println(c);
        }
    }
}
