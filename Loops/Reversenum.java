package Loops;
import java.util.*;
public class Reversenum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int revNum = 0 ;
        while(num>0){
            int lastdigit = num%10;
            revNum = revNum*10 + lastdigit;
            num = num / 10;
        }
        System.out.println(revNum);


    }
}
