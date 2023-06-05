//You are given a Bank account having N amount and you are asked to perform ADD(credit) or SUBTRACT(debit) operation of an amount X.]
//
//After the operation print the amount left in the Bank account. If the debit amount is greater than current balance print "Insufficient Funds"(without quotes) and the operation is skipped.
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
