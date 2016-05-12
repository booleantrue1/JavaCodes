import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String r,s,x="\0",y="\0";
char u='\0',t='\0',v='\0',w='\0',z='\0';
r=b.readLine();
z=r.charAt(0);
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
y=c.nextToken();
t=y.charAt(0);
u=y.charAt(1);
x=c.nextToken();
v=x.charAt(0);
w=x.charAt(1);
if(t=='T')
t='O';
if(t=='J')
t='P';
if(t=='K')
t='R';
if(t=='A')
t='S';
if(v=='T')
v='O';
if(v=='J')
v='P';
if(v=='K')
v='R';
if(v=='A')
v='S';
if(u==w&&t>v&&u!=z&&w!=z)
System.out.print("YES");
else
if(u==z&&t>v&&w==z)
System.out.print("YES");
else
if(u==z&&w!=z)
System.out.print("YES");
else
System.out.print("NO");
}
}