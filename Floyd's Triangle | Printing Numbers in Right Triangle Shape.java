Floyd's Triangle | Printing Numbers in Right Triangle Shape

Input Format

Read n value

Constraints

1<=n<=10^7

Output Format

Floyd's Triangle | Printing Numbers in Right Triangle Shape

Sample Input 0

6
Sample Output 0

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 
Sample Input 1

9
Sample Output 1

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 
22 23 24 25 26 27 28 
29 30 31 32 33 34 35 36 
37 38 39 40 41 42 43 44 45




import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i,j,a=1;
        n=s.nextInt();
        for(i=1;i<=n;i++){
        for(j=1;j<=i;j++){
            System.out.printf("%d ",a);
                a++;
        }
        System.out.printf("\n");
        }
    }
}



