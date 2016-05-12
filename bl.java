import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0;
n=Integer.parseInt(b.readLine());
n=n-10;
if(n==11)
System.out.print("4");
else
{
if(n==10)
System.out.print("15");
else
{
if(n>1&&n<10)
System.out.print("4");
else
{
if(n==1)
System.out.print("4");
else
System.out.print("0");
}
}
}
}
}