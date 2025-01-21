package Functions;
import java.util.*;
public class factorial {

    public static int fact(int num1){
    int prod = 1;
    for(int i=1 ; i<=num1 ; i++){
        prod*= i;
    }
    return prod;
    }
 public static void main(String args[] )  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number for fact: ");
    int result = fact(sc.nextInt());
    System.out.println("The result is: "+result);
 } 
}
