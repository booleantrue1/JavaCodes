import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int t=0,j=0,n=0,i=0;
int d[];
int e[];
String s;
n=Integer.parseInt(b.readLine());
d=new int[n];
e=new int[n];
s=b.readLine();
if(n==1)
System.out.print("1");
else
{
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
{
d[i]=Integer.parseInt(c.nextToken());
e[i]=i;
}
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(d[i]>d[j])
{
t=d[j];
d[j]=d[i];
d[i]=t;
t=e[j];
e[j]=e[i];
e[i]=t;
}
}
}
if(d[0]==d[1])
System.out.print("Still Rozdil");
else
System.out.print(e[0]+1);
}
}
}