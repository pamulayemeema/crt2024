import java.util.*;
public class Test12345
{
  public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Integer n=s.nextInt();
Integer a[]=new Integer[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
ArrayList<Integer>a1=new ArrayList<Integer>(Arrays.asList(a));
for(int i=0;i<a1.size()-1;i++)
{
for(int j=i+1;j<a1.size();j++)
{
if(a1.get(i)==a1.get(j))
{
a1.remove(j);
}
}
}
System.out.println(a1);
}
}



6
1 2 3 2 1 4
[1, 2, 3, 4]


