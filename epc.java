import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0,f=0;
String s;
s=b.readLine();
n=s.length();
if(n<4)
{
System.out.print(s);
}
else
{
System.out.print(s.charAt(0));
for(i=1;i<n-3;i++)
{
if(s.charAt(i)=='d'&&s.charAt(i+1)=='o'&&s.charAt(i+2)=='t')
{
System.out.print(".");
i+=2;
}
else
{
if(s.charAt(i)=='a'&&s.charAt(i+1)=='t'&&f==0)
{
System.out.print("@");
i++;
f=1;
}
else
System.out.print(s.charAt(i));
}
}
if(i==n-3)
{
if(s.charAt(i)=='a'&&s.charAt(i+1)=='t'&&f==0)
System.out.print("@"+s.charAt(n-1));
else
System.out.print(s.charAt(i)+""+s.charAt(i+1)+""+s.charAt(i+2));
}
else
{
if(i==n-2)
System.out.print(s.charAt(i)+""+s.charAt(i+1));
else
System.out.print(s.charAt(i));
}
}
}
}