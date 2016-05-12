import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,j=0,w=0,i=0;
long p=0,t=0,k=0,v=0;
int d[];
String s;
n=Integer.parseInt(b.readLine());
d=new int[n];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
{
d[i]=Integer.parseInt(c.nextToken());
if(d[i]==0)
{
d[i]=-11;
v++;
}
}
for(j=0;j<n;j++)
{
if(d[j]==-11)
continue;
w=d[j];
for(i=j;i<n;i++)
{
if(d[i]==-11)
continue;
if(d[i]==w&&d[j]!=0)
{
k++;
d[i]=-11;
}
if(d[i]==-w&&d[j]!=0)
{
p++;
d[i]=-11;
}
}
t+=k*p;
k=0;
p=0;
}
System.out.print(t+(v*(v-1))/2);
}
}