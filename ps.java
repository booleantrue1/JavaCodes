import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader f = new BufferedReader(new FileReader("input.txt"));
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
int p=0,i=0,n=0;
String s;
n=Integer.parseInt(f.readLine());
for(i=0;i<n;i++)
{
p=Integer.parseInt(f.readLine());
if(p%2==0)
out.println("1");
else
out.println("0");
}
out.close();
}
}