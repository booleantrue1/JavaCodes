import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i;
String s="\0",u="\0",r="\0",t="\0";
String d[]={"C","C#","D","D#","E","F","F#","G","G#","A","B","H","C","C#","D","D#","E","F","F#","G","G#","A","B"};
u=b.readLine();
StringTokenizer z=new StringTokenizer(u);
r=z.nextToken();
s=z.nextToken();
t=z.nextToken();
if(r.compareTo(s)!=0&&s.compareTo(t)!=0&&t.compareTo(r)!=0)
{
for(i=0;i<12;i++)
if((r.equals(d[i])||r.equals(d[i+4])||r.equals(d[i+7]))&&(s.equals(d[i])||s.equals(d[i+4])||s.equals(d[i+7]))&&(t.equals(d[i])||t.equals(d[i+4])||t.equals(d[i+7])))
{
System.out.print("major");
System.exit(0);
}
for(i=0;i<12;i++)
if((r.equals(d[i])||r.equals(d[i+3])||r.equals(d[i+7]))&&(s.equals(d[i])||s.equals(d[i+3])||s.equals(d[i+7]))&&(t.equals(d[i])||t.equals(d[i+3])||t.equals(d[i+7])))
{
System.out.print("minor");
System.exit(0);
}
System.out.print("strange");
}
else
System.out.print("strange");
}
}