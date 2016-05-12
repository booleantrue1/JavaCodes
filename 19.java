import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int f=0,k=0,p=0,t=0,j=0,x=0,m=0,i=0;
m=Integer.parseInt(b.readLine());
int d[]=new int[m];
String r;
r=b.readLine();
StringTokenizer c=new StringTokenizer(r);
for(i=0;i<m;i++)
d[i]=Integer.parseInt(c.nextToken());
for(i=0;i<m-1;i++)
{
for(j=i+1;j<m;j++)
{
if(d[j]<d[i])
{
t=d[i];
d[i]=d[j];
d[j]=t;
}
}
}
for(i=0;i<m;i++)
{
p+=d[i];
if(p>350)
{
d[i]=p-350;
k=i;
break;
}
}
p=0;
f=i;
for(i=f;i<m;i++)
{
x+=d[i];
if(x>360)
{
x=x-d[i];
break;
}
x-=d[i];
if(i==k)
{p+=d[i];x+=d[i];}
else
{
p+=(x+d[i]);
x+=d[i];}
f++;
}
System.out.print(f+" "+p);
}
}