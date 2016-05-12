import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,p=1,m=0,n=0,k=0,i=0;
String s,t="\0",r="\0";
n=Integer.parseInt(b.readLine());
for(k=0;k<n;k++)
{
s=b.readLine();
m=s.length();
for(j=0;j<m;j++)
{
if(s.charAt(j)=='A')
{
if(s.charAt(m-1-j)=='A')
r+="A";
else
r+="Z";
}
else
{
if(s.charAt(j)=='Z')
{
if(s.charAt(m-1-j)=='A')
r+="A";
else
r+="Z";
}
else
r+=s.charAt(j);
}
}
r=r.trim();
t+=r+"\n";
r="\0";
}
System.out.print(t.trim());
}
}
