package Functions;

public class arguments {

    public static void swap(int num1 , int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("The Swapped value of num1 is: "+ num1);
        System.out.println("The Swapped value of num2 is: "+ num2);
    
    }
    public static void main(String args[]) {
        // swap - vaklues
        // int a = 5 ; 
        // int b = 10;
        // swap(a , b);     // arguments or actual parameters
        // System.out.println("a is: "+a); 
        // System.out.println("b is: "+b);
        // yaha agr swap func ke bahr prink krwana h to
        // hme orginal value hi milegi  a b ki  kyuki a b ki swapped 
        // values bas funcn ke andar hi milengi


        
        int a = 1;
        int b = 2;
        swap(a, b);
    }
}
