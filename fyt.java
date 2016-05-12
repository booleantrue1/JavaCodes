import java.io.*;
import java.text.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0,max=-100000000,h=0,w=0,j=0,k=0;
String s;
int d[][];
n=Integer.parseInt(b.readLine());
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
h=Integer.parseInt(c.nextToken());
w=Integer.parseInt(c.nextToken());
d=new int[h+2][w+2];
for(j=0;j<h+2;j++)
{
d[j][0]=0;
d[j][w+1]=0;
}
for(j=0;j<w+2;j++)
{
d[0][j]=0;
d[h+1][j]=0;
}
for(j=1;j<h+1;j++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(k=1;k<w+1;k++)
d[j][k]=(Integer.parseInt(z.nextToken()))+(int)Math.max(Math.max(d[j-1][k],d[j-1][k-1]),d[j-1][k+1]);
}
for(j=1;j<w+1;j++)
if(d[h][j]>max)
max=d[h][j];
System.out.println(max);
max=-100000000;
}
}
}