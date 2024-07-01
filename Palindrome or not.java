import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        String s2="";
        int i;
        
        for(i=s1.length()-1;i>=0;i--)
        {
            s2=s2+s1.charAt(i);
        }
        if(s1.equals(s2))
        System.out.println("palindrime");
        else
        System.out.println("Not palindrome");
    }
}


madam
palindrome

dfghj
Not palindrome
