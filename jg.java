import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,m=1;
String s;
n=Integer.parseInt(b.readLine());
int d[]=new int[n];
for(i=1;i<n;i++)
{
if(s.charAt(i-1)=='L')
d[i]=d[i-1]-1;
if(s.charAt(i-1)=='=')
d[i]=d[i-1];
if(s.charAt(i-1)=='R')
d[i]=d[i-1]+1;
if(d[i]<m)
m=d[i];
}
for(i=0;i<n;i++)
System.out.print((1-m)+d[i]+" ");
}
}