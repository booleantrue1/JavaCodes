import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,j=0,i=0;
String s;
j=Integer.parseInt(b.readLine());
for(i=0;i<j;i++)
{
n=Integer.parseInt(b.readLine());
System.out.println((int)Math.ceil((double)n/2));
}
}
}