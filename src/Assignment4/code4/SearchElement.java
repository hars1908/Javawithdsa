package Assignment4.code4;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cases=sc.nextInt();
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        boolean b=false;
        for(int i=0;i<n;i++){
            if (cases == arr[i]) {
                b = true;
                break;
            }
        }
        if (b){
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }
}
