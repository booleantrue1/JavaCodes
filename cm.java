import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,t=0,k=0,p=0,m=0,i=0;
m=Integer.parseInt(b.readLine());
String s;
int d[]=new int[m];
int e[]=new int[m];
int f[][]=new int[m*m][2];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<m;i++)
d[i]=Integer.parseInt(c.nextToken());
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<m;i++)
e[i]=Integer.parseInt(z.nextToken());
for(i=0;i<m;i++)
{
for(j=i;j<m;j++)
if(e[j]==d[i])
break;
for(k=j;k>i;k--)
{
t=e[k];
e[k]=e[k-1];
e[k-1]=t;
f[p][0]=k;
f[p][1]=k+1;
p++;
}
}
System.out.println(p);
for(i=0;i<p;i++)
System.out.println(f[i][0]+" "+f[i][1]);
}
}