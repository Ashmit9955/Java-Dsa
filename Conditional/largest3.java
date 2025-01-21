package Conditional;
public class largest3 {
    public static void main(String args[]) {
        int num0 = 1;
        int num1 = 22;
        int num2 = 33;
        if ((num0>num1) && (num0>num2)) {
            System.out.println(num0+" is greatest");
        }
        else if((num1>num0) && (num1>num2)) {
            System.out.println(num1+" is greatest");
        }
        else{
            System.out.println(num2+" is greatest");

        }

    }
}
