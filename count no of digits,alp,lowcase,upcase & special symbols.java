import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        int c1=0,c2=0,c3=0,c4=0,c5=0;
      for(int i=0;i<s1.length();i++)
      {
          char ch=s1.charAt(i);
        if(Character.isLetter(ch))
        {
            c1++;
           // System.out.println(c1);
            if(Character.isUpperCase(ch))
            {
            c2++;
           // System.out.println(c2);
            }
            else
            {
                c3++;
               // System.out.println(c3);
            }
        }
        else if(Character.isDigit(ch))
        {
            c4++;
             //System.out.println(c4);
        }
        else
        {
            c5++;
             //System.out.println(c5);
        }
      }
      System.out.println(c1+" "+c2+" "+c3+" "+c4+" "+c5);
      
      
    }
}

+++++++++++++++++++++++++++++++++++++++
WSEDRFTawsedrftg12345!@#$%^&*(
16 7 9 5 9
