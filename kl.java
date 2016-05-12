import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,m=0;
char q='a';
String s;
s=b.readLine();
m=s.length();
for(i=0;i<m;i++)
if(s.charAt(i)>q)
q=s.charAt(i);
for(i=0;i<m;i++)
if(s.charAt(i)==q)
System.out.print(s.charAt(i));
}
}