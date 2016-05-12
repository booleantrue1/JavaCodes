import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,n=0,k=0;
String r;
r=b.readLine();
for(i=1;i<=500;i++)
{
n=r.length();
for(j=0;j<n;j++)
k+=Integer.parseInt(r.substring(j,j+1))*Integer.parseInt(r.substring(j,j+1));
if(k==1)
{
System.out.print(i);
System.exit(0);
}
r=String.valueOf(k);
k=0;
}
System.out.print("-1");
}
}