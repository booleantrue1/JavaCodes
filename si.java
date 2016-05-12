import java.io.*;
import java.text.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0;
double p=0,t=0;
DecimalFormat f=new DecimalFormat("##.00");
String s,r;
n=Integer.parseInt(b.readLine());
for(i=0;i<n;i++)
{
p=Double.parseDouble(b.readLine());
t=(1.0/(8*p*p)-1);
t=2*p*p-2*p*p*t+p*Math.sqrt(2+2*t);
System.out.println("Case "+(i+1)+": "+f.format(t));
}
}
}