import java.io.*;
import java.text.*;
import java.util.*;
class j
{
static int findHCF(int a, int b)
{
if(a==0)
return b;
else
return findHCF(b%a,a);
}
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0,k=0,j=0,p=0,m=0,count=0;
double t=0;
int d[]={1,2,2,3,2,4,2,4,3,4,2,6,2,4,4,5,2,6,2,6,4,4,2,8,3,4,4,6,2,8,2,6,4,4,4,9,2,4,4,8,2,8,2,6,6,4,2,10,3,6,4,6,2,8,4,8,4,4,2,12,2,4,6,7,4,8,2,6,4,8,2,12,2,4,6,6,4,8,2,10,5,4,2,12,4,4,4,8,2,12,4,6,4,4,4,12,2,6,6,9,2,8,2,8,8,4,2,12,2,8,4,10,2,8,4,6,6,4,4,16,3,4,4,6,4,12,2,8,4,8,2,12,4,4,8,8,2,8,2,12,4,4,4,15,4,4,6,6,2,12,2,8,6,8,4,12,2,4,4,12,4,10,2,6,8,4,2,16,3,8,6,6,2,8,6,10,4,4,2,18,2,8,4,8,4,8,4,6,8,8,2,14,2,4,8,9,2,12,2,12,4,4,4,12,4,4,6,10,4,16,2,6,4,4,4,16,4,4,4,12,4,8,2,12,9,4,2,12,2,8,8,8,2,12,4,6,4,8,2,20,2,6,6,6,6,8,4,8,4,8,2,18,4,4,8,9,2,8,4,12,6,4,2,16,4,8,4,6,2,16,2,10,8,4,6,12,2,4,6,16,2,8,2,6,8,8,4,18,3,8,4,6,2,12,4,8,8,4,4,18,4,4,4,10,4,12,2,12,4,8,2,16,2,4,12,6,2,8,4,14,4,8,4,15,6,4,4,8,4,16,2,6,6,4,4,20,2,6,4,12,4,12,4,8,8,4,2,12,2,12,8,12,2,8,4,6,8,4,2,24,3,4,6,12,4,8,2,10,6,8,4,12,2,8,8,8,4,16,2,12,4,4,2,16,8,4,6,6,2,16,4,12,4,4,4,18,2,4,8,15,2,8,4,6,10,8,4,16,2,8,4,6,4,12,4,12,4,8,2,24,2,4,6,8,6,8,4,6,8,8,2,20,2,8,8,6,4,8,2,16,9,8,2,12,4,4,4,14,2,18,4,6,4,4,8,16,2,4,8,12,2,16,2,10,8,4,2,18,4,8,4,8,4,8,6,12,6,4,2,24,4,4,8,9,4,12,2,8,4,12,2,12,4,8,12,10,4,8,2,12,4,4,2,24,4,8,6,6,2,16,4,10,8,4,4,12,4,8,4,16,2,12,2,6,12,4,4,20,3,8,6,12,4,8,4,8,4,4,6,24,2,4,4,12,4,16,2,6,6,12,4,16,4,4,8,6,2,12,4,20,8,4,2,12,4,4,10,8,2,16,2,12,4,8,6,21,2,6,4,12,4,8,4,8,12,4,2,18,4,8,4,10,2,16,8,6,4,8,2,24,2,8,6,6,6,8,2,12,8,8,4,18,2,4,8,16,2,8,2,12,8,4,4,20,5,4,8,6,4,24,2,8,4,4,4,12,6,8,6,16,2,8,2,12,8,8,2,20,4,12,8,6,2,8,4,10,6,8,2,24,2,4,8,8,8,12,4,6,4,8,4,24,2,4,12,9,2,8,4,16,4,8,2,18,4,8,4,10,4,16,2,6,12,4,4,16,4,4,4,18,2,16,4,14,8,4,4,12,2,8,6,8,4,16,8,6,4,4,2,30,4,6,4,6,6,12,2,16,7,8,4,12,2,4,12,12,4,12,2,12,8,8,2,16,4,4,6,12,4,16,2,10,4,8,4,24,2,4,8,16,2,8,4,6,12,4,4,18,2,16,4,6,2,12,6,8,8,4,4,24,4,8,8,15,4,8,2,6,4,8,4,24,4,4,8,6,2,16,4,18,6,4,4,12,8,8,4,8,2,20,2,12,4,8,4,20,4,4,12,12,2,8,2,8,12,8,2,18,2,8,4,14,6,8,4,12,8,4,2,32,3,4,4,6,6,12,6,10,4,12,4,12,2,8,12,8,2,16,2,12,8,4,2,24,4,4,6,12,4,16,4,8,6,8,8,12,2,4,4,20,2,18,2,12,8,4,2,16,4,8,10,6,4,8,4,16,8,4,4,27,4,8,8,8,4,8,2,6,6,16,2,20,4,4,8,6,4,16,2,16,4,4,4,24,6,4,6,12,2,16,6,6,4,4,8,24,2,8,4,12,2,8,4,10,16,8,2,12,4,12,4,16,2,12,4,6,8,4,4,28,3,8,6,6,4,16,2,12,8,8,2,18,4,4,12,10,2,8,4,18,6,4,2,16,4,8,8,12,4,24,2,12,4,8,4,12,2,4,8,16,8};
String s;
n=Integer.parseInt(b.readLine());
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
k=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
p=findHCF(k,m);
t=Math.sqrt(p);
for(j=(int)t;j>0;j--)
{
if(p%j==0)
{
count=1;
System.out.println(d[j-1]);
break;
}
}
count=0;
}
}
}