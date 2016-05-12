import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int d[];
int r=0,i=0,j=0,n=0,w=0,p=0,k=0;
String s;
n=Integer.parseInt(b.readLine());
d=new int[n];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
p=c.countTokens();
for(i=0;i<p;i++)
d[i]=Integer.parseInt(c.nextToken());
for(j=0;j<p-1;j++)
{
for(i=j+1;i<p;i++)
{
if(d[j]<d[i])
{
w=d[j];
d[j]=d[i];
d[i]=w;
}
}
}
for(i=0;i<p;i++)
k+=d[i];
r=k/2;
k=0;
r++;
for(i=0;i<p;i++)
{
k+=d[i];
if(k>=r)
break;
}
System.out.print(i+1);
}
}