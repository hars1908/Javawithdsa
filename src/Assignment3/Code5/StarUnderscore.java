package Assignment3.Code5;

import java.util.Scanner;

public class StarUnderscore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               if(j<n-i-1){
                   System.out.print("_");
               }else {
                   System.out.print("*");
               }
           }
            System.out.println();
        }
    }
}
