import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int flag=0,r=0,k=0,l=0,n=0,i=0;
n=Integer.parseInt(b.readLine());
int d[]=new int[100000];
for(i=1;;i++)
{
if(i*(i+1)/2>n)
break;
d[k++]=i*(i+1)/2;
}
l=0;
r=k-1;
while(l<=r)
{
if(d[r]+d[l]==n)
{
flag=1;
break;
}
if(d[r]+d[l]>n)
r--;
else
l++;
}
if(flag==0)
System.out.print("NO");
else
System.out.print("YES");
}
}