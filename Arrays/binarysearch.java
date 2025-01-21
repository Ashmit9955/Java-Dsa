package Arrays;

public class binarysearch {
    public static int binarySearch(int numbers[] , int key){
        int start = 0;
        int end = numbers.length - 1;
        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid] == key){
                return mid;
            }
            if (numbers[mid] > key){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){

        int numbers [] = {22,33,44,55,66,77,88};
        int key = 88;
        int result = binarySearch(numbers,key);
        System.out.println(result);
    }
}
