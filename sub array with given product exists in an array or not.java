import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int a[]=new int[n];
       int i,j;
       for( i=0;i<n;i++)
       {
           a[i]=s.nextInt();
           
       }
       int k=s.nextInt();
      
       for( i=0;i<n;i++)
       {
          int res=1;
           for( j=i;j<n;j++)
           {
              res=res*a[j];
              if(k==res){
              System.out.print("Yes");
                
              return;
              }
           }
           
       }
       if(i==n)
         System.out.print("No");
    }
}



5
1 2 3 4 5
6
Yes
