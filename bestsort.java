import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int t=0,p=0,m=0,n=0,j=0,i=0;
double x=0;
String s;
n=Integer.parseInt(b.readLine());
int a[]=new int[n];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<n;i++)
a[i]=Integer.parseInt(z.nextToken());
shuffleArray(a);
Arrays.sort(a);
for(i=0;i<n;i++)
x+=Math.abs(a[i]-(i+1));
System.out.print((long)x);
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