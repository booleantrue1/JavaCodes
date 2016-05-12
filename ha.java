import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int t=0,k=0,m=0,n=0,i=0,p=0;
char u='\0',v='\0',w='\0',x='\0',q='\0';
String s,r;
r=b.readLine();
s=b.readLine();
m=r.length();
n=s.length();
if(m!=n)
System.out.print("NO");
else
{
for(i=0;i<m;i++)
{
if(r.charAt(i)==s.charAt(i))
continue;
else
{
k++;
if(k==1)
{
u=r.charAt(i);
v=s.charAt(i);
}
if(k==2)
{
w=r.charAt(i);
x=s.charAt(i);
}
if(k==3)
{
System.out.print("NO");
break;
}
}
}
if(k==1)
System.out.print("NO");
if(k==2)
{
if(u==x&&v==w)
System.out.print("YES");
else
System.out.print("NO");
}
if(k==0)
{
for(q=97;q<123;q++)
if(r.indexOf(q)!=r.lastIndexOf(q))
{
t=1;
break;
}
if(t==1)
System.out.print("YES");
else
System.out.print("NO");
}
}
}
}