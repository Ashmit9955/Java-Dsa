public class TypePromotion {
    public static void main (String args[]) {
      //  char a = 'a';   // 97 in int
       // char b ='b';    // 98 in int
       // System.out.println(b-a);  // here b , a  automatically converts b and a into int


    //  char c = b - a;  
    // here (b-a) is now an int so we cant convert int value into char
    //  System.out.println(c);

    //  another example

    // short a = 5;
    // byte b = 25;
    // char c = 'c';
   // byte bt = a + b + c ;   // this gives an error that we cant convert int into byte
    //byte bt = (byte)(a + b + c) ;   //yaha pe type casting krke force krke int ko byte bna dia
    //System.out.println(bt);   // no logic of this answer...-127


    // now 2nd rule of long float and double

    // int a = 10;
    // float b = 20.35f;
    // long c = 25;
    // double d = 30;
    //int ans = a+b+c+d;  // error as we cant convert double into int
    //double ans = a+b+c+d;
    //System.out.println(ans);  // ans of double type data 

    // another example
    //byte b =5;
    //b = b*2;   // jab hm yaha b*2 krte h to java is andar wale b ko int bnadeta h so type conversion byte into int nahi hoga
    
   // byte b = 5;
   // byte a = b*2;
   // System.out.println(a);  // same error as above

//    To solve the above error we do type casting

        // byte b = 5;
        // byte a = (byte) (b*2);  // typecasting here
        // System.out.println(a);

        

    }
}
