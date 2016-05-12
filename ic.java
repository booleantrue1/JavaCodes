import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,n=0,m=0,p=0,t=0,i=0,j=0;
StringTokenizer c=new StringTokenizer(b.readLine());
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
k=Integer.parseInt(c.nextToken());
int d[]=new int[100005];
int e[]=new int[100005];
for(i=0;i<100005;i++)
{
d[i]=-1;
e[i]=-1;
}
d[0]=(m*k+n)%p;
e[0]=d[0];
for(i=1;;i++)
{
d[i]=(m*d[i-1]+n)%p;
shuffleArray(e);
Arrays.sort(e);
t=Arrays.binarySearch(e,d[i]);
if(t<0)
e[0]=d[i];
else
{
for(j=0;;j++)
if(d[j]==d[i])
{
System.out.print(i-j);
System.exit(0);
}
}
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