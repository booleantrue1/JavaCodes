import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
Scanner b=new Scanner(System.in);
int p=0,f=0;
String r,s;
while(b.hasNextLine())
{
s=b.nextLine();
r=s;
r=r.trim();
r=r.replace("  ","");
if(r.length()==0)
{
if(f==1)
f=0;
continue;
}
else
{
if(r.charAt(0)=='#')
{
p++;
f=1;
if(p==1)
System.out.println(s);
else
System.out.println("\n"+s);
}
else
{
System.out.print(r);
f=0;
}
}
}
}
}