import java.util.*;
import java.io.*;
class j
{
public static void main (String a[])throws IOException 
{
BufferedReader f = new BufferedReader(new FileReader("input.txt"));
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
int k=0,n=0,t=0,p=0,i=0;
String s;
s=f.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
int d[]=new int[2*n];
s=f.readLine();
StringTokenizer e=new StringTokenizer(s);
for(i=0;i<n;i++)
{
d[i]=Integer.parseInt(e.nextToken());
d[n+i]=d[i];
}
for(i=k-1;i<2*n;i++)
{
if(d[i]==1)
{
out.print(i%n+1);
break;
}
}
out.close();
}
}