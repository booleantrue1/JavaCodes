import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b = new BufferedReader(new FileReader("input.txt"));
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
int i=0,n=0,m=0,k=0;
String s;
n=Integer.parseInt(b.readLine());
int d[]=new int[2*n];
int e[][]=new int[n][2];
int f[]=new int[5001];
for(i=0;i<5001;i++)
f[i]=-1;
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=1;i<=2*n;i++)
{
m=Integer.parseInt(z.nextToken());
if(f[m]==-1)
f[m]=i;
else
{
e[k][0]=f[m];
e[k][1]=i;
f[m]=-1;
k++;
}
}
if(k!=n)
out.print("-1");
else
{
for(i=0;i<n;i++)
out.println(e[i][0]+" "+e[i][1]);
}
out.close();
}
}