package Functions;

public class Assignment {

    // Average Function
    public static int Average(int a , int b , int c){
        return (a+b+c)/3;
    }
    
    // isEven Function
    public static boolean isEven(int n){
        if (n%2==0){
            return true;
        }
        return false;
    }


    // palindrome function
    public static boolean isPalindrome(int n){
        int rev = 0;
        int temp = n;
        while (n > 0) {
            int dig = n % 10;
            rev = rev*10 + dig ;
            n = n / 10;
        }
        if (temp == rev){
            return true;
        }
       return false;
    }


    // Write a Java method to compute the sum of the digits in an integer.
    public static int Sum(int n){
        int num = 0;
        while(n!=0){
            int digit = n % 10;
            num = num + digit;
            n = n/10;
        }
        return num;
    }



    public static void main(String args[]){


        // Average Question

        // System.out.println(Average(sc.nextInt(),sc.nextInt(),sc.nextInt()));

        // isEven Question

        // System.out.println(isEven(10));

        // isPalindrome Question
        // boolean result = isPalindrome(121);
        // System.out.println(result);

        // Write a Java method to compute the sum of the digits in an integer.
        System.out.println(Sum(12352));
    }
}
