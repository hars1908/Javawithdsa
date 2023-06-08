package Assignment2.Code1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println("NO");
        } else if (n%1==0 && n%n==0) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
