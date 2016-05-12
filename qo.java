import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,m=0,n=0,p=0;
String r="\0",s="\0",t="\0",v="\0",w="\0",x="\0";
long j=0,k=0;
r=b.readLine();
s=b.readLine();
m=Integer.parseInt(r);
n=Integer.parseInt(s);
p=m+n;
t=String.valueOf(p);
m=r.length();
n=s.length();
p=t.length();
for(i=0;i<m;i++)
if(r.charAt(i)!='0')
v+=r.charAt(i);
v=v.trim();
for(i=0;i<n;i++)
if(s.charAt(i)!='0')
w+=s.charAt(i);
w=w.trim();
for(i=0;i<p;i++)
if(t.charAt(i)!='0')
x+=t.charAt(i);
x=x.trim();
m=Integer.parseInt(v);
n=Integer.parseInt(w);
p=Integer.parseInt(x);
if(m+n==p)
System.out.print("YES");
else
System.out.print("NO");
}
}