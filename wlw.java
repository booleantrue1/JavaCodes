import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    int n,k,maxm,t,j,i,p;
    t=Integer.parseInt(b.readLine());
    String s;
    for(k=0;k<t;k++)
    {
        s=b.readLine();
        if(s.length()==5&&(s.charAt(0)>='a'&&s.charAt(0)<='h')&&(s.charAt(1)>='1'&&s.charAt(1)<='8')&&(s.charAt(3)>='a'&&s.charAt(3)<='h')&&(s.charAt(4)>='1'&&s.charAt(4)<='8')&&(s.charAt(2)=='-'))
        {
           if(((Math.abs(s.charAt(0)-s.charAt(3))==2)&&(Math.abs(s.charAt(1)-s.charAt(4))==1))||((Math.abs(s.charAt(0)-s.charAt(3))==1)&&(Math.abs(s.charAt(1)-s.charAt(4))==2)))
           System.out.println("Yes");
           else
            System.out.println("No");
        }
        else
         System.out.println("Error");
    }
}
}
