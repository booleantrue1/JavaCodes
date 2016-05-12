import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int x2=0,y1=0,y2=0,x1=0,n=0,j=0,k=0,p=1,m=0,i=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
int d[][]=new int[k+1][4];
int e[]=new int[k+1];
d[0][0]=0;
d[0][1]=0;
d[0][2]=n;
d[0][3]=m;
for(i=0;i<k;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
x1=Integer.parseInt(z.nextToken());
y1=Integer.parseInt(z.nextToken());
x2=Integer.parseInt(z.nextToken());
y2=Integer.parseInt(z.nextToken());
for(j=0;j<p;j++)
{
if(y1==y2)
{
if(y1>Math.min(d[j][1],d[j][3])&&y1<Math.max(d[j][1],d[j][3]))
{
d[p][0]=d[j][0];
d[p][2]=d[j][2];
d[p][3]=d[j][3];
d[j][3]=y2;
d[p][1]=y2;
p++;
break;
}
}
else
{
if(x1>Math.min(d[j][0],d[j][2])&&x1>Math.min(d[j][0],d[j][2]))
{
d[p][1]=d[j][1];
d[p][3]=d[j][3];
d[p][2]=d[j][2];
d[j][2]=x2;
d[p][0]=x2;
p++;
break;
}
}
}
}
for(i=0;i<=k;i++)
e[i]=(int)(Math.abs(d[i][0]-d[i][2]))*(int)(Math.abs(d[i][1]-d[i][3]));
Arrays.sort(e);
for(i=0;i<=k;i++)
System.out.print(e[i]+" ");
}
}