import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
int k=0,p=0,h=0,t=0,n=0,i=0,j=0;
n=Integer.parseInt(b.readLine());
String s,v="\0";
String d[]=new String[8];
for(i=0;i<n;i++)
{
for(h=0;h<8;h++)
d[h]=" ";
s=b.readLine();
s=s.replace("::",": :");
k=s.length();
for(j=0;j<k;j++)
{
if(s.charAt(j)==':'&&(j==0||j==k-1))
continue;
if(s.charAt(j)==':')
{
p++;
continue;
}
d[p]+=s.charAt(j);
}
for(h=0;h<=p;h++)
if(d[h].equals("  "))
t++;
if(t==1)
t=8-p;
for(j=0;j<=p;j++)
{
if(d[j].equals("  "))
{
for(h=0;h<t;h++)
v+="0000:";
}
else
{
if(d[j].length()<5)
{
for(h=0;h<=4-d[j].length();h++)
v+="0";
v+=(d[j].trim()+":");
}
else
v+=(d[j].trim()+":");
}
}
v=v.trim();
System.out.println(v.substring(0,v.length()-1));
p=0;
v="\0";
t=0;
}
}
}