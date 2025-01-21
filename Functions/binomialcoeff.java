package Functions;
import java.util.*;
public class binomialcoeff {

    // This is the code for factorial
    public static int fact(int n){
        int prod = 1;
        for (int i = 1 ; i<=n ; i++){
        prod *= i;
        }
        return prod;
    }

    // Now below is for binomial coefficient
    public static int binomial_coefficient(int num1, int num2 ){
        int n = fact(num1);
        int r = fact(num2);
        int nr = fact(num1-num2);
        int result = n/(r*nr);
        return result;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       int result = binomial_coefficient(sc.nextInt() , sc.nextInt());
       System.out.println("The binomial cofficient of the numbers is: " + result);
        
    }

}
