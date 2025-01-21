import java.util.*;
public class Typecasting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

       //float a = 25.12f;
       //int b = a;  // this line gives an error as we can not convert float into int
      // int b = (int) a;  // here even if java not allow to conver float to int but force java to do so and so called type casting
       // System.out.println(b);

        // another example

        // float marks1 = 99.9999f;
        // int marks2 = (int) marks1;   //we lose the extra data (.9999) in this conversion
        // System.out.println(marks2);


        // another example
        char ch = 'a';  // char a has an int value of 97
        char ch2 = 'b';   // char b has an int value of 98
        int number1 = ch ;
        int number2 = ch2;
        System.out.println(number1);


        
        System.out.println(number2);





    }
}
