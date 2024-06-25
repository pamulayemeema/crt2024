import java.util.*;
class HelloWorld {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[k-1]);
        
    }
}



5
3
23 62 72 22 12
23
