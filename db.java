import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,n=0,i=0,t=0,k=0;
String s;
n=Integer.parseInt(b.readLine());
for(i=0;i<n;i++)
{
s=b.readLine();
t=s.length();
for(j=0;j<t;j++)
{
if(s.charAt(j)=='A'||s.charAt(j)=='D'||s.charAt(j)=='O'||s.charAt(j)=='P'||s.charAt(j)=='Q'||s.charAt(j)=='R')
k++;
if(s.charAt(j)=='B')
k+=2;
}
System.out.println(k);
k=0;
}
}
}