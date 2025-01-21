package Conditional;
public class switchstatement {
    public static void main(String args[]) {
        // not so necessary
        int age = 20;
        switch (age) {
            case 12 : System.out.println("He is 12 years old");
            break;
            case 18 : System.out.println("He is 18 years old");
            break;
            case 20 : System.out.println("He is 20 years old");
            break;        
            case 22 : System.out.println("He is 22 years old");
            break;        
            default : System.out.println("His age is "+ age);
            break;
        }
    }
}
