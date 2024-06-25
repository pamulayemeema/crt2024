Printing Stars in Hollow Left Triangle Shape

Input Format

Read n value

Constraints

1<=n<=10^7

Output Format

Printing Stars in Hollow Left Triangle Shape

Sample Input 0

5
Sample Output 0

* 
* * 
*   * 
*     * 
* * * * * 
Sample Input 1

7
Sample Output 1

* 
* * 
*   * 
*     * 
*       * 
*         * 
* * * * * * * 




  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i,j;
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
        for(j=1;j<=i;j++)
        {
         if(j==1 || i==n || i==j)
            System.out.printf("* ");
        else
            System.out.printf("  ");
        }
         System.out.printf("\n");
        }
    }
}
