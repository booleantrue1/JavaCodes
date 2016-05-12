import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0;
n=Integer.parseInt(b.readLine());
if(n==1)
System.out.print("2");
if(n==2)
System.out.print("3");
if(n==3)
System.out.print("1");
if(n==4)
System.out.print("1");
if(n==5)
System.out.print("2");
}
}