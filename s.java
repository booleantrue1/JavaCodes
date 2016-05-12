import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String s,g;
int p=0,i=0,k=0,t=0,f=0;
s=b.readLine();
char q='\0';
char c='\0';
p=s.length();
for(i=0;i<p;i++)
{
c=s.charAt(i);
if(c=='4'||c=='7')
k++;
}
g=String.valueOf(k);
t=g.length();
for(i=0;i<t;i++)
{
q=g.charAt(i);
if(q!='4'&&q!='7')
{
f=1;
System.out.print("NO");
break;
}
}
if(f==0)
System.out.print("YES");
}
}
