Write a program to get a float value from the user and display it in the below-mentioned format. HINT: Use ceil() and floor() functions.

Input Format

Input consists of one float value.

Constraints

1<=n<10^7

Output Format

Output consists of one integer, its highest round off value and its lowest round off value.

Sample Input 0

54.5
Sample Output 0

54
55.0
54.0

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float a;
        a=s.nextFloat();
        
        System.out.printf("%d\n%.1f\n%.1f",(int)(a),Math.ceil(a),Math.floor(a));
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
