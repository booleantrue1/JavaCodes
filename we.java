import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,n=0,x=0,y=0,k=0,i=0,q=0;
String s;
int d[][];
n=Integer.parseInt(b.readLine());
d=new int[n][n];
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(j=0;j<n;j++)
d[i][j]=Integer.parseInt(c.nextToken());
}
for(i=0;i<n;i++)
{
for(k=0;k<n;k++)
{
for(j=0;j<n;j++)
{
x+=d[i][j];
y+=d[j][k];
}
if(y>x)
q++;
x=0;
y=0;
}
}
System.out.print(q);
}
}