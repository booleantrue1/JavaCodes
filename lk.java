import java.io.*;
import java.util.*;
class j
{
public static void main (String a[])throws IOException 
{
BufferedReader f = new BufferedReader(new FileReader("input.txt"));
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
int k=0,i=0,t=0,j=0,m=0,n=0;
String s;
s=f.readLine();
StringTokenizer z=new StringTokenizer(s);
n=Integer.parseInt(z.nextToken());
k=Integer.parseInt(z.nextToken());
int d[]=new int[n];
int e[]=new int[n];
s=f.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
{
e[i]=i;
d[i]=Integer.parseInt(c.nextToken());
}
for(j=0;j<n-1;j++)
{
for(i=j+1;i<n;i++)
{
if(d[j]<d[i])
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
out.println(d[k-1]);
for(i=0;i<k;i++)
out.print(e[i]+1+" ");
out.close();
System.exit(0);
}
}