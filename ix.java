import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
Scanner b=new Scanner(System.in);
int i=0,j=0,n=0,t=0;
String s;
n=b.nextInt();
int d[]=new int[n];
int e[]=new int[n];
for(i=0;i<n;i++)
{
d[i]=b.nextInt();
e[i]=d[i];
}
shuffleArray(e);
Arrays.sort(e);
for(i=0;i<n;i++)
{
for(j=i;j<n;j++)
{
t=d[j];
d[j]=d[i];
d[i]=t;
if(Arrays.equals(d,e))
{
System.out.print("YES");
System.exit(0);
}
t=d[j];
d[j]=d[i];
d[i]=t;
}
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