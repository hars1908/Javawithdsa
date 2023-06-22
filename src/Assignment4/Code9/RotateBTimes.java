package Assignment4.Code9;

import java.util.Scanner;

public class RotateBTimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        int start=0;
        rotating(a,start,n-1);
        rotating(a,start,b-1);
        rotating(a,b,n-1);
        System.out.println();
        for (int i=0;i<n;i++){
            System.out.print(a[i]);
        }
    }
    public static void rotating(int[] a,int start,int end){
        while (start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}
