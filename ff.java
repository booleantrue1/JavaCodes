import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,n=0,i=0,j=0;
int d[];
int e[];
n=Integer.parseInt(b.readLine());
d=new int[n];
e=new int[n];
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=c.countTokens();
for(i=0;i<m;i++)
d[i]=Integer.parseInt(c.nextToken());
for(j=1;j<=m;j++)
{
for(i=0;i<m;i++)
{
if(j==d[i])
e[j-1]=i+1;
}
}
for(i=0;i<m;i++)
{
System.out.print(e[i]);
System.out.print(" ");
}
}
}