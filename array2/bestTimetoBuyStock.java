package array2;

public class bestTimetoBuyStock {
    public static int stockMarket(int numbers[]){
        int bp = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<numbers.length; i++){
            if (bp < numbers[i]){
                int Profit = numbers[i] - bp;
                if (Profit>maxProfit){
                    maxProfit = Profit;
                }
            }else{
                bp = numbers[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int numbers[] = {7,1,5,3,6,4};
        System.out.println(stockMarket(numbers));
    }
}
