import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,n=0,k=0,v=0,w=0,t=0,i=0,m=0;
String s,u="\0";
String p[];
int d[][];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
d=new int[m][n];
int x[]=new int[m];
int y[]=new int[n];
p=new String[k];
for(j=0;j<m;j++)
{
x[j]=j+1;
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<n;i++)
{
if(j==0)
y[i]=i+1;
d[j][i]=Integer.parseInt(z.nextToken());
}
}
for(i=0;i<k;i++)
{
p[i]=b.readLine();
StringTokenizer y1=new StringTokenizer(p[i]);
u=y1.nextToken();
v=Integer.parseInt(y1.nextToken());
w=Integer.parseInt(y1.nextToken());
if(u.compareTo("c")==0)
{
t=y[v-1];
y[v-1]=y[w-1];
y[w-1]=t;
}
if(u.compareTo("r")==0)
{
t=x[v-1];
x[v-1]=x[w-1];
x[w-1]=t;
}
if(u.compareTo("g")==0)
System.out.println(d[x[v-1]-1][y[w-1]-1]);
}
}
}