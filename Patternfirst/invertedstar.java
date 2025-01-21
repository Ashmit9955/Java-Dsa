package Patternfirst;
import java.util.*;
public class invertedstar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        // for (int i = 1 ; i<=4 ; i++){
        //     for (int j = 1 ; j <= (number-i+1) ; j++ ) {
        //         System.out.print("* ");
        //     }
        //     System.out.println(" ");
        // }



        int number2 = sc.nextInt();
        for (int i = 0 ; i <= number2 ; i++) {
            for (int k = 1 ; k<= number2-i ; k ++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
