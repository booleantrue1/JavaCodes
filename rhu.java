import java.io.*;
import java.text.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0;
final double PI=3.14159265358979323;
final double E=2.71828182845904523536;
double p=0,t=0;
n=Integer.parseInt(b.readLine());
for(i=0;i<n;i++)
{
p=Double.parseDouble(b.readLine());
if(p==0||p==1)
{
System.out.println("1");
continue;
}
t=((Math.log(2*PI*p)/2.0+p*(Math.log(p)-Math.log(E)))/Math.log(10.0))+1;
System.out.println((long)t);
}
}
}