package Assignment2.Code3;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n=m;
        String s = "";
       while(n>0) {
            int a = n % 10;

            s+=a;
            n=n/10;
            System.out.println(s);
       }
       int b=Integer.parseInt(s);
       if(m==b){
           System.out.println("pallandroms");
       }else {
           System.out.println("no-pallindroms");
       }

    }
}
