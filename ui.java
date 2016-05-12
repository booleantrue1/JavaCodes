import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int h=0,p=0,k=0,f=0,i=0;
String s;
char q='\0';
h=Integer.parseInt(b.readLine());
s=b.readLine();
for(i=0;i<h;i++)
{
q=s.charAt(i);
if(q!='4'&&q!='7')
{
f=1;
break;
}
}
if(f==0)
{
for(i=0;i<h/2;i++)
k+=Integer.parseInt(s.substring(i,i+1));
for(i=h/2;i<h;i++)
p+=Integer.parseInt(s.substring(i,i+1));
if(k==p)
System.out.print("YES");
else
System.out.print("NO");
}
else
System.out.print("NO");
}
}