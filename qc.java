import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0;
String s,r="\0",t="\0";
s=b.readLine();
char q='a';
r=s;
while(true)
{
q='a';
for(i=0;i<26;i++)
{
t+=q;
t+=q;
t=t.trim();
r=r.replace(t,"");
t="\0";
q++;
}
if(r.length()==s.length())
{
System.out.print(r);
System.exit(0);
}
else
s=r;
}
}
}