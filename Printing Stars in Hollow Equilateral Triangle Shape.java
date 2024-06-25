Printing Stars in Hollow Equilateral Triangle Shape

Input Format

Read n value

Constraints

1<=n<=10^7

Output Format

Printing Stars in Hollow Equilateral Triangle Shape

Sample Input 0

6
Sample Output 0

     * 
    * * 
   *   * 
  *     * 
 *       * 
* * * * * * 
Sample Input 1

9
Sample Output 1

        * 
       * * 
      *   * 
     *     * 
    *       * 
   *         * 
  *           * 
 *             * 
* * * * * * * * * 




import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i,j,k;
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
        for(k=i;k<=n-1;k++)
            System.out.printf(" ");
        for(j=1;j<=i;j++)
            if(i==n || j==1||i==j)
            System.out.printf("* ");
        else 
        {
            System.out.printf("  ");
        }
        System.out.printf("\n");
        }
    }
}
