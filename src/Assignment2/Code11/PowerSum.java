package Assignment2.Code11;

import java.util.Scanner;

public class PowerSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=1;
        for(int i=0;i<b;i++){
                sum*=a;
        }
        System.out.println(sum);
    }
}
