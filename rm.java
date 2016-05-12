import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int A=0,B=0,m=0,n=0,i=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
int x[]=new int[m];
for(i=0;i<m;i++)
x[i]=Integer.parseInt(c.nextToken());
Arrays.sort(x);
s=b.readLine();
StringTokenizer u=new StringTokenizer(s);
m=Integer.parseInt(u.nextToken());
int y[]=new int[m];
for(i=0;i<m;i++)
y[i]=Integer.parseInt(u.nextToken());
Arrays.sort(y);
s=b.readLine();
StringTokenizer v=new StringTokenizer(s);
m=Integer.parseInt(v.nextToken());
int z[]=new int[m];
for(i=0;i<m;i++)
z[i]=Integer.parseInt(v.nextToken());
Arrays.sort(z);
s=b.readLine();
StringTokenizer w=new StringTokenizer(s);
A=Integer.parseInt(w.nextToken());
B=Integer.parseInt(w.nextToken());
m=x.length;
n=y.length;
System.out.print(Math.sqrt((Math.pow(x[m-1],2)/((double)(A*z[0])/(B*y[n-1])+1))));
}
}