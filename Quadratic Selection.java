There are four quadrants, numbered from 1 to 4, as shown in the diagram below:image

For example, the point A, which is at coordinates (12,5) lies in quadrant 1 since both its x and y values are positive, and point B lies in quadrant 2 since its x value is negative and its y value is positive.

Your job is to take a point and determine the quadrant it is in. You can assume that neither of the two coordinates will be 0.

Input Format

The first line of input contains the integer x.

The second line of input contains the integer y.

Constraints

−1000≤ x,y ≤1000 x≠0 y≠0

Output Format

Output the quadrant number 1, 2, 3

or 4 for the point (x, y).

Sample Input 0

4 5
Sample Output 0

1


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b;
        a=s.nextInt();
        b=s.nextInt();
        if(a>0 && b>0)
            System.out.println("1");
        else if(a<0 && b>0)
            System.out.println("2");
        else if(a<0 && b<0)
            System.out.println("3");
        else
            System.out.println("4");
           
           
           /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
