import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,l=0,j=0,n=0,k=0,i=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
n=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
int d[]=new int[m];
int e[]=new int[m];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<m;i++)
{
d[i]=Integer.parseInt(z.nextToken());
e[i]=d[i];
}
shuffleArray(d);
Arrays.sort(d);
for(i=0;i<n;i++)
{
j+=d[l];
d[l]--;
if(d[l]==0)
l++;
}
for(i=0;i<n;i++)
{
shuffleArray(e);
Arrays.sort(e);
k+=e[m-1];
e[m-1]--;
}
System.out.print(k+" "+j);
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