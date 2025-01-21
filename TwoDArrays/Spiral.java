package TwoDArrays;

public class Spiral {
    public static void spiralMatrix(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length -1;
        int endCol = matrix[0].length -1;
        while(startRow<=endRow && startCol<=endCol){
        // top
        for(int i= startCol; i<=endCol; i++){
            System.out.print(matrix[startRow][i] + " ");
        }
        // Right
        for(int i=startRow+1; i <= endRow; i++){
            System.out.print(matrix[i][endCol] + " ");
        }
        // bottom
        for(int i =endCol-1; i>=startCol; i--){
            if(startRow==endRow){
                break;
            }
            System.out.print(matrix[endRow][i] + " ");
        }
        // left
        for(int i=endRow-1; i>=startRow+1; i--){
            if(startCol == endCol){
                break;
            }
            System.out.print(matrix[i][startCol]+" ");
        }
        startRow++;
        startCol++;
        endCol--;
        endRow--;
    }
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4,100} ,
                          {5,6,7,8,101} ,
                        {9,10,11,12,102},
                        {13,14,15,16,103},
                        {17,18,19,20,104}};
        spiralMatrix(matrix);
    }
}
