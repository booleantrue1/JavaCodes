import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int f=0,n=0,i=0,k=0,j=0;
n=Integer.parseInt(b.readLine());
String s;
int d[]=new int[n];
int e[]=new int[n];
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
d[i]=Integer.parseInt(z.nextToken());
e[i]=Integer.parseInt(z.nextToken());
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(d[i]==e[j]&&i!=j)
{
f=1;
break;
}
}
if(f==0)
k++;
f=0;
}
System.out.print(k);
}
}