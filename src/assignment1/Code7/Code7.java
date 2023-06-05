/*You are given 3 integer angles(in degrees) A, B and C of a triangle. You have to tell whether the triangle is valid or not.

        A triangle is valid if sum of its angles equals to 180.*/
package assignment1.Code7;

import java.util.Scanner;

public class Code7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
//        int sumOfTriangle=180;
//        int sum=a+b+c;
        if(a+b+c==180){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
