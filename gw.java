import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,l=0,m=0,k=0;
String r="\0",s;
char q='z';
s=b.readLine();
m=s.length();
for(i=0;i<m;i++)
if(s.charAt(i)<q)
q=s.charAt(i);
k=s.indexOf(q);
l=s.lastIndexOf(q);
s=s+s;
r=s.substring(k,k+m);
for(i=k;i<=l;i++)
{
if(s.charAt(i)==q)
{
if(s.substring(i,i+m).compareTo(r)<0)
{
r=s.substring(i,i+m);
k=i;
}
}
}
System.out.print(k);
}
}