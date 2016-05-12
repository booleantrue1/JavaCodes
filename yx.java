import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,n=0;
String s;
s=b.readLine();
n=Integer.parseInt(s.substring(0,2));
k=Integer.parseInt(s.substring(3));
n=n%12;
System.out.print((30*n)+(double)k/2+" "+(6*k));
}
}