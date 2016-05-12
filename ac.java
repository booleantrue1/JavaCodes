import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int f=0,n=0,i=0;
String s,r="\0",t="\0",u="\0";
s=b.readLine();
r=b.readLine();
t=b.readLine();
s=s.replace(";","");
s=s.replace("_","");
s=s.replace("-","");
s=s.toLowerCase();
r=r.replace(";","");
r=r.replace("_","");
r=r.replace("-","");
r=r.toLowerCase();
t=t.replace(";","");
t=t.replace("_","");
t=t.replace("-","");
t=t.toLowerCase();
n=Integer.parseInt(b.readLine());
for(i=0;i<n;i++)
{
u=b.readLine();
u=u.replace(";","");
u=u.replace("_","");
u=u.replace("-","");
u=u.toLowerCase();
if((s.length()+r.length()+t.length())==u.length())
{
if(u.indexOf(s)>=0)
{
u=(u.substring(0,u.indexOf(s))+" "+u.substring(u.indexOf(s)+s.length()));
f++;
}
if(u.indexOf(r)>=0)
{
u=(u.substring(0,u.indexOf(r))+" "+u.substring(u.indexOf(r)+r.length()));
f++;
}
if(u.indexOf(t)>=0)
{
u=(u.substring(0,u.indexOf(t))+" "+u.substring(u.indexOf(t)+t.length()));
f++;
}
if(f==3)
System.out.println("ACC");
else
System.out.println("WA");
}
else
System.out.println("WA");
f=0;
}
}
}