package SearchingSorting;

public class bubble {
    public static void bubble(int numbers[]){
        int n = numbers.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<(n-i-1); j++){
                // swap code
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(numbers[i]+" ");
        }
    }
    public static void main(String args[]) {
        int array[] = {95,34,39,22,18};
        bubble(array);
    }
}

