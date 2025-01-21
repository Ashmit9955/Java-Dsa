package Functions;
import java.util.*;
public class syntax2 {

    public static void printHello() {
        System.out.println("Hello World");
        System.out.println("Hello India");
        System.out.println("Hello Riya");
    }


        // syntax without parameters
    public static void Sumation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sumation is "+sum);
    }

    public static int Calculator(int num1 , int num2){
        int sum = num1 + num2 ; 
        return sum;
    }


    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // calculateSum(sc.nextInt() , sc.nextInt());

        // Sumation();  // calling function with no parameters  

        Scanner sc = new Scanner(System.in);
        int sum = Calculator(sc.nextInt() , sc.nextInt());
        System.out.println("The final sum is:  "+sum);

    }

}