import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,m=0,k=0,j=0;
String s,r;
r=b.readLine();
s=b.readLine();
m=r.length();
n=s.length();
int d[]=new int[10];
d[0]=0;
for(i=0;i<n;i++)
d[(int)(s.charAt(i))-48]++;
for(i=9;i>=0;i--)
if(d[i]!=0)
{
k=i;
break;
}
for(i=0;i<m;i++)
{
if(r.charAt(i)<(char)(k+48))
{
System.out.print((char)(k+48));
d[k]--;
}
else
System.out.print(r.charAt(i));
if(d[k]==0)
{
for(j=9;j>=0;j--)
{
if(d[j]!=0)
{
k=j;
break;
}
}
}
if(d[k]==0)
{
for(j=i+1;j<m;j++)
{
System.out.print(r.charAt(j));
}
System.exit(0);
}
}
}
}