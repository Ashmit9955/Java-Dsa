package NArrays;

public class LargestInArray {
    public static int getlargest(int marks[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<marks.length; i++){
            if(marks[i] > largest){
                largest = marks[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int marks[] = {1,2,5,4,3};
        System.out.println("The largest element in the array is: "+ getlargest(marks));
    }
}
