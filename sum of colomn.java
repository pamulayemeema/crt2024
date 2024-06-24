Write a program to find the sum of elements in each column.

Input Format

Read size of rows and columns Read elements of the array

Constraints

1<=n<=10^7

Output Format

Print sum of each column in seperate line

Sample Input 0

3
3
3 5 1
7 3 2
0 54 2
Sample Output 0

10
62
5
Sample Input 1

3
4
1 2 3 4
5 6 7 8
9 0 3 5
Sample Output 1

15
8
13
17


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int a[][]=new int[m][n];
        int i,j;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }
        j=0;
        int r[]=new int[n];
        int s1=0;
        while(j<n){
            for(i=0;i<m;i++){
                s1=s1+a[i][j];
            }
            r[j]=s1;
            j++;
            s1=0;
        }
        for(j=0;j<n;j++){
           System.out.printf("%d\n",r[j]);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
