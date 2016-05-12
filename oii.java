import java.io.*;
import java.math.*;
class j
{
public static void main(String aa[])throws IOException
{
DataInputStream b=new DataInputStream(System.in);
int x=0,k=10,f=0,i=0,n=0,p=1;
char q='\0';
int d[]=new int[10];
d[0]=0;
int e[]=new int[10];
for(i=0;i<10;i++)
e[i]=i+1;
String s=b.readLine();
n=s.length();
q=s.charAt(0);
if(q=='?')
p=p*e[8];
if(q>='A'&&q<='J')
{
p=p*e[8];
d[(int)q-65]=1;
k--;
f=1;
}
for(i=1;i<n;i++)
{
q=s.charAt(i);
if(q=='?')
x++;
else
{
if(q>='A'&&q<='J')
{
if(d[(int)q-65]==0)
{
k--;
d[(int)q-65]=1;
}
}
}
}
if(f==0)
for(i=10;i>k;i--)
p=p*e[i-1];
else
{
for(i=9;i>k;i--)
p=p*e[i-1];
}
System.out.print(p);
for(i=0;i<x;i++)
System.out.print("0");
}
}