import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,i=0,min=100000000,n=0,p=0;
String r=b.readLine(),s=b.readLine();
int d[]=new int[10];
int e[]=new int[10];
d[0]=0;
e[0]=0;
m=r.length();
r=r.replace('2','5');
r=r.replace('6','9');
n=s.length();
s=s.replace('2','5');
s=s.replace('6','9');
for(i=0;i<m;i++)
d[Integer.parseInt(r.substring(i,i+1))]++;
for(i=0;i<n;i++)
e[Integer.parseInt(s.substring(i,i+1))]++;
for(i=0;i<10;i++)
if(d[i]!=0)
{
p=e[i]/d[i];
if(p<min)
min=p;
}
System.out.print(min);
}
}