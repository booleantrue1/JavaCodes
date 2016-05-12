import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0;
String s;
s=b.readLine();
for(i=0;i<10000;i++)
s=s.replace("//","/");
i=s.length();
if(s.charAt(i-1)=='/'&&i!=1)
s=s.substring(0,i-1);
System.out.print(s);
}
}