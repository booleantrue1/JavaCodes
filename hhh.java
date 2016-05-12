import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String r,s;
int n=0,i=0,t=0,j=0;
char z[];
char v='\0';
r=b.readLine();
s=b.readLine();
StringTokenizer c=new StringTokenizer(r);
n=Integer.parseInt(c.nextToken());
t=Integer.parseInt(c.nextToken());
z=new char[n];
for(i=0;i<n;i++)
z[i]=s.charAt(i);
for(j=1;j<=t;j++)
{
for(i=0;i<n-1;i++)
{
if(z[i]=='B')
if(z[i+1]=='G')
{
v=z[i];
z[i]=z[i+1];
z[i+1]=v;
i++;
}
}
}
for(i=0;i<n;i++)
System.out.print(z[i]);
}
}