Print the pattern

Input Format

Read n value

Constraints

1<=n<=10^7

Output Format

Print the pattern

Sample Input 0

5
Sample Output 0

* 
* * * 
* * * * * 
* * * * * * * 
* * * * * * * * *
Sample Input 1

10
Sample Output 1

* 
* * * 
* * * * * 
* * * * * * * 
* * * * * * * * * 
* * * * * * * * * * * 
* * * * * * * * * * * * * 
* * * * * * * * * * * * * * * 
* * * * * * * * * * * * * * * * * 
* * * * * * * * * * * * * * * * * * * 



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i=1,j;
        n=s.nextInt();
        while(i<=n){
         for(j=1;j<=(i*2)-1;j++)
         {
            System.out.printf("* ");
         }
         System.out.printf("\n");
         i++;
        }
    }
}
