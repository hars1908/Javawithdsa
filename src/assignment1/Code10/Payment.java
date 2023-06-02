package assignment1.Code10;

import java.util.Scanner;

public class Payment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=sc.nextInt();
        String transaction=sc.next();
        int amount=sc.nextInt();
        int available=0;
        switch (transaction){
            case "Credit":
                available=amount+balance;
                System.out.println(available);
                break;
            case "Debit":
                if(balance>amount){
                    available=amount-balance;
                    System.out.println(available);
                }else{
                    System.out.println("insufficient balance");
                }
                //System.out.println(available);
        }


    }
}
