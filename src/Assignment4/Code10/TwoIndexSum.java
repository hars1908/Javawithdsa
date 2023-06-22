package Assignment4.Code10;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoIndexSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int search= sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        boolean b=false;
        int j=0;
        for(int i=1;i<n;i++){
            if (i != j && a[i] + a[j] == search) {
                b = true;
                break;
            }
            j++;
        }
        if(b){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
