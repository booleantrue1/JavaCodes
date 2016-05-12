import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,k=0,i=0,n=0,p=0,f=0,u=0,t=0,m=0;
String s,r,q="\0";
int d[];
m=Integer.parseInt(b.readLine());
for(j=0;j<m;j++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
n=Integer.parseInt(z.nextToken());
p=Integer.parseInt(z.nextToken());
d=new int[p];
r=b.readLine();
StringTokenizer y=new StringTokenizer(r);
for(i=0;i<p;i++)
d[i]=Integer.parseInt(y.nextToken());
for(i=0;i<p-1;i++)
{
for(k=i+1;k<p;k++)
{
if(d[k]>d[i])
{
t=d[k];
d[k]=d[i];
d[i]=t;
}
}
}
for(i=0;i<p;i++)
{
u+=d[i];
if(u>=n)
{
f=1;
break;
}
}
if(f==1&&j!=m-1)
q+=("Scenario #"+String.valueOf(j+1)+":\n"+String.valueOf(i+1)+"\n\n");
if(f==1&&j==m-1)
q+=("Scenario #"+String.valueOf(j+1)+":\n"+String.valueOf(i+1));
if(f==0&&j!=m-1)
q+=("Scenario #"+String.valueOf(j+1)+":\n"+"impossible"+"\n\n");
if(f==0&&j==m-1)
q+=("Scenario #"+String.valueOf(j+1)+":\n"+"impossible");
f=0;
u=0;
}
System.out.print(q.trim());
}
}