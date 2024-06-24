Andrew is a stock trader who trades in N selected stocks. He has calculated the relative stock price changes in the N stocks from the previous day stock prices. Now, his lucky number is K, so he wishes to invest in the particular stock that has Kth smallest relative stock value. Write an algorithm for Andrew to find the Kth smallest stock price out of the selected N stocks.

Input Format

The first line of the input consists of two space-separated integers – numOfStocks and valuek, representing the number of selected stocks (N) And the value K for which he wishes to find the stock price, respectively. The second line consists of N space-separated integers – stock1, stock2, ……, stock N representing the relative stock prices of the selected stocks.

Constraints

1<=n<10^7

Output Format

Print an integer representing the Kth smallest stock price of selected N stocks.

Sample Input 0

7 5
9 -3 8 -6 -7 18 10
Sample Output 0

9
Explanation 0

The sorted relative stock prices are [-7, -6, -3, 8, 9, 10, 18] So, the 5th smallest stock price is 9.

Sample Input 1

6 3
10 21 33 44 18 28
Sample Output 1

21



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int i;
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[k-1]);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
