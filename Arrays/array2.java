package Arrays;

public class array2 {

    public static void update(int marks[] , int nonchangable) {
        nonchangable = 10;
        for(int i =0 ; i<marks.length ; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){
        int marks[] = {97,98,99};
        for(int i =0; i < marks.length ; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        int nonchangable = 5;
        update(marks, nonchangable);
        System.out.println(nonchangable); // the value 10 in function didnt work but why
        for(int k = 0; k< marks.length ; k++){
            System.out.print(marks[k]+" ");
        }
    }
}
