

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x1,y1,x2,y2,x3,y3;
         x1=s.nextInt();
         y1=s.nextInt();
         x2=s.nextInt();
         y2=s.nextInt();
         x3=s.nextInt();
         y3=s.nextInt();
        float a=(float)(x1+x2+x3)/3,b=(float)(y1+y2+y3)/3;
        System.out.printf("%.1f\n%.1f",a,b);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
