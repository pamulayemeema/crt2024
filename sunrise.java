// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int c=1;
        int s1=a[0];
        for(int i=1;i<n;i++)
        {
           if(s1<a[i]){
               c++;
           }
        
        }
        System.out.println(c);
        
}
}


5
6 2 7 4 10
3
