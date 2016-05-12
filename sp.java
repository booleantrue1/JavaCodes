import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int x=0,y=0,min=-1,i=0,f=0,g=0,j=0,m=0,n=0,k=0,l=0,p=0;
String s;
s=b.readLine();
StringTokenizer y1=new StringTokenizer(s);
m=Integer.parseInt(y1.nextToken());
n=Integer.parseInt(y1.nextToken());
int d[][]=new int[m][n];
for(i=0;i<m;i++)
{
s=b.readLine();
for(j=0;j<n;j++)
d[i][j]=Integer.parseInt(s.substring(j,j+1));
}
s=b.readLine();
StringTokenizer x1=new StringTokenizer(s);
k=Integer.parseInt(x1.nextToken());
l=Integer.parseInt(x1.nextToken());
int e[][]=new int[k][l];
for(i=0;i<k;i++)
{
s=b.readLine();
for(j=0;j<l;j++)
e[i][j]=Integer.parseInt(s.substring(j,j+1));
}
for(x=-51;x<52;x++)
{
for(y=-51;y<52;y++)
{
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
if(i+x>=0&&i+x<k&&j+y>=0&&j+y<l)
p+=(long)d[i][j]*e[i+x][j+y];
}
}
if(p>min)
{
min=p;
f=x;
g=y;
}
p=0;
}
}
System.out.print(f+" "+g);
}
}