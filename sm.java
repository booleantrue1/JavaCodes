import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,i=0,m=0,t=0,j=0,n=0;
long p=0,q=0;
int d[];
String s;
t=Integer.parseInt(b.readLine());
for(i=0;i<t;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
d=new int[n];
s=b.readLine();
StringTokenizer e=new StringTokenizer(s);
for(j=0;j<n;j++)

{
d[j]=Integer.parseInt(e.nextToken());
p+=d[j];
}
shuffleArray(d);
Arrays.sort(d);
m=(n-k<k)?(n-k):k;
for(j=n-1;j>=m;j--)
q+=d[j];
System.out.println(2*q-p);
p=0;
q=0;
}
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