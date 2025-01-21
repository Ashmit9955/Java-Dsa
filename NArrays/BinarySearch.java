package NArrays;

import java.util.*;
public class BinarySearch {
    public static int BinSearch(int marks[] , int key){
        int start = 0;
        int end = marks.length -1;
        int mid  = (start+end)/2;
        while(start<=end){
            if(marks[mid] == key){
                return mid;
            }
            if(marks[mid] < key){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int marks[] = {2,4,6,8,10,12,14};
        System.out.println(BinSearch(marks,10));
    }
}
