package Conditional;
import java.util.*;
public class incometax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int income = sc.nextInt();
        int tax = 0;
        if (income< 500000){
            tax = 0;
            System.out.println("tax "+ 0 );
            System.out.println(income+ income*0);
        }
        else if (income>=500000 && income < 1000000){
            System.out.println("tax "+ 0.2*income );
            System.out.println(income+income*0.2);
        }
        else{
            System.out.println("tax "+ 0.3*income );
            System.out.println(income + income*0.3);
        }



    }
}
