import java.io.*;
class x
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,i=0,f=0;
String s=b.readLine();
String d="\0";
String e;
e=s.toUpperCase();
p=s.length();
if(s.charAt(0)>64&&s.charAt(0)<91)
{
if(e.compareTo(s)==0)
{f=1;
System.out.print(e.toLowerCase());
}else
{f=1;
System.out.print(s);
}}
else
{
for(i=1;i<p;i++)
if(s.charAt(i)<65||s.charAt(i)>90)
{
f=1;
System.out.print(s);
break;
}
}
if(f==0)
System.out.print(((s.substring(0,1)).toUpperCase())+((s.substring(1)).toLowerCase()));
}
}

