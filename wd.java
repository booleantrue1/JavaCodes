import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String s;
long i=0,j=0,terms=0,a=0,d=0,m3=0,ml3=0,sum=0;
long n=Long.parseLong(b.readLine());
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m3=Long.parseLong(c.nextToken());
ml3=Long.parseLong(c.nextToken());
sum=Long.parseLong(c.nextToken());
if(sum!=0)
{
terms=2*sum/(ml3+m3);
System.out.println(terms);
d=(ml3-m3)/(terms-5);
a=m3-2*d;
for(j=0;j<terms;j++)
System.out.print(a+j*d+" ");
System.out.println();
}
else
{
System.out.println(3*m3+" "+2*m3+" "+m3+" 0 "+ml3+" "+2*ml3+" "+3*ml3);
}
}
}
}