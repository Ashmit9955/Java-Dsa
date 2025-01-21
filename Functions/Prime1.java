package Functions;

public class Prime1 {

    public static boolean isPrime(int num){   
        
        if (num == 1){
            return false;
        }
        if (num ==2){
            return true;
        }
        
        for(int i = 2 ; i<= num-1 ; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    
    public static void main(String args[]) {

       boolean check =  isPrime(1);
       System.out.println(check);
    }
}
