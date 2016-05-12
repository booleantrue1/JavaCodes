import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int g=0,n=0,i=0,m=0,p=0,j=0,k=0,f=0,v=0;
char q='\0';
String s="\0",r="\0",h="\0";
m=Integer.parseInt(b.readLine());
s=b.readLine();
p=s.length();
for(i=0;i<p;i++)
{
q=s.charAt(i);
n=r.length();
for(j=0;j<n;j++)
if(q==r.charAt(j))
{
f=1;
break;
}
if(f==1)
{
f=0;
continue;
}
else
{
f=0;
r=r+q;
}
for(k=0;k<p;k++)
if(q==s.charAt(k))
v++;
if(v%m==0)
{
for(k=0;k<(v/m);k++)
h=h+q;
v=0;
}
else
{
g=1;
break;
}
}
if(g==1)
System.out.print("-1");
else
{
h=h.trim();
for(k=0;k<m;k++)
System.out.print(h);
}
}
}