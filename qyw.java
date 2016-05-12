import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i,j,k,n;
String s;
k=Integer.parseInt(b.readLine());
for(j=0;j<k;j++)
{
int count=0;
s=b.readLine();
for(i=0;i<s.length();i++)
if(s.charAt(i)=='4'||s.charAt(i)=='7')
count++;
System.out.println(s.length()-count);
}
}
}