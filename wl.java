import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,m=0,n=0,k=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
int d[]=new int[m];
int e[]=new int[n];
s=b.readLine();
StringTokenizer y=new StringTokenizer(s);
for(i=0;i<m;i++)
d[i]=Integer.parseInt(y.nextToken());
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<n;i++)
e[i]=Integer.parseInt(z.nextToken());
if(m>n)
{
System.out.print("YES");
System.exit(0);
}
shuffleArray(d);
shuffleArray(e);
Arrays.sort(d);
Arrays.sort(e);
for(i=m-1;i>=0;i--)
if(d[i]>e[i-m+n])
{
System.out.print("YES");
System.exit(0);
}
System.out.print("NO");
}
static void shuffleArray(int[] arr)
{
int n = arr.length;
Random rnd = new Random();
for(int i=0; i<n; ++i)
{
int tmp = arr[i];
int randomPos = i + rnd.nextInt(n-i);
arr[i] = arr[randomPos];
arr[randomPos] = tmp;
}   
}
}