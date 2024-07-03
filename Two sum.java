find the indexes of two elements whose sum is equal to the given sum .if the exist multiple solotions,print the minimum indices


import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
      // int sum=s.nextInt();
       int a[]=new int[n];
       int i,j;
       //int c=0;
       for(i=0;i<n;i++)
       {
           a[i]=s.nextInt();
       }
       int sum=s.nextInt();
       for(i=0;i<n-1;i++)
       {
           for(j=i+1;j<n;j++)
           {
               int r=a[i]+a[j];
               if(sum==r)
               {
                  System.out.println(i+" "+j);
                  return;
               }
           }
           
       }
           System.out.println(-1);
     
       
    }
}



5
2 9 13 21 54
63
1 4
