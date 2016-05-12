import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int h=0,jj=0,l=0,p=0,j=0,x=0,y=0,m=0,n=0,a=1,i=0;
String g,f,o,r,t;
o=b.readLine();
int d[];
int e[];
String s[];
StringTokenizer c=new StringTokenizer(o);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
x=Integer.parseInt(c.nextToken());
y=Integer.parseInt(c.nextToken());
d=new int[m];
e=new int[n];
s=new String[m];
for(i=0;i<m;i++)
s[i]="\0";
r=b.readLine();
StringTokenizer q=new StringTokenizer(r);
for(i=0;i<m;i++)
d[i]=Integer.parseInt(q.nextToken());
t=b.readLine();
StringTokenizer u=new StringTokenizer(t);
for(i=0;i<n;i++)
e[i]=Integer.parseInt(u.nextToken());
for(j=0;j<n;j++)
{
if((d[0]-x)<=e[j]&&(d[0]+y)>=e[j])
{
l=1;
e[j]=0;
p=j;
g=String.valueOf(1);
f=String.valueOf(j+1);
s[0]+=g+" "+f;
break;
}
}
for(i=1;i<m;i++)
{
for(j=p+1;j<n;j++)
{
if((d[i]-x)<=e[j]&&(d[i]+y)>=e[j])
{
e[j]=0;
l++;
p=j;
h=1;
break;
}
if((d[i]-x)>e[n-1])
{
jj=1;
break;
}
}
if(h==1)
{
g=String.valueOf(i+1);
f=String.valueOf(j+1);
s[a]+=g+" "+f;
a++;
h=0;
}
if(jj==1)
break;
}
System.out.println(l);
for(i=0;i<l;i++)
{
s[i]=s[i].trim();
System.out.println(s[i]);
}
}
}