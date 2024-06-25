Print the pattern

Input Format

Read n value

Constraints

1<=n<=10^7

Output Format

print the pattern

Sample Input 0

10
Sample Output 0

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * * * 
* * * * * * * * 
* * * * * * * * * 
* * * * * * * * * * 
* * * 
* * * 
* * * 
* * * 
* * * 
* * * 
* * * 
* * * 
* * * 
Sample Input 1

15
Sample Output 1

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * * * 
* * * * * * * * 
* * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * * 
* * * * * * * * * * * * 
* * * * * * * * * * * * * 
* * * * * * * * * * * * * * 
* * * * * * * * * * * * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 





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
            System.out.printf("* ");
        }
        System.out.printf("\n");
        }
        for(i=1;i<n;i++)
        {
        for(j=0;j<n/3;j++)
        {
            System.out.printf("* ");
        }
        System.out.printf("\n");
        }
    }
}
