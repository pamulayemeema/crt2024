Given below is the cross pattern has the shape of the mathematical cross sign (X).

Input Format

Read no of rows

Constraints

1<=n<=10^7

Output Format

Cross pattern has the shape of the mathematical cross sign (X).

Sample Input 0

5
Sample Output 0

*   *
 * * 
  *  
 * * 
*   *
Sample Input 1

10
Sample Output 1

*        *
 *      * 
  *    *  
   *  *   
    **    
    **    
   *  *   
  *    *  
 *      * 
*        *
Sample Input 2

8
Sample Output 2

*      *
 *    * 
  *  *  
   **   
   **   
  *  *  
 *    * 
*      *


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i,j;
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
        for(j=1;j<=n;j++){
         if(j==i || i+j==n+1){
             System.out.printf("*");
         }
         else 
             System.out.printf(" ");
         }
    
        System.out.printf("\n");
        }
    }
}
