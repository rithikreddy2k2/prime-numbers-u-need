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
                //then it is not  a prime number  ...
// here the i value starts from 2 , because it would take 1 as a prime no.
      outer: for (int i = 2;count!=n; i++) {
                for (int j = 2; j <i; j++) {        /*continue blocks ensures that next time the curser reaches the outer loop
                                                and presumes its work rathar than getting into the statements after 1st loop*/                        
                     if (i%j==0)
                        continue outer;         

                }
             System.out.println(i);
                count++;


            }
OUTPUT:
 Enter the number of prime numbers u need
50
50 prime numbers are printed below ....
just see....
2
3
5
7
11
13
17
19
23
29
31
37
41
43
47
53
59
61
67
71
73
79
83
89
97
101
103
107
109
113
127
131
137
139
149
151
157
163
167
173
179
181
191
193
197
199
211
223
227
229

        
        


    }
}
