package Pattern2;

public class HolloRect {

    // Hollow Rectangle function
    public static void hollowRect(int row , int col){
        for (int i =1; i<= row ;i++) {
            for(int j =1 ; j <=col ; j++){
                if (i == 1 || i == row || j == 1 || j == col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
// Function here ends



    public static void main(String args[]){

        hollowRect(7,4);
    }
}
