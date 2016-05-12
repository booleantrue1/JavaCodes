import java.io.*;
import java.util.*;
class j
{
public static void main (String a[])throws IOException 
{
BufferedReader f = new BufferedReader(new FileReader("input.txt"));
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
int n=0,i=0,m=0,p=0,t=0;
String s;
n=Integer.parseInt(f.readLine());
s=f.readLine();
for(i=0;i<n;i++)
{
if(s.charAt(i)=='1'&&t==1)
{
p=i;
break;
}
if(s.charAt(i)=='1'&&t==0)
{
m=i;
t=1;
}
}
m=p-m;
n=s.lastIndexOf('1');
for(i=p;i<=n;i++)
{
if(((i-p)%m==0&&s.charAt(i)=='1')||((i-p)%m!=0&&s.charAt(i)=='0'))
continue;
else
{
out.print("NO");
t=2;
break;
}
}
if(t!=2)
out.print("YES");
out.close();
}
}