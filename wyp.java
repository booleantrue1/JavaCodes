import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,k=0,i=0,t=0,m=0,n=0,flag=0;
String s;
t=Integer.parseInt(b.readLine());
int d[]=new int[t];
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<t;i++)
d[i]=Integer.parseInt(c.nextToken());
for(i=0;i<t;i++)
{
if(d[i]==25)
{
m++;
continue;
}
if(d[i]==50)
{
if(m==0)
{
System.out.print("NO");
System.exit(0);
}
else
m--;
n++;
}
if(d[i]==100)
{
if(n>0&&m>0)
{
m--;
n--;
continue;
}
if(n==0)
{
if(m>=3)
{
m-=3;
continue;
}
else
{
System.out.print("NO");
System.exit(0);
}
}
else
{
System.out.print("NO");
System.exit(0);
}
}

}
System.out.print("YES");
}
}