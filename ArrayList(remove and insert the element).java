-------------------------------------------------------
conver arraylist to array and remove the element
-----------------------------------------------------
import java.util.*;
public class Test1234
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
int pos=s.nextInt();
//int value=s.nextInt();
ArrayList<Integer>a1=new ArrayList<Integer>(Arrays.asList(a));
a1.remove(pos);
for(Integer r:a1)
{
System.out.print(r+" ");
}
}
}


javac Test1234.java

java Test1234
5
1 2 3 4 5
4
1 2 3 4

  
---------------------------------------------------------------
  convert arrayList to array and insert an element at particular position
  ----------------------------------------------------------------------------
  
import java.util.*;
public class Test1234
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
int pos=s.nextInt();
int value=s.nextInt();
ArrayList<Integer>a1=new ArrayList<Integer>(Arrays.asList(a));
a1.add(pos,value);
for(Integer r:a1)
{
System.out.print(r+" ");
}
}
}



javac Test123.java

java Test123
5
1 2 3 4 5
3
9
1 2 3 9 4 5
