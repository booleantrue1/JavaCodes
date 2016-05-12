import java.io.*;
class j
{
public static void main (String a[])throws IOException 
{
BufferedReader f = new BufferedReader(new FileReader("input.txt"));
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
int n;
String s=f.readLine();
n=Integer.parseInt(f.readLine());
if((s.compareTo("front")==0&&n==1)||(s.compareTo("back")==0&&n==2))
out.print("L");
else
out.print("R");
out.close();
}
}
