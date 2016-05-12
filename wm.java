import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
Scanner b=new Scanner(System.in);
int i=0,n=0;
double m=0;
String s;
s=b.next();
double d[]=new double[125];
d[0]=0;
n=s.length();
for(i=0;i<n;i++)
d[(int)s.charAt(i)]++;
for(i=0;i<125;i++)
m+=Math.pow(d[i],2);
System.out.print((long)m);
}
}