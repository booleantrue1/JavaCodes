import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,f=0,n=0;
String s=b.readLine(),r="\0",t="\0";
for(i=0;i<110;i++)
r+="z";
r=r.trim();
n=Integer.parseInt(b.readLine());
for(i=0;i<n;i++)
{
t=b.readLine();
if(t.indexOf(s)==0&&t.compareTo(r)<0)
{
r=t;
f=1;
}
}
if(f==1)
System.out.print(r);
else
System.out.print(s);
}
}