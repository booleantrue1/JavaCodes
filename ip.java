import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int f=0,k=1,j=0,i=0,m=0;
String s,t;
m=Integer.parseInt(b.readLine());
String r[]=new String[m];
int d[]=new int[m];
d[0]=0;
r[0]=b.readLine();
d[0]++;
System.out.println("OK");
for(i=1;i<m;i++)
{
t=b.readLine();
for(j=0;j<k;j++)
if(r[j].compareTo(t)==0)
{
f=1;
break;
}
if(f==0)
{
System.out.println("OK");
r[k]=t;
d[k]++;
k++;
}
else
{
System.out.println(t+d[j]);
d[j]++;
}
f=0;
}
}
}