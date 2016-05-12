import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,m=0,n=0,i=0,k=0;
String s,r="\0";
p=Integer.parseInt(b.readLine());
for(i=0;i<p;i++)
{
n=Integer.parseInt(b.readLine());
k=(int)((Math.sqrt(8*n+1)-1)/2);
m=n-(k*(k+1)/2);
if(m==0)
{
if(k%2==0)
r+="TERM "+String.valueOf(n)+" IS "+k+"/"+"1"+"\n";
else
r+="TERM "+String.valueOf(n)+" IS "+"1"+"/"+k+"\n";
}
else
{
if((k+1)%2==0)
r+="TERM "+String.valueOf(n)+" IS "+m+"/"+(k+2-m)+"\n";
else
r+="TERM "+String.valueOf(n)+" IS "+(k+2-m)+"/"+m+"\n";
}
}
System.out.print(r.trim());
}
}