package Conditional;
public class subaarrays {
    public static void subArrays(int numbers[]){
        int sum1 = 0;
        for(int i =0; i<numbers.length ; i++){
            for (int j = 0; j<numbers.length; j++){
                sum1 = 0;
                for(int k = i ; k<= j ; k++){
                    System.out.print(numbers[k]+" ");
                    sum1+=numbers[k];
                }
                System.out.println();
                System.out.println("Sum: "+sum1);
                
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10};
        subArrays(numbers);
    }
}
