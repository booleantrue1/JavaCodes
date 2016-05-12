import java.io.*;
import java.util.*;
class j
{
public static void main (String a[])throws IOException 
{
BufferedReader f = new BufferedReader(new FileReader("input.txt"));
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
int i=0,n=0;
n=Integer.parseInt(f.readLine());
String s;
s=f.readLine();
for(i=0;i<n/2;i++)
{
if(s.charAt(i)=='L')
out.println((1+i)+" "+(n/2+1+i));
else
out.println((n/2+1+i)+" "+(1+i));
}
out.close();
System.exit(0);
}
}