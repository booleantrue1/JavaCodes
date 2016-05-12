import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,k=0;
String s;
for(i=1;;i++)
{
s=b.readLine();
if(s.charAt(0)=='-')
System.exit(0);
for(j=0;j<2010;j++)
s=s.replace("{}","");
if(s.length()==0)
{
System.out.println(i+"."+0);
continue;
}
for(j=0;j<2010;j++)
if(s.indexOf("{{")>=0)
{
s=s.replace("{{","");
k++;
}
if(s.length()==0)
{
System.out.println(i+"."+k);
k=0;
continue;
}
for(j=0;j<2010;j++)
if(s.indexOf("}}")>=0)
{
s=s.replace("}}","");
k++;
}
if(s.length()==0)
{
System.out.println(i+"."+k);
k=0;
continue;
}
for(j=0;j<2010;j++)
if(s.indexOf("}{")>=0)
{
s=s.replace("}{","");
k+=2;
}
if(s.length()==0)
{
System.out.println(i+"."+k);
k=0;
continue;
}
k=0;
}
}
}