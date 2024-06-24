Write a program to find the element of maximum value in each row.

Input Format

The first input corresponds to the number of rows. The second input corresponds to the number of columns. The third input corresponds to the elements of the 2D array.

Constraints

1<=n<=10^7

Output Format

The output corresponds to the maximum element in each row.

Sample Input 0

3
3
1 4 9
3 5 1
2 8 5
Sample Output 0

9
5
8
Sample Input 1

4
3
8 1 7
3 4 5
6 9 3
2 2 2
Sample Output 1

8
5
9
2



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int i,j;
        int a[][]=new int[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
               a[i][j]=s.nextInt();
            }
        }
        i=0;
        int max=0;
        int r[]=new int[m];
        while(i<m){
            for(j=0;j<n;j++){
                if(max<a[i][j])
                    max=a[i][j];
            }
            r[i]=max;
            i++;
            max=0;
        }
        for(i=0;i<m;i++){
            System.out.printf("%d\n",r[i]);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
