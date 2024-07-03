methods:
     replace() 
     indexOf()
     lastIndexOf()



import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String s1="java  is simple language";
      System.out.println(s1.replace("simple","difficult"));
      System.out.println(s1.indexOf("i"));
      System.out.println(s1.lastIndexOf("i"));
    }
}

java  is difficult language
6
10
