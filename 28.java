import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,m=0,i=0;
String s,r;
s=b.readLine();
for(i=0;;i++)
{
m=s.length();
if(m==1)
{
System.out.print(i);
System.exit(0);
}
else
{
if(s.charAt(m-1)=='0')
s=s.substring(0,m-1);
else
{
if(s.indexOf('0')<0)
s=("1"+s.replace('1','0'));
else
{
n=s.lastIndexOf('0');
r=s.substring(0,n);
s=s.substring(n+1);
s=(r+"1"+s);
}
}
}
}
}
}