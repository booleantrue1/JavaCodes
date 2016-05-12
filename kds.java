import java.io.*;
import java.util.*;
class j
{
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
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int l=0,r=0,i=0,n=0,p=0,k=0;
long value=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
int d[]=new int[n];
int e[]=new int[n];
int f[]=new int[n];
e[0]=0;
f[0]=0;
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<n;i++)
d[i]=Integer.parseInt(z.nextToken());
shuffleArray(d);
Arrays.sort(d);
for(i=0;i<k;i++)
{
s=b.readLine();
StringTokenizer y=new StringTokenizer(s);
l=Integer.parseInt(y.nextToken());
r=Integer.parseInt(y.nextToken());
e[l-1]++;
if(r<n)
e[r]--;
}
f[0]=e[0];
for(i=1;i<n;i++)
f[i]=e[i]+f[i-1];
shuffleArray(f);
Arrays.sort(f);
for(i=0;i<n;i++)
value+=(long)d[i]*f[i];
System.out.print(value);
}
}