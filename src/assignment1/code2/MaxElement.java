//Write a program to input two numbers(A & B) from user and print the maximum element among A & B in each line.
package assignment1.code2;
import java.util.Scanner;
public class MaxElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        if (a>b){
            System.out.println(a);
        } else if (a<b) {
            System.out.println(b);
        }else{
            System.out.println(a);
        }
    }
}
