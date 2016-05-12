import java.io.*;
import java.text.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0;
while(true)
{
n=Integer.parseInt(b.readLine());
if(n==0)
System.exit(0);
n++;
System.out.println((3*n*n-n)/2);
}
}
}