import java.util.*;
public class prime_numbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,count=0;
        System.out.println("Enter the number of prime numbers u need");
        n=s.nextInt();

        System.out.println(n+" prime numbers are printed below ....");
        System.out.println("just see....");

        //as prime no. is only divisible by 1 and itself..
            //so if it is divisible by any of the number btw 2 and (number-1)
                //then it is not  a prime number else its a prime number ...

      outer: for (int i = 2;count!=n; i++) {
                for (int j = 2; j <i; j++) {
                    if (i%j==0)
                        continue outer;

                }
             System.out.println(i);
                count++;


            }

        
        


    }
}
