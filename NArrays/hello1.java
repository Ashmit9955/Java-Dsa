package NArrays;
import java.util.*;
public class hello1 {
    public static void main(String[] args) {
        int marks[] = new int[50];
        int numbers[] = {1,2,3,4};
        String fruits[] = {"Apple" , "mango" , "Banana"};
        Scanner sc = new Scanner(System.in);
//        Taking input for the marks array...
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Phy: "+marks[0]);
        System.out.println("Chem: "+marks[1]);
        System.out.println("Maths: "+marks[2]);
        marks[2] = 100;
        System.out.println("Chem: "+marks[2]);
        System.out.println("Length of marksArray: "+marks.length);
    }
}
