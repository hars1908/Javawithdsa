package Assignment4.code6;

import java.util.Scanner;

public class MaxDiffOfOddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int oddMin=Integer.MAX_VALUE;
        int evenMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]%2==0 && evenMax<a[i]){
                evenMax=a[i];
            }
        }
        for(int i=0;i<n;i++){
            if (a[i]%2!=0 && oddMin>a[i]) {
                oddMin=a[i];
            }
        }
        System.out.println(evenMax-oddMin);
    }
}
