import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,k=0,u=0,n=0,m=0,i=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
if(m%2==1)
{
System.out.println((m+1)/2);
n--;
j=(m-1)/2;
k=(m+3)/2;
for(i=0;i<n;i++)
{
if(j==0&&k==m+1)
{
j=(m-1)/2;
k=(m+3)/2;
System.out.println((m+1)/2);
u=(u+1)%2;
continue;
}
if(i%2==u)
{
System.out.println(j);
j--;
}
else
{
System.out.println(k);
k++;
}
}
}
else
{
j=m/2;
k=m/2+1;
for(i=0;i<n;i++)
{
if(i%2==0)
{
System.out.println(j);
j--;
}
else
{
System.out.println(k);
k++;
}
if(j==0&&k==m+1)
{
j=m/2;
k=m/2+1;
}
}
}
}
}