import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int flag=0,p=0,i=0,n=0,j=0,m=0;
String s;
m=Integer.parseInt(b.readLine());
int d[]=new int[m];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<m;i++)
d[i]=Integer.parseInt(z.nextToken());
for(i=1;m/i>2;i++)
{
if(m%i==0)
{
for(j=0;j<i;j++)
{
for(p=j;p<m;p+=i)
if(d[p]==0)
{
flag=1;
break;
}
if(flag==0)
{
System.out.print("YES");
System.exit(0);
}
flag=0;
}
}
}
System.out.print("NO");
}
}