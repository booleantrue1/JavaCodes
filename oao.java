import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,k=0,n=0,l=0,p=0,flag=0;
String s;
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
n=Integer.parseInt(z.nextToken());
k=Integer.parseInt(z.nextToken());
String s1[]=new String[n];
String s2[]=new String[n];
String r1[]=new String[n];
String r2[]=new String[n];
int d[]=new int[n];
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
s1[i]=c.nextToken();
s2[i]=c.nextToken();
d[i]=Integer.parseInt(c.nextToken());
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
//System.out.println(p);
if((s1[j].compareTo(s2[i])==0&&s2[j].compareTo(s1[i])==0)&&Math.abs(d[j]-d[i])<=k&&Math.abs(d[j]-d[i])>0)
{
flag=0;
for(l=0;l<p;l++)
if((s1[j].compareTo(r1[l])==0&&s2[j].compareTo(r2[l])==0)||(s1[j].compareTo(r2[l])==0&&s2[j].compareTo(r1[l])==0))
{
flag=1;
break;
}
if(flag==0)
{
r1[p]=s1[j];
r2[p]=s2[j];
p++;
}
}
}
}
System.out.println(p);
for(i=0;i<p;i++)
System.out.println(r1[i]+" "+r2[i]);
}
}