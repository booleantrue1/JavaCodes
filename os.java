import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader f = new BufferedReader(new FileReader("input.txt"));
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
int i=0,n=0,min=1000000;
String s;
n=Integer.parseInt(f.readLine());
int d[]=new int[n];
int e[]=new int[n-1];
int g[]=new int[n-1];
e[0]=0;
g[0]=0;
s=f.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(c.nextToken());
if(d[0]>=0)
e[0]=1;
for(i=1;i<n-1;i++)
{
if(d[i]>=0)
e[i]=e[i-1]+1;
else
e[i]=e[i-1];
}
if(d[n-1]<=0)
g[n-2]=1;
for(i=n-2;i>0;i--)
{
if(d[i]<=0)
g[i-1]=g[i]+1;
else
g[i-1]=g[i];
}
for(i=0;i<n-1;i++)
if(e[i]+g[i]<min)
min=e[i]+g[i];
out.print(min);
out.close();
}
}