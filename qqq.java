import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int x=0,y=0,z=0,j=0,k=0,i=0;
int d[]=new int[3];
int e[]=new int[3];
int g[]=new int[3];
String p,q,r;
p=b.readLine();
StringTokenizer c=new StringTokenizer(p);
d[0]=Integer.parseInt(c.nextToken());
d[1]=Integer.parseInt(c.nextToken());
d[2]=Integer.parseInt(c.nextToken());
q=b.readLine();
StringTokenizer v=new StringTokenizer(q);
e[0]=Integer.parseInt(v.nextToken());
e[1]=Integer.parseInt(v.nextToken());
e[2]=Integer.parseInt(v.nextToken());
r=b.readLine();
StringTokenizer u=new StringTokenizer(r);
g[0]=Integer.parseInt(u.nextToken());
g[1]=Integer.parseInt(u.nextToken());
g[2]=Integer.parseInt(u.nextToken());
x=d[0]+d[1]+d[2];
y=e[0]+e[1]+e[2];
z=g[0]+g[1]+g[2];
k=(x>y)?((x>z)?x:z):((y>z)?y:z);
for(i=k+1;i<300004;i++)
{
d[0]=i-d[1]-d[2];
e[1]=i-e[0]-e[2];
g[2]=i-g[0]-g[1];
if(i==(d[0]+e[0]+g[0]))
if(i==(d[1]+e[1]+g[1]))
if(i==(d[2]+e[2]+g[2]))
if(i==(d[0]+e[1]+g[2]))
if(i==(d[2]+e[1]+g[0]))
break;
}
System.out.print(d[0]+" "+d[1]+" "+d[2]+"\n"+e[0]+" "+e[1]+" "+e[2]+"\n"+g[0]+" "+g[1]+" "+g[2]);
}
}





















