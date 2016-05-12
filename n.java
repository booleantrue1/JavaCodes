import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int f=0,n=0,j=0,i=0,t=0;
char q='\0';
String g;
n=Integer.parseInt(b.readLine());
for(i=1;i<=n;i++)
{
if(n%i==0)
{
g=String.valueOf(i);
t=g.length();
for(j=0;j<t;j++)
{
f=0;
q=g.charAt(j);
if(q!='4'&&q!='7')
{
f=1;
break;
}
}
if(f==0)
{
System.out.print("YES");
break;
}
}
}
if(f==1)
System.out.print("NO");
}
}