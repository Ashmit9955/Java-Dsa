package NArrays;
import java.sql.SQLOutput;
import java.util.*;
public class LinearSearch1{
    public static int linearSearch(int marks[] , int key){
        for(int i =0; i<marks.length; i++){
            if(marks[i] == key ) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int marks[] = {1,2,3,4,5,6};
        int key = 5;
        System.out.println(linearSearch(marks, key));
    }
}
