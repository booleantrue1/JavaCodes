import java.io.*;
class x
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,k=0,i=0;
char c='\0';
String d="\0";
String e="\0";
String s[];
p=Integer.parseInt(b.readLine());
s=new String[p];
for(i=0;i<p;i++)
s[i]=b.readLine();
for(i=0;i<p;i++)
{
k=s[i].length();
if(k<11)
System.out.println(s[i]);
else
{
e=String.valueOf(k-2);
d=d+s[i].charAt(0)+e+s[i].charAt(k-1);
d=d.trim();
System.out.println(d);
}
d="\0";
}
}
}