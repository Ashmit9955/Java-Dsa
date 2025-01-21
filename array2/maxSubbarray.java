package array2;

public class maxSubbarray {
    public static void maxSubbarraySum(int numbers[]){
        int sum1 = 0;
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i<numbers.length ; i++){
            for(int j =0 ; j<numbers.length ; j++){
                for(int k = i; k<= j ; k++){
                    sum1 += numbers[k];
                }
                if( sum1 > maxNum) {
                    maxNum = sum1;
                    sum1 = 0;
                }
                sum1 = 0;
            }
        }
        System.out.println(maxNum);
    }

public static void fadanes(int numbers[]){
int ms = Integer.MIN_VALUE;
int cs = 0;

for(int i = 1; i<numbers.length ; i++){
    cs += numbers[i];
    if (cs<0){
        cs = 0;
    }
    ms = Math.max(ms,cs);
}
System.out.println(ms);
}



    public static void main(String args[]){
        int numbers[] = {-3,-2,6,-1,-3};  // 0 issue coming in both subbarray.java files but why
        maxSubbarraySum(numbers);
        fadanes(numbers);
    }
}