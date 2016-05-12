import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0;
double k=0;
n=Integer.parseInt(b.readLine());
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
{
k=Double.parseDouble(c.nextToken());
if(k%4==0||k%4==2)
System.out.println((long)(4*k+1));
if(k%4==1)
System.out.println((long)(2*k+1));
if(k%4==3)
System.out.println((long)(k+1));
}
}
}