import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,k=0,f=0;
String s;
s=b.readLine();
s=s.replace(","," ");
StringTokenizer c=new StringTokenizer(s);
n=c.countTokens();
int d[]=new int[n];
for(i=0;i<n;i++)
d[i]=Integer.parseInt(c.nextToken());
Arrays.sort(d);
System.out.print(d[0]);
for(i=1;i<n;i++)
{
if(d[i]==d[i-1])
continue;
if(d[i]==d[i-1]+1)
{
k++;
f=1;
continue;
}
if(d[i]-d[i-1]>1)
{
if(k==0)
System.out.print(","+d[i]);
else
System.out.print("-"+d[i-1]+","+d[i]);
f=0;
}
k=0;
}
if(f==1)
System.out.print("-"+d[n-1]);
}
}