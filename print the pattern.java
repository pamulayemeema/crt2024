Print the pattern

Input Format

Read no of rows

Constraints

1<=n<=10^7

Output Format

print pattern

Sample Input 0

5
Sample Output 0

*****
 ****
  ***
   **
    *
Sample Input 1

10
Sample Output 1

**********
 *********
  ********
   *******
    ******
     *****
      ****
       ***
        **
         *
Sample Input 2

13
Sample Output 2

*************
 ************
  ***********
   **********
    *********
     ********
      *******
       ******
        *****
         ****
          ***
           **
            *


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,j,k,n;
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
        for(k=1;k<=i-1;k++)
            System.out.printf(" ");
        for(j=n;j>=i;j--)
        {
            System.out.printf("*");
        }
        System.out.printf("\n");
        }
    }
}
