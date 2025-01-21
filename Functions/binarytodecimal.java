package Functions;
import java.util.*;
public class binarytodecimal {

    public static void binToDec(int binNum){
        int power = 0;
        int decNum = 0;
        int temp = binNum ;
        while(binNum>0){
            int lastDig = binNum % 10;
            decNum += lastDig * (int)Math.pow(2,power);
            power++;
            binNum /= 10 ;
        }
        System.out.println("The decimal number of "+ temp  + " is--> "+ decNum);
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        binToDec(sc.nextInt());
    }
}
