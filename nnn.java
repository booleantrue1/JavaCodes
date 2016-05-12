import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0;
n=Integer.parseInt(b.readLine());
System.out.print(3.*n/2);
}
}