import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0,max=-1,index=-1,sum=0;
String s;
n=Integer.parseInt(b.readLine());
StringTokenizer c=new StringTokenizer(b.readLine());
int nos[]=new int[n];
int cum[]=new int[n];
int ones[]=new int[n];
for(i=0;i<n;i++)
cum[i]=0;
nos[0]=Integer.parseInt(c.nextToken());
for(i=1;i<n;i++)
{
nos[i]=Integer.parseInt(c.nextToken());
cum[i]=cum[i-1]+nos[i];
}
s=b.readLine();
if(s.charAt(0)=='1')
ones[0]=1;
else
ones[0]=0;
for(i=1;i<n;i++)
{
if(s.charAt(i)=='1')
ones[i]=ones[i-1]+1;
else
ones[i]=ones[i-1];
}
for(i=n-1;i>0;i--)
{
if(ones[i]==i+1)
break;
if(s.charAt(i)=='1')
{
if(cum[i-1]>nos[i])
{
index=i;
break;
}
}
}
for(i=0;i<index;i++)
sum+=nos[i];
for(i=index+1;i<n;i++)
sum+=nos[i]*(s.charAt(i)-'0');
System.out.print(sum);
}
}