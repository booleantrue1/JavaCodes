import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0;
String s;
s=b.readLine();
for(i=0;i<50;i++)
s=s.replace("  "," ");
s=s.replace(" ,",",");
s=s.replace("... ","...");
s=s.replace(",",", ");
s=s.replace("..."," ...");
for(i=0;i<50;i++)
s=s.replace("  "," ");
System.out.print(s.trim());
}
}