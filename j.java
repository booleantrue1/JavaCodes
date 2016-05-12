import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader f = new BufferedReader(new FileReader("input.txt"));
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
int k,g,h,i;
String s;
s=f.readLine();
StringTokenizer c=new StringTokenizer(s);
g=Integer.parseInt(c.nextToken());
h=Integer.parseInt(c.nextToken());
k=(int)Math.abs(g-h);
if(g>h)
{
for(i=0;i<h;i++)
out.print("BG");
for(i=0;i<k;i++)
out.print("B");
}
else
{
for(i=0;i<g;i++)
out.print("GB");
for(i=0;i<k;i++)
out.print("G");
}
out.close();
System.exit(0);
}
}