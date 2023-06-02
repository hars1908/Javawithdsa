package Code1;
import java.util.Scanner;
public class MonthList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] a ={"January","February","March","April","May","June","July","August","September","October","November","December"};
        for(int i=1;i<=a.length;i++){
            System.out.println(a[i]);
            if(n==i){
                System.out.println(a[i]);
            }
        }
    }
}
