import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p,m,n;
StringTokenizer c=new StringTokenizer(b.readLine());
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
if((n==m/2||n==m/2+1)&&(p==m/2||p==m/2+1))
System.out.print("NO");
else
System.out.print("YES");
}
}