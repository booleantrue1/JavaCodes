import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,k=0,p=0,q=0,i=0,j=0;
String s="\0";
m=Integer.parseInt(b.readLine());
if(m<4)
{
System.out.print("-1");
System.exit(0);
}
else
{
for(i=1;;i++)
{
p+=4;
q+=7;
if(m>=p&&m<=q)
{
if((m-p)%3==0)
{
k=(m-p)/3;
for(j=0;j<(i-k);j++)
s+="4";
for(j=0;j<k;j++)
s+="7";
System.out.print(s.trim());
System.exit(0);
}
else
{
for(;;)
{
i++;
p+=4;
q+=7;
if(m<p)
{
System.out.print("-1");
System.exit(0);
}
if((m-p)%3==0)
{
k=(m-p)/3;
for(j=0;j<(i-k);j++)
s+="4";
for(j=0;j<k;j++)
s+="7";
System.out.print(s.trim());
System.exit(0);
}
}
}
}
}
}
}
}