Mr.Kumar went to purchase stationary items for his office. He asked the shopkeeper for a discount. The shopkeeper said that if he purchases more than 200 quantity of the item, then a discount of 20% can be applied on the total bill amount, excluding the GST. Get the Quantity and price per item as an input and calculate and tell whether Mr.Kumar is eligible for the discount and what would be the net amount he has to pay after the discount. Take the GST at 18%. Net Amount = Total bill amount after discount + GST

Input Format

Enter quantity Enter price per unit

Constraints

1<=n<=10^7

Output Format

Print the output

Sample Input 0

100
5
Sample Output 0

Quantity Ordered 100
Price per item is Rs.5
Total Amount = Rs.500
GST - Rs.90.0
Net Amount Payable is Rs.590.0
Sample Input 1

350
20
Sample Output 1

Quantity Ordered 350
Price per item is Rs.20
Total Amount = Rs.7000
Discount Earned = Rs.1400.0
Amount after Discount - Rs.5600.0
GST - Rs.1008.0
Net Amount Payable is Rs.6608.0


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int q,p;
        q=s.nextInt();
        p=s.nextInt();
        System.out.println("Quantity Ordered "+q);
        System.out.println("Price per item is Rs."+p);
        int a=(q*p);
        System.out.println("Total Amount = Rs."+a);
         float g=(float)a*18/100;
        if(q>200)
        {
          float d=(float)a*20/100;
            System.out.printf("Discount Earned = Rs.%.1f\n",d);
            System.out.println("Amount after Discount - Rs."+(float)(a-d));
            float g1=(a-d)*18/100;
             System.out.println("GST - Rs."+g1);
                    System.out.println("Net Amount Payable is Rs."+(a-d+g1));
        }
        else
        {
         
        System.out.println("GST - Rs."+g);
        System.out.println("Net Amount Payable is Rs."+(a+g));
        }    
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
