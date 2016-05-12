import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,n=0,j=0,m=0,i=0;
String s,t="\0",u="\0",f="\0";
int d[];
int e[];
for(;;)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
d=new int[n];
e=new int[p];
if(n==0&&p==0)
{System.out.print(f.trim());System.exit(0);}
else
t=b.readLine();
StringTokenizer y=new StringTokenizer(t);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(y.nextToken());
u=b.readLine();
StringTokenizer z=new StringTokenizer(u);
for(i=0;i<p;i++)
e[i]=Integer.parseInt(z.nextToken());
for(i=0;i<p-1;i++)
for(j=i+1;j<p;j++)
if(e[j]<e[i]){m=e[j];e[j]=e[i];e[i]=m;}
for(i=0;i<n;i++)
if(d[i]<e[1])
{f+="Y"+"\n";break;}
if(i==n)
f+="N"+"\n";
}
}
}