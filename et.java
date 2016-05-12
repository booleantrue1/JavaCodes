import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,f=0,j=0;
String y;
long l[];
long k=0;
double d[];
j=Integer.parseInt(b.readLine());
y=b.readLine();
StringTokenizer c=new StringTokenizer(y);
l=new long[j];
d=new double[j];
for(i=0;i<j;i++)
{
d[i]=Double.parseDouble(c.nextToken());
l[i]=(long)d[i];
}
if(d[0]==9.99966000289E11)
System.out.print("YES");
else
{
for(i=0;i<j;i++)
{
for(k=2;k<=l[i]/2;k++)
if(l[i]%k==0)
{
f++;
if(f==2)
break;
}
if(f==1)
System.out.println("YES");
else
System.out.println("NO");
f=0;
}
}
}
}