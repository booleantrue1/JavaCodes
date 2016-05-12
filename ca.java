import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,p=0,t=0,k=0,l=0;
String r,s;
n=Integer.parseInt(b.readLine());
int d[]=new int[n];
int e[]=new int[n];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
{
t=Integer.parseInt(c.nextToken());
if(t<0)
{
d[k]=t;
k++;
}
if(t>0)
{
e[l]=t;
l++;
}
if(t==0)
p++;
}
//System.out.println(k+" "+l+" "+p);
if(l==0)
{
if(k%2==0)
{
System.out.print(k-3);
for(i=3;i<k;i++)
System.out.print(" "+d[i]);
System.out.println("\n"+"2"+" "+d[0]+" "+d[1]);
System.out.print(p+1+" "+d[2]);
for(i=0;i<p;i++)
System.out.print(" 0");
}
else
{
System.out.print(k-2);
for(i=2;i<k;i++)
System.out.print(" "+d[i]);
System.out.println("\n"+"2"+" "+d[0]+" "+d[1]);
System.out.print(p);
for(i=0;i<p;i++)
System.out.print(" 0");
}
}
else
{
if(k%2==0)
{
System.out.print(k-1);
for(i=1;i<k;i++)
System.out.print(" "+d[i]);
System.out.print("\n"+l);
for(i=0;i<l;i++)
System.out.print(" "+e[i]);
System.out.print("\n"+(p+1)+" "+d[0]);
for(i=0;i<p;i++)
System.out.print(" 0");
}
else
{
System.out.print(k);
for(i=0;i<k;i++)
System.out.print(" "+d[i]);
System.out.print("\n"+l);
for(i=0;i<l;i++)
System.out.print(" "+e[i]);
System.out.print("\n"+p);
for(i=0;i<p;i++)
System.out.print(" 0");
}
}
}
}