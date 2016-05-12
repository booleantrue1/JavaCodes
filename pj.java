import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,p=0,n=0,k=0;
String s,r="\0",u="\0",v="\0";
s=b.readLine();
n=s.length();
String s1[]=new String[n*(n+1)/2];
String s2[]=new String[n*(n+1)/2];
int d[]=new int[n*(n+1)/2];
int e[]=new int[n*(n+1)/2];
for(i=0;i<n;i++)
{
for(j=1;j<=n-i;j++)
{
r=s.substring(i,i+j);
String t=new StringBuffer(r).reverse().toString();
if(r.compareTo(t)==0)
{
s1[k]=r;
s2[k]=r;
d[k]=i;
e[k]=i+r.length()-1;
k++;
}
}
}
for(i=0;i<k-1;i++)
{
for(j=i+1;j<k;j++)
{
if(s1[i].compareTo(s1[j])==0)
{
s2[j]="*#";
}
}
}
for(i=0;i<k;i++)
System.out.println(s1[i]+" "+s2[i]);
for(i=0;i<k;i++)
{
v=s.substring(e[i]+1);
System.out.println(v);
for(j=0;j<k;j++)
{
if(v.indexOf(s2[j])>=0)
{
System.out.println(i+" "+j+" "+v+" "+s1[j]);
p++;
}
}
}
System.out.print(p);
}
}