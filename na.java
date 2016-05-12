import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,p=0,t=0,m=0;
String r,s;
r=b.readLine();
s=b.readLine();
m=r.length();
for(i=0;i<m;i++)
if(r.charAt(i)=='1')
n++;
if(n%2==0)
for(i=0;i<1001;i++)
r+="0";
else
{
r+="1";
for(i=0;i<1001;i++)
r+="0";
}
if(r.indexOf(s)<0)
System.out.print("NO");
else
System.out.print("YES");
}
}