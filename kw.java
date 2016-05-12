import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int v=0,i=0,n=0,j=0,k=0,u=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
v=Integer.parseInt(c.nextToken());
boolean p[]=new boolean[1001];
int d[]=new int[1001];
Arrays.fill(p,true);
p[0]=false;
p[1]=false;
p[2]=true;
p[3]=true;
p[4]=false;
p[5]=true;
p[6]=false;
p[7]=true;
for(i=8;i<1001;i++)
if(i%2==0||i%3==0||i%5==0||i%7==0)
p[i]=false;
for(i=0;i<1001;i++)
{
if(p[i])
{
for(j=2;j<=(int)Math.sqrt(i);j++)
if(i%j==0)
{
p[i]=false;
break;
}
}
}
for(i=0;i<1001;i++)
if(p[i])
{
d[k]=i;
k++;
}
int e[]=new int[k-1];
for(i=0;i<k-1;i++)
e[i]=d[i]+d[i+1]+1;
for(j=2;j<=n;j++)
if(p[j]&&Arrays.binarySearch(e,j)>=0)
u++;
if(u>=v)
System.out.print("YES");
else
System.out.print("NO");
}
}