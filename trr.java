import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
long n=0,t=0,p=0,k=0,m=0;
String s;
int i;
s=b.readLine();
n=s.length();
Integer d[];
Integer e[];
Vector v1=new Vector();
Vector v2=new Vector();
for(i=0;i<=n-5;i++)
{
if(s.charAt(i)=='h'&&s.charAt(i+1)=='e'&&s.charAt(i+2)=='a'&&s.charAt(i+3)=='v'&&s.charAt(i+4)=='y')
{
v1.addElement(new Integer(i));
k++;
}
if(s.charAt(i)=='m'&&s.charAt(i+1)=='e'&&s.charAt(i+2)=='t'&&s.charAt(i+3)=='a'&&s.charAt(i+4)=='l')
{
v2.addElement(new Integer(i));
m++;
}
}
d=new Integer[(int)k];
e=new Integer[(int)m];
v1.copyInto(d);
v2.copyInto(e);
//for(i=0;i<k;i++)
//System.out.print(d[i]+" ");
//for(i=0;i<m;i++)
//System.out.print(e[i]+" ");
for(i=0;i<k;i++)
{
p=Arrays.binarySearch(e,d[i]);
//System.out.println(p);
p*=(-1);
t+=m-p+1;
}
System.out.print(t);
}
}