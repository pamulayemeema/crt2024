equalsIgnoreCase() :
-----------------------

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String s1=s.next();
       String s2=s.next();
       if(s1.equalsIgnoreCase(s2))
        System.out.println("Strings are same");
       else
        System.out.println("Strings are not same");
     
    }
}


wert
WERT
Strings are same
