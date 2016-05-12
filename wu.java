import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,h=0,n=0,k=0,v=0,w=0,t=0,i=0,m=0;
String s,u="\0";
int p[];
int d[][];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
d=new int[m][n];
p=new int[k];
for(j=0;j<m;j++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<n;i++)
d[j][i]=Integer.parseInt(z.nextToken());
}
for(i=0;i<k;i++)
{
s=b.readLine();
StringTokenizer y=new StringTokenizer(s);
u=y.nextToken();
v=Integer.parseInt(y.nextToken());
w=Integer.parseInt(y.nextToken());
if(u.compareTo("c")==0)
{
for(j=0;j<m;j++)
{
t=d[j][v-1];
d[j][v-1]=d[j][w-1];
d[j][w-1]=t;
}
}
if(u.compareTo("r")==0)
{
for(j=0;j<n;j++)
{
t=d[v-1][j];
d[v-1][j]=d[w-1][j];
d[w-1][j]=t;
}
}
if(u.compareTo("g")==0)
{
p[h]=d[v-1][w-1];
h++;
}
}
for(i=0;i<h;i++)
System.out.println(p[i]);
}
}