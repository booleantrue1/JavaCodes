import java.io.*;
import java.util.*;
class j
{
public static void main (String a[])throws IOException 
{
BufferedReader f = new BufferedReader(new FileReader("input.txt"));
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
int n=0,i=0,m=0,k=0,t=0;
String s;
n=Integer.parseInt(f.readLine());
int d[]=new int[3];
d[0]=0;
d[n-1]=1;
for(i=0;i<3;i++)
{
s=f.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
{
t=d[m-1];
d[m-1]=d[k-1];
d[k-1]=t;
}
}
for(i=0;i<3;i++)
if(d[i]==1)
{
out.print(i+1);
break;
}
out.close();
}
}