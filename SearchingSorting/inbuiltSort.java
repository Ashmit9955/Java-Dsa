package SearchingSorting;
import java.util.Arrays;  // or also java.util.Arrays this would work
public class inbuiltSort {
    public static void main(String args[]){
        int arr[] = {4,3,5,2,1};
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int numbers[] = {11,66,55,77,33,22,99,00};
        Arrays.sort(numbers,0,4);
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        //printArr(arr);    whats this
    }
}
