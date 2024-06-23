Write a program to check whether the given number is an Armstrong number or not. Armstrong Number:abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + .... where n represents the number of digits

Input Format

Read a no

Constraints

1<=n<=10^7

Output Format

Print "Yes" if armstrong no else print "No"

Sample Input 0

153
Sample Output 0

Yes
Sample Input 1

120
Sample Output 1

No
Sample Input 2

1253
Sample Output 2

No
Sample Input 3

1634
Sample Output 3

Yes



import java.io.*;
import java.util.*;
import java.lang.*;
public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,sum=0,d;
        n=s.nextInt();
        int t=n;
       //int r=log10(n)+1;
        int r = String.valueOf(n).length();
        while(n>0)
        {
    
            d=n%10;
            sum=sum+(int)Math.pow(d,r);
            n=n/10;
            
        }
        if(t==sum)
            System.out.println("Yes");
        else
            System.out.println("No");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
