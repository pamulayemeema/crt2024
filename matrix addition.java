Write a program for Matrix Addition

Input Format

Enter row size Enter column size Enter elements for first matrix line by line Enter elements for second matrix line by line

Constraints

1<=n<=10^7

Output Format

Addition of a matrix

Sample Input 0

2
2
1
2
3
4
1
2
3
4
Sample Output 0

2 4
6 8
Sample Input 1

2
3
1
2
3
4
5
6
6
5
4
3
2
1
Sample Output 1

7 7 7
7 7 7



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int a[][]=new int[m][n];
        int b[][]=new int[m][n];
        int i,j;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                b[i][j]=s.nextInt();
            }
        }
        int s1[][]=new int[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                s1[i][j]=a[i][j]+b[i][j];
                System.out.print(s1[i][j]+" ");
            }
            System.out.println();
        }
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
