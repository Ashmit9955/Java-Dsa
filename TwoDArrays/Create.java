package TwoDArrays;
import java.util.*;
public class Create {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int m = matrix.length , n = matrix[0].length;
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your Matrix is: ");
        // Now Printing the 2D Array
        for(int i =0; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
