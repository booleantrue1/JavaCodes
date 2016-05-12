import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,l=0,u=0,v=0,m=0,x1=0,x2=1,y1=0,y2=0,j=0,n=0,i=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
x1=Integer.parseInt(c.nextToken());
y1=Integer.parseInt(c.nextToken());
x2=Integer.parseInt(c.nextToken());
y2=Integer.parseInt(c.nextToken());
n=Integer.parseInt(b.readLine());
int x[]=new int[n];
int y[]=new int[n];
int r[]=new int[n];
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
x[i]=Integer.parseInt(z.nextToken());
y[i]=Integer.parseInt(z.nextToken());
r[i]=Integer.parseInt(z.nextToken());
}
for(j=x2,k=(int)Math.min(y1,y2)+1;k<(int)Math.max(y1,y2);k++)
{
for(l=0;l<n;l++)
{
if(Math.sqrt((Math.pow((x[l]-j),2))+(Math.pow((y[l]-k),2)))<=r[l])
{
m++;
break;
}
}
}
for(i=x1,k=(int)Math.min(y1,y2)+1;k<(int)Math.max(y1,y2);k++)
{
for(l=0;l<n;l++)
{
if(Math.sqrt((Math.pow((x[l]-i),2))+(Math.pow((y[l]-k),2)))<=r[l])
{
m++;
break;
}
}
}
for(i=y1,k=(int)Math.min(x1,x2)+1;k<(int)Math.max(x1,x2);k++)
{
for(l=0;l<n;l++)
{
if(Math.sqrt((Math.pow((x[l]-k),2))+(Math.pow((y[l]-i),2)))<=r[l])
{
m++;
break;
}
}
}
for(j=y2,k=(int)Math.min(x1,x2)+1;k<(int)Math.max(x1,x2);k++)
{
for(l=0;l<n;l++)
{
if(Math.sqrt((Math.pow((x[l]-k),2))+(Math.pow((y[l]-j),2)))<=r[l])
{
m++;
break;
}
}
}
u=x1;
v=y1;
for(l=0;l<n;l++)
{
if(Math.sqrt((Math.pow((x[l]-u),2))+(Math.pow((y[l]-v),2)))<=r[l])
{
m++;
break;
}
}
u=x1;
v=y2;
for(l=0;l<n;l++)
{
if(Math.sqrt((Math.pow((x[l]-u),2))+(Math.pow((y[l]-v),2)))<=r[l])
{
m++;
break;
}
}
u=x2;
v=y1;
for(l=0;l<n;l++)
{
if(Math.sqrt((Math.pow((x[l]-u),2))+(Math.pow((y[l]-v),2)))<=r[l])
{
m++;
break;
}
}
u=x2;
v=y2;
for(l=0;l<n;l++)
{
if(Math.sqrt((Math.pow((x[l]-u),2))+(Math.pow((y[l]-v),2)))<=r[l])
{
m++;
break;
}
}
System.out.print((long)(2*(Math.abs(x1-x2)-1)+2*(Math.abs(y1-y2)-1)+4-m));
}
}