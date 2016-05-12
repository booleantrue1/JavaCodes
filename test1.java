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
System.out.print(a[i]+" ");
int arr[]={5,3,4,2,1};
n = arr.length;
Long arr_obj[] = new Long[n];     /* Long basically is a wrapper class for which we have made an array of objects . In the loop, each object of the array is allocated memory equal to the elements of the array to be sorted. However, this sort is Mergesort.*/
for(i=0;i<n;i++)
arr_obj[i] = new Long(arr[i]);
Arrays.sort(arr_obj);
for(i=0;i<n;i++)
System.out.print(arr_obj[i]+" ");
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