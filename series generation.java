Write a program to generate the following series 7, 5, 8, 6, 9….

Input Format

Read n value

Constraints

1<=n<=10^7

Output Format

Print series

Sample Input 0

5
Sample Output 0

7 5 8 6 9
Sample Input 1

10
Sample Output 1

7 5 8 6 9 7 10 8 11 9


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,m=7,i;
        n=s.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.printf("%d ",m);
            if(i%2==0)
                m=m-2;
            else if(i%2!=0)
                m=m+3;
        }
       /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
