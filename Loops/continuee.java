package Loops;
import java.util.*;
public class continuee {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a number");
            int number = sc.nextInt();
            if (number % 10 == 0 ){
                continue;
            }
            System.out.println("Your entered number is : " + number);
        }
    }
}
