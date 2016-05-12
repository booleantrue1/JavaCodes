import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i,j,k,n;
String s;
k=Integer.parseInt(b.readLine());
for(j=0;j<k;j++)
{
int count=0;
n=Integer.parseInt(b.readLine());
int d[]=new int[n+2];
s=b.readLine();
for(i=1;i<=s.length();i++)
if(s.charAt(i-1)=='1')
{
d[i-1]=1;
d[i]=1;
d[i+1]=1;
}

for(i=1;i<=n;i++)
if(d[i]==1)
count++;
System.out.println(n-count);
}
}
}