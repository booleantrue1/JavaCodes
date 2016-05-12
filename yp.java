import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int v=0,u=0,i=0,k=0,n=0;
n=Integer.parseInt(b.readLine());
String s;
int d[]=new int[n];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
{
d[i]=Integer.parseInt(c.nextToken());
if(d[i]%2==0&&d[i]!=0%%(d[i]/2)%2!==0)
u++;
if(d[i]%2==1&&d[i]!=1)
v++;
if(d[i]==1)
u++;
}
if(u>1)
k+=u*(u-1)/2;
if(v>1)
k+=v*(v-1)/2;
System.out.print(k);
}
}