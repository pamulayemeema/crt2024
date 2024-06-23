Write a program to check whether the given number is prime or not, If number is prime, find the square root of the number else print given number is not a prime number.

Input Format

Read a number

Constraints

1<=n<=10^7

Output Format

Print output

Sample Input 0

8
Sample Output 0

8 is not a prime no
Sample Input 1

7
Sample Output 1

2.65

 


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        for(int i=2;i<n;i++){
            if(n%i==0)
                c++;
        }
        if(c==0){
            float d=(float)Math.sqrt(n);
            System.out.printf("%.2f",d);
        }
        else
            System.out.printf("%d is not a prime no",n);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
