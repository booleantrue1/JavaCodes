import java.io.*;
import java.text.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0;
double d=0;
for(;;)
{
n=Integer.parseInt(b.readLine());
if(n==0)
System.exit(0);
else
{
DecimalFormat f=new DecimalFormat(".00");
d=(n*n)/2.0;
d=d/3.1415926535897932384626433832795;
if(d<1)
System.out.println("0"+f.format(d));
else
System.out.println(f.format(d));
}
}
}
}