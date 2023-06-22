package Assignment4.code5;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        int secondmax=0;
        for(int i=0;i<n;i++){
            if(secondmax<a[i] &&max>a[i]){
                secondmax=a[i];
            }
        }
        System.out.println(secondmax);
    }
}
