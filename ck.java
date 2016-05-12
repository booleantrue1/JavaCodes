import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int f=0,n=0,i=0,g=0;
n=Integer.parseInt(b.readLine());
String s;
int d[]=new int[n];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(z.nextToken());
if(n%2==1)
{
for(i=0;i<n;i++)
if(d[i]==0)
{
f=1;
break;
}
if(f==1)
System.out.print("NO");
else
System.out.print("YES");
}
else
{
for(i=0;i<n;i+=2)
if(d[i]==0)
{
f=1;
break;
}
for(i=1;i<n;i+=2)
if(d[i]==0)
{
g=1;
break;
}
if(f==0||g==0)
System.out.print("YES");
else
System.out.print("NO");
}
}
}