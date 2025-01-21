package Functions;
import java.util.*;
public class dectobin {
    public static void decToBin(int n){
        int bin = 0;
        int power = 0;
        int temp = n;
        while (n>0){
            int dig = n % 2;
            bin += dig* Math.pow(10,power);
            power++;
            n /= 2;
        }
        System.out.println("The binary number for "+temp+" is "+bin);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your decimal number to convert into binary form: ");
        decToBin(sc.nextInt());
    }
}
