package Functions;
import java.util.*;
public class Prime3 {
    public static boolean Prime(int n){
        for (int i = 2 ; i<= Math.sqrt(n) ; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find all the prime numbers upto that number");
        int input = sc.nextInt() ;
       int count = 0;
        for(int num = 2 ; num<= input ; num++){
            if (Prime(num) == true){
                count+= 1;
                System.out.println(count+" Prime number is "+num);
            }
        }
        System.out.println("Total of "+count+" prime numbers are there");
    }
}
