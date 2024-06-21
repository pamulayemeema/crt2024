Write a program to print the sum of a given range of numbers

Input Format

Input consists of 2 integers. First input corresponds to the minimum value of the range. Second input corresponds to the maximum value of the range.

Constraints

1<=num1<=10^7

Output Format

The output is an integer which corresponds to the sum of range.

Sample Input 0

5
10
Sample Output 0

45
Sample Input 1

25
55
Sample Output 1

1240


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,m,i,s1=0;
        n=s.nextInt();
        m=s.nextInt();
         for(i=n;i<=m;i++)
         {
             s1=s1+i;
             
         }
        System.out.println(s1);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
