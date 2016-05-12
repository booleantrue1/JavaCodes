import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0;
String s=" ",r;
r=b.readLine();
Vector v=new Vector();
v.addElement(s);
n=r.length();
for(i=0;i<n;i++)
v.addElement(r.substring(i,i+1));
v.addElement(s);
for(i=0;i<n+2;i++)
{
if((v.elementAt(i)).equals(v.elementAt(i+1)))
{
v.removeElementAt(i);
v.removeElementAt(i+1);
n-=2;
i-=2;
}
System.out.println(n+" "+i);
}
n=v.size();
for(i=1;i<n-1;i++)
System.out.print(v.elementAt(i));
}
}