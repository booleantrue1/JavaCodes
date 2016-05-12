import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0,j=0,k=0,t=0;
String d[];
n=Integer.parseInt(b.readLine());
d=new String[n];
for(i=0;i<n;i++)
d[i]=b.readLine();
for(j=0;j<n;j++)
{
t=0;
for(i=0;i<5;i+=2)
if(d[j].charAt(i)=='1')
t++;
if(t>1)
k++;
}
System.out.print(k);
}
}
