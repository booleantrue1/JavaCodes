import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0;
String s;
n=Integer.parseInt(b.readLine());
int d[]=new int[n];
for(i=0;i<n;i++)
{
s=b.readLine();
if(s.startsWith("miao.")&&s.endsWith("lala."))
System.out.println("OMG>.< I don't know!");
else
{
if(s.startsWith("miao."))
System.out.println("Rainbow's");
else
{
if(s.endsWith("lala."))
System.out.println("Freda's");
else
System.out.println("OMG>.< I don't know!");
}
}
}
}
}