package Loops;
import java.util.*;
public class prime {
    public static void main(String args[]) {
         Scanner sc  = new Scanner(System.in);
         int number = sc.nextInt();
         boolean isPrime = true;

         if (number == 2) {
            System.out.println(number+" is a Prime Number");
         }
         for (int i = 2 ; i <= Math.sqrt(number) ; i++ ){
                if (number % i == 0) {
                   isPrime = false;
                }
            }
            
        if (isPrime == true) {
            System.out.println(number +" is Prime Number");
        
        } else{
            System.out.println(number + " is not Prime");
            }
         
    }
}
