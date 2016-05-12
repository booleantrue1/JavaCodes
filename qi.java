import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,m=0,i=0,j=0;
String y;
int d[];
j=Integer.parseInt(b.readLine());
y=b.readLine();
StringTokenizer c=new StringTokenizer(y);
d=new int[j];
for(i=0;i<j;i++)
d[i]=Integer.parseInt(c.nextToken());
for(i=0;i<3;i++)
{
if(d[i]%2==0)
k++;
else
m++;
}
if(k>1)
{
for(i=0;;i++)
if(d[i]%2==1)
{
System.out.print(i+1);
break;
}
}
else
{
for(i=0;;i++)
if(d[i]%2==0)
{
System.out.print(i+1);
break;
}
}
}
}