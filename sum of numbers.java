Write a program to print the sum of the given numbers. The values must be scanned until the user enters -1 as value.

Input Format

Input consists of a list of integers.

Constraints

1<=n<=10^7

Output Format

The output consists of the sum of the given integers.

Sample Input 0

1
2
3
4
-1
Sample Output 0

10
Sample Input 1

5
8
3
4
6
2
-1
Sample Output 1

28

=======using while-loop======================
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,n,sum=0;
        
        while(true){
            n=s.nextInt();
            if(n==-1)
                break;
            else
                sum=sum+n;
        }
        System.out.println(sum);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

========using for-loop========
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i, s1=0;
        for(i=0; ;)
        {
            
            n=s.nextInt();
            if(n==-1)
                break;
            else
            s1=s1+n;
            
        }
        System.out.println(s1);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
