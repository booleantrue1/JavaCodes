import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int turns=0,t=0,p=0,f=0,n=0,j=0,i=0;
String s,r;
s=b.readLine();
for(i=0;i<100;i++)
{
p=s.length();
for(j=0;j<p;j++)
{
n=Integer.parseInt(s.substring(j,j+1));
t+=n*n;
}
if(t==1)
{
f=1;
turns=i+1;
break;
}
s=String.valueOf(t);
t=0;
}
if(f==1)
System.out.print(turns);
else
System.out.print("-1");
}
}