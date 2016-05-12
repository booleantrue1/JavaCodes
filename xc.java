import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
double m,n;
m=Double.parseDouble(b.readLine());
if(m<2)
{
System.out.print("TAK");
System.exit(0);
}
else
{
n=Math.log(m)/Math.log(2);
if(n==((int)n))
System.out.print("TAK");
else
System.out.print("NIE");
System.exit(0);
}
}
}