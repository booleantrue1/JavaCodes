import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,j=0,t=0,p=0,i=0;
String s;
p=Integer.parseInt(b.readLine());
int d[]=new int[p];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<p;i++)
d[i]=Integer.parseInt(c.nextToken());
for(i=0;i<p-1;i++)
{
for(j=i+1;j<p;j++)
{
if(d[j]<d[i])
{
t=d[i];
d[i]=d[j];
d[j]=t;
k++;
}
}
}
if(k<=p)
System.out.print("YES");
else
System.out.print("NO");
}
}