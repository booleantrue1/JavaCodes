import java.io.*;
import java.util.*;
public class j
{
public static void main (String a[])throws IOException 
{
BufferedReader f = new BufferedReader(new FileReader("input.txt"));
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
int p=-1,i=0,h=0,t=0,j=0,m=0,n=0;
String s,r="\0";
n=Integer.parseInt(f.readLine());
n=2*n;
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
if(d[j]>d[i])
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
for(i=0;i<n-1;i+=2)
{
if(d[i]==d[i+1])
r+=((e[i]+1)+" "+(e[i+1]+1))+"\n";
else
{
out.print(p);
out.close();
System.exit(0);
}
}
out.print(r.trim());
out.close();
System.exit(0);
}
}