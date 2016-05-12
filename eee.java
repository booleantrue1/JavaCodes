import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String s;
int p=0,n=0,i=0,k=0,t=0;
int d[];
n=Integer.parseInt(b.readLine());
d=new int[n];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
p=c.countTokens();
for(i=0;i<p;i++)
{
d[i]=Integer.parseInt(c.nextToken());
k+=d[i];
}
if(k%2==0)
{
for(i=0;i<p;i++)
if(d[i]%2==0)
t++;
}
else
{
for(i=0;i<p;i++)
if(d[i]%2!=0)
t++;
}
System.out.print(t);
}
}