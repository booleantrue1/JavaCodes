import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,i=0;
char q='\0';
String s;
s=b.readLine();
s=s.toLowerCase();
k=s.length();
for(i=k-2;i>=0;i--)
if(s.charAt(i)!=' ')
{
q=s.charAt(i);
break;
}
if(q=='a'||q=='e'||q=='i'||q=='o'||q=='u'||q=='y')
System.out.print("YES");
else
System.out.print("NO");
}
}