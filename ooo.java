import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,n=0,j=0,i=0,t=0,f=0;
String s,q;
s="hello";
char k='\0';
q=b.readLine();
t=q.length();
for(j=0;j<5;j++)
{
k=s.charAt(j);
for(i=f;f<t;f++)
{
if(q.charAt(f)==k)
{
p=1;
break;
}
}
if(p==1)
{
n++;
p=0;
f++;
}
else
break;
}
if(n==5)
System.out.print("YES");
else
System.out.print("NO");
}
}