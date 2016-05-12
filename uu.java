import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,i=0;
String r,s;
String t="\0";
r=b.readLine();
s=b.readLine();
p=r.length();
for(i=0;i<p;i++)
{
if((r.charAt(i))==(s.charAt(i)))
t=t+'0';
else
t=t+'1';
}
t=t.trim();
System.out.print(t);
}
}