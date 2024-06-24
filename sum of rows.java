Write a program to find the sum of elements in each row.

Input Format

Integers correspond to the size of rows and columns. Read elements of the array

Constraints

1<=n<=10^7

Output Format

Sum of each row in seperate line

Sample Input 0

3
3
1 2 3
7 3 1
7 4 1
Sample Output 0

6
11
12
Sample Input 1

4
3
1 2 3
4 5 6
7 8 9
4 3 8
Sample Output 1

6
15
24
15



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
        i=0;
        int r[]=new int[m];
        int s1=0;
        while(i<m){
          for(j=0;j<n;j++){
              s1=s1+a[i][j];
          }
            r[i]=s1;
            i++;
            s1=0;
        }
        for(i=0;i<m;i++){
            System.out.printf("%d\n",r[i]);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
