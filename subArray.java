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
        for(int i=0;i<n;i++)
        {
           
           for(int j=0;j<n;j++)
           {
               for(int k=i;k<=j;k++)
               System.out.print(a[k]+" ");
                 System.out.println();
           }
        }
       
    }
}


3
1 2 3
1 
1 2 
1 2 3 

2 
2 3 


3 
