package Arrays;

public class pair {
    public static void pair(int numbers[]) {
        int totalPairs = 0;
        for(int i = 0; i< numbers.length; i++){
            for(int j = i+1 ; j< numbers.length ; j++){
                System.out.print("("+numbers[i] +","+ numbers[j]+")");
                totalPairs += 1;
            }
        }
        System.out.println();
        System.out.println(totalPairs);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        pair(numbers);
    }
}
