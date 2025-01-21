package SearchingSorting;

public class selectionSort {
    public static void selectionSort(int numbers[]){
        int n = numbers.length;
        for(int i=0; i<=n-2; i++){
            int minPos = i;
            for(int j=i+1; j<=n-1; j++){
                if(numbers[minPos] > numbers[j]){
                    minPos = j;
                }
            }
            // swap
            int temp = numbers[minPos];
            numbers[minPos] = numbers[i];
            numbers[i] = temp; 
        }
        for(int k=0; k<n; k++){
            System.out.print(numbers[k]+" ");
        }
    }
    public static void main(String args[]) {
        int numbers[] = {5,4,3,2,1};
        selectionSort(numbers);
    }
}
