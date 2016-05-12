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
s=f.readLine();
StringTokenizer d=new StringTokenizer(s);
for(i=0;i<n;i++)
{
p=Integer.parseInt(d.nextToken());
if(p>=3*k)
t+=p-3*k;
else
t+=p%k;
}
out.print(t);
out.close();
}
}