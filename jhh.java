import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,j=0,i=0;
String s=b.readLine(),r,t;
n=s.length();
if(n<3)
System.out.print("Just a legend");
else
{
for(i=n;i>0;i--)
{
r=s.substring(0,i);
if(s.endsWith(r))
{
t=s.substring(1,s.length()-1);
if(t.indexOf(r)>=0)
{
System.out.print(r);
System.exit(0);
}
}
}
System.out.print("Just a legend");
}
}
}