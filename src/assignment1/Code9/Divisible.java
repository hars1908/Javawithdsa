/*
Take an integer A as input. You have to tell whether A is divible by both 5 and 11 or not.
*/
package assignment1.Code9;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%5==0 && n%11==0){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
