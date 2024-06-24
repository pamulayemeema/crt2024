A company wishes to provide cab service for their N employees. The employees have distance ranging from 0 to N-1. The company has calculated the total distance from an employee’s residence to the company, considering the path to be followed by the cab is a straight path. The distance of the side of the company is represented with a negative sign. The distance for the employees who live to the right side of the company is represented with a positive sign. The cab will be allotted a range of distance. The company wishes to find the distance for the employees who live within the particular distance range. Write an algorithm to find the distance for the employees who live within the distance range.

Input Format

The first line of the input consists of three space-separated integers-num, start and end representing the size of the list (N); the starting value of the range: and the ending value of the range, respectively. The second line of the input consists of N space-separated integers representing the distances of the employees from the company.

Constraints

1<=n<=10^7

Output Format

Print space-separated integers representing the distance for employees whose distance lies within the given range else return -1.

Sample Input 0

6 30 50
29 38 12 48 39 55
Sample Output 0

38 48 39
Explanation 0

There are three employees with distances 38, 48 and 39 whose distance from the office lies within the given range.

Sample Input 1

8 22 56
12 44 21 55 87 45 66 10
Sample Output 1

44 55 45


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sr=s.nextInt();
        int er=s.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(i=0;i<n;i++){
            if(a[i]>=sr && a[i]<=er)
                System.out.print(a[i]+" ");
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
