package TwoDArrays;

public class DiagonalSum {
    public static void diagonalSum(int matrix[][]){
        int sum1 = 0;
        int sum2 = 0;
        for(int i =0; i<matrix.length; i++){
            sum1+=matrix[i][i];
        }
        int new1 = matrix[0].length-1;
        for(int j = 0; j< matrix.length; j++ ){
            sum2+= matrix[j][new1];
            new1--;
        }
        System.out.println("Left Diagonal Sum: "+sum1);
        System.out.println("Right Diagonal Sum: "+sum2);
    }
    public static void main(String args[]){
     int matrix[][] = {{1,2,3,4,100} ,
                       {5,6,7,8,101} ,
                       {9,10,11,12,102},
                      {13,14,15,16,103},
                      {17,18,19,20,104}};
    diagonalSum(matrix);
    }
}
