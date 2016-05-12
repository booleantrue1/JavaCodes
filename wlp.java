import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int z=0,y=0,p=0,j=0,i=0,n=0,x=0,k=0;
String s;
n=Integer.parseInt(b.readLine());
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
{
s=c.nextToken();
p=s.length();
for(j=0;j<p;j++)
k+=Integer.parseInt(s.substring(j,j+1));
if(k%3==0)
x++;
if(k%3==1)
y++;
if(k%3==2)
z++;
k=0;
}
System.out.print(x/2+(int)Math.min(y,z));
}
}