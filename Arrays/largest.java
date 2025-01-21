package Arrays;

public class largest {

    public static int biggest(int numbers[]){
        int key = Integer.MIN_VALUE;
        for(int i = 0; i< numbers.length ; i++){
            if (numbers[i] > key){
                key = numbers[i];
            }
        }
        return key;
    }

    public static void main(String args[]){
        int marks[] = {98,99,97,96,100,96,95};
        int result = biggest(marks);
        System.out.println(result);
    }
}
