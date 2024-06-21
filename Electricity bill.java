Electricity board has decided to charge rupees based on the units consumed by a particular home. If the units consumed is less than or equal to 200, the cost for one unit is 0.5. If the unit is less than or equal to 400, the cost for one unit is 0.65 and Rs.100 extra charge. If the unit is less than or equal to 600, the cost for one unit is 0.80 and Rs.200 extra charge. If the unit is greater than 600 the cost for one unit is 1.25 and Rs.425 extra charge. You need to now calculate the electricity bill based on the units consumed (given input).

Input Format

Input consists of one integer. This corresponds to the units consumed.

Constraints

1<=n<=10^7

Output Format

The output consists of one integer. This corresponds to the electricity bill in rupees.

Sample Input 0

200
Sample Output 0

Rs.100


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int u;
        
        u=s.nextInt();
        if(u<=200)
        { 
            double c1=0.5;
           double r=u*c1;
            System.out.printf("Rs.%.0f",r);
        }
        else if(u<=400)
        {
            double c2=0.65;
            double r=u*c2+100;
             System.out.printf("Rs.%.0f",r);
        }
        else if(u<=600)
        {
          double  c3=0.80;
           double r=u*c3+200;
             System.out.printf("Rs.%.0f",r);
        }
        else
        {
            double c4=1.25;
           double r=u*c4+425;
        System.out.printf("Rs.%.0f",r);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
