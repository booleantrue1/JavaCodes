import java.io.*;
class x
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,i=0;
String s,t;
s=b.readLine();
char c='\0';
String d="\0";
t=s.toLowerCase();
p=t.length();
for(i=0;i<p;i++)
{
c=t.charAt(i);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='y');
else
d=d+'.'+c;
}
d=d.trim();
System.out.print(d);
}
}