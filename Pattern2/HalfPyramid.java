package Pattern2;

public class HalfPyramid {
    
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


    public static void Pyramid(int lines){
        for (int i = 1 ; i<= lines ; i++){
            for (int j =1 ; j <= (lines-i) ; j++){
             System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // NumPyramid 
    public static void NumPyramid(int n ){
        for(int i = 0; i < n ; i++){
            for (int j = 1 ; j<= (n - i) ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    // Floyd's Triangle
    public static void floyd(int n){
        int num =1;
        for (int i = 1; i<= n ; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    // 0-1 Triangle
    public static void zeroOne(int n){
        for (int i = 1 ; i<= n ; i++){
            for(int j = 1 ; j<=i ; j++){
                if ((i+j)% 2 == 0 ){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }

            }
            System.out.println();
        }
    }


    // Butterfly Pattern

    public static void butterfly(int n){
        for(int i = 1; i<=n ; i++){
            //1
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            for(int k = 1;k<=(n*2-(i*2)); k++){
                System.out.print(" ");
            }
            for (int m = 1 ; m<=i ; m++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int t = n ; t>=1 ; t--){
            for(int s = 1; s<=t ;s++ ){
                System.out.print("*");
            }
            for(int h = 1 ; h<=(n*2-t*2); h++){
                System.out.print(" ");
            }
            for (int a = 1; a<=t ; a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Butterfly ends

    

    // SolidRhombus function
    public static void SolidRhombus(int n){
        for (int i =1 ; i<=n ; i++){
            for(int j =1; j<=(n-i); j++ ){
                System.out.print(" ");
            }
            for(int k =1 ; k<=n ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // SolidRhombus function ends




    public static void holloRhombus(int n){
        for(int i = 1 ;i<=n ; i++){
            for (int j = 1 ; j<=(n-i) ; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=n ; k++){
                if (i == 1 || i == n || k==1 || k == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }




    // Diamond
    public static void diamond(int n){
        for(int i =0 ; i< n ; i++){
            for (int j = 1 ; j<= (n-i-1) ; j++){
                System.out.print(" ");
            }
            for (int k = 1 ; k<=(i*2 +1) ; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int m = 0;m < n ; m++){
            for (int p = 0 ; p< m ; p++ ){
                System.out.print(" ");
            }
            for(int t =0 ; t< (2*n -2*m - 1); t++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Diamond ends here




    public static void main(String args[]){
        // hollowRect(5,5);
        // Pyramid(4);
        // NumPyramid(5);
        // floyd(5);
        // zeroOne(5);
        // butterfly(4);
        // SolidRhombus(3);
        // holloRhombus(7);
        // diamond(6);
    }
}
