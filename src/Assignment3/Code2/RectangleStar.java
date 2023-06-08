package Assignment3.Code2;

import java.util.Scanner;

public class RectangleStar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
