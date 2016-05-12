import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String s;
int p=0,i=0,f=0;
char c='\0';
s=b.readLine();
p=s.length();
for(i=0;i<p;i++)
{
c=s.charAt(i);
if(c=='H'||c=='Q'||c=='9')
{
f=1;
System.out.print("YES");
break;
}
}
if(f==0)
System.out.print("NO");
}
}