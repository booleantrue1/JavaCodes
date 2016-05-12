import java.io.*;
import java.util.*;
class y
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,i=0;
char q='\0';
String c,r="\0",s="\0";
c=b.readLine();
r=b.readLine();
for(i=0;i<p;i++)
{
if(c.charAt(i)=='.')
{
q=c.charAt(i+1);
r=c.substring(0,i-1);
s=c.substring(i-1,i);
}
}
if(s.compareTo("9")==0)
System.out.print("GOTO Vasilisa.");
else
{
if(q<'5')
System.out.print(r+s);
else
System.out.print(r+(String.valueOf((Integer.parseInt(s))+1)));
}
}
}