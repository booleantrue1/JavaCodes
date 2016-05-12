import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,y=0,z=0,j=0,i=0,t=0,f=0;
String s,q,r;
char k='\0';
s=b.readLine();
q=b.readLine();
r=b.readLine();
s=s+q;
p=s.length();
t=r.length();
if(t!=p)
System.out.print("NO");
else
{
for(i=0;i<p;i++)
{
k=s.charAt(i);
for(j=0;j<p;j++)
if(s.charAt(j)==k)
y++;
for(j=0;j<t;j++)
if(r.charAt(j)==k)
z++;
if(y==z)
{
y=0;
z=0;
continue;
}
else
{
f=1;
break;
}
}
if(f==0)
System.out.print("YES");
else
System.out.print("NO");
}
}
}