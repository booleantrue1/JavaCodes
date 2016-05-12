import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,i=0;
String s[]=new String[10];
String r,t="\0";
r=b.readLine();
for(i=0;i<10;i++)
s[i]=b.readLine();
for(i=0;i<80;i+=10)
{
for(j=0;j<10;j++)
{
if(r.substring(i,i+10).compareTo(s[j])==0)
{
t+=String.valueOf(j);
break;
}
}
}
t=t.trim();
System.out.print(t);
}
}