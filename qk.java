import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,w=0,j=0,m=0,t=0,k=0;
char q='\0';
k=Integer.parseInt(b.readLine());
String s="\0",r="\0";
for(i=0;i<k;i++)
r+=((b.readLine())+" ");
r=r.trim();
for(j=97;j<123;j++)
{
q=(char)j;
w=r.indexOf(q);
if(w>=0)
continue;
else
{
System.out.print(q);
System.exit(0);
}
}
for(m=97;m<123;m++)
{
for(j=97;j<123;j++)
{
s+=((char)m);
s+=((char)j);
s=s.trim();
w=r.indexOf(s);
if(w>=0)
{
s="\0";
continue;
}
else
{
System.out.print(s);
System.exit(0);
}
}
}
}
}