package Patternfirst;
import java.util.*;
public class numberpyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in) ;
        int number = 5;
        // for (int i =1; i <= number ; i++) {
        //     for (int j = 1; j<=i ; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }



            int num = 1;
        int number2 = sc.nextInt();
        for (int i = 1 ; i<=number2 ; i++ ){
            for (int k = 1 ; k<= i ; k++) {
                System.out.print(num);
                num+=1;
            }
            System.out.println();
        }
    }
}
