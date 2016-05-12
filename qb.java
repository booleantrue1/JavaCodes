import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,l=0,k=0,m=0,n=0,i=0,c=0;
String u="",s,t="\0",r="\0",p="\0";
n=Integer.parseInt(b.readLine());
for(i=0;i<n;i++)
{
s=b.readLine();
if(s.compareTo("pwd")==0)
System.out.println(r.trim()+"/");
else
{
StringTokenizer z=new StringTokenizer(s);
t=z.nextToken();
t=z.nextToken();
if(t.charAt(0)!='/')
{
r+="/";
if(t.indexOf("..")>=0)
{
k=t.length();
for(j=0;j<k;j++)
{
if(t.charAt(j)=='.')
{
l=r.length();
r=r.substring(0,l-1);
r=r.substring(0,(r.lastIndexOf("/")));
j++;
}
else
r+=t.charAt(j);
}
}
else
r+=t;
}
else
{
r="\0";
if(t.indexOf("..")>=0)
{
k=t.length();
for(j=0;j<k;j++)
{
if(t.charAt(j)=='.')
{
l=r.length();
r=r.substring(0,l-1);
r=r.substring(0,(r.lastIndexOf("/")));
j++;
}
else
r+=t.charAt(j);
}
}
else
r+=t;
}
}
}
}
}