import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader f = new BufferedReader(new FileReader("input.txt"));
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
int n=0,i=0,min=1000000,p=0,j=0,k=0;
n=Integer.parseInt(f.readLine());
String s;
int d[]=new int[n];
s=f.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(c.nextToken());
Arrays.sort(d);
for(i=0;i<n;i++)
{
for(;j<n;j++)
{
if(d[j]>2*d[i])
{
p=n-j+i;
if(p<min)
min=p;
break;
}
}
if(j==n)
break;
}
out.print((int)Math.min(i,min));
out.close();
}
}