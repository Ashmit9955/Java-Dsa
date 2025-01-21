package SearchingSorting;
import java.util.*;
public class inbuiltsortreverse {
    public static void main(String args[]){
        Integer num[] = {5,0,1,2,3};
        Arrays.sort(num,Collections.reverseOrder());
        for(int i = 0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
    }
}
