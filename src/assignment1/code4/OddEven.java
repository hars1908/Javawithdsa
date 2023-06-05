//Write a program to input an integer from user and print 1 if it is odd otherwise print 0.
package assignment1.code4;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2!=0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
