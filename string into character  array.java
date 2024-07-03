toCharArray() :
_______________________
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String s1="java lang";
       System.out.println(s1);
       char s2[]=s1.toCharArray();
       System.out.println(Arrays.toString(s2));
       for(int i=0;i<s2.length;i++)
       {
           System.out.print(s2[i]);
       }
    }
}

java lang
[j, a, v, a,  , l, a, n, g]
java lang
