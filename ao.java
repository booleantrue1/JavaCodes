import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int f=0,i=0,k=0,j=0,l=0,a=0,u=0;
long min=100000000,g=0;
String s;
boolean p[]=new boolean[100001];
int d[]=new int[100001];
Arrays.fill(p,true);
p[0]=false;
p[1]=false;
p[2]=true;
p[3]=true;
p[4]=false;
p[5]=true;
p[6]=false;
p[7]=true;
for(i=100000;;i++)
{
for(j=2;j<=(int)Math.sqrt(i);j++)
if(i%j==0)
{
f=1;
break;
}
if(f==0)
{
k=i;
break;
}
f=0;
}
for(i=8;i<100001;i++)
if(i%2==0||i%3==0||i%5==0||i%7==0)
p[i]=false;
for(i=100000;i>=0;i--)
{
if(p[i])
{
for(j=2;j<=(int)Math.sqrt(i);j++)
if(i%j==0)
{
p[i]=false;
f=1;
break;
}
if(f==1)
d[i]=k;
else
{
d[i]=i;
k=i;
}
f=0;
}
else
d[i]=k;
}
s=b.readLine();
StringTokenizer x=new StringTokenizer(s);
k=Integer.parseInt(x.nextToken());
l=Integer.parseInt(x.nextToken());
int e[][]=new int[k][l];
for(i=0;i<k;i++)
{
s=b.readLine();
StringTokenizer q=new StringTokenizer(s);
for(j=0;j<l;j++)
{
a=Integer.parseInt(q.nextToken());
e[i][j]=d[a]-a;
}
}
for(i=0;i<k;i++)
{
for(j=0;j<l;j++)
g+=e[i][j];
if(g<min)
min=g;
g=0;
}
g=0;
for(i=0;i<l;i++)
{
for(j=0;j<k;j++)
g+=e[j][i];
if(g<min)
min=g;
g=0;
}
System.out.print(min);
}
}