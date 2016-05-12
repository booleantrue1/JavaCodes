import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,k=0,p=0,j=0,i=0,f=0;
String s,r;
s=b.readLine();
f=s.length();
int d[]=new int[f-1];
d[0]=0;
for(i=0;i<f-1;i++)
{
if(i==0)
{
if(s.charAt(i)==s.charAt(i+1))
d[i]=1;
}
else
{
if(s.charAt(i)==s.charAt(i+1))
d[i]=d[i-1]+1;
else
d[i]=d[i-1];
}
}
n=Integer.parseInt(b.readLine());
for(i=0;i<n;i++)
{
r=b.readLine();
StringTokenizer c=new StringTokenizer(r);
k=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
if(k==1)
System.out.println(d[p-2]);
else
System.out.println(d[p-2]-d[k-2]);
}
}
}