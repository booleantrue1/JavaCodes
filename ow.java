import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String r,s;
int n=0,j=0,i=0,m=0;
int d[];
r=b.readLine();
StringTokenizer c=new StringTokenizer(r);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
d=new int[2*m+1];
s=b.readLine();
StringTokenizer e=new StringTokenizer(s);
for(i=0;i<2*m+1;i++)
d[i]=Integer.parseInt(e.nextToken());
for(i=1;i<2*m+1;i+=2)
{
if(d[i]-1>d[i-1]&&d[i]-1>d[i+1])
{
d[i]--;
j++;
}
if(j==n)
break;
}
for(i=0;i<2*m+1;i++)
System.out.print(d[i]+" ");
}
}