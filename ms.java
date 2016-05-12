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
a=MergeSort(a,0,n-1);
for(i=0;i<n;i++)
x+=Math.abs(a[i]-(i+1));
System.out.print((long)x);
}
	public static int[] MergeSort(int[] a,int low,int high)
		{
		if(low>=high)
			{
			return a;
			}
		else
			{
			int middle=(high+low)/2;
			int[] left = new int [middle-low+1];
			int[] right = new int [high-middle];
			int i=0,count=0;
			for(i=0;i<=middle-low;i++)
				{
				left[count]=a[i];count++;
				}
			count=0;
			for(i=middle+1-low;i<=high-low;i++)
				{
				right[count]=a[i];count++;
				}
			int[] SortedLeft =MergeSort(left,low,middle);
			int[] SortedRight =MergeSort(right,middle+1,high);
			return Merge(SortedLeft,SortedRight,low,high);
			}
		}
	public static int[] Merge(int[] sl,int[] sr,int low,int high)
		{
		int fina[]  = new int[high-low+1];
		int i=0,middle =(high+low)/2;
		int a=0,b=0,alimit=middle-low+1,blimit=high-middle;
		int n=alimit+blimit;
		/*System.out.println("sl");
		for(i=0;i<alimit;i++)
			{
			int x = sl[i].getValue();
			int y = sl[i].getIndex();
			System.out.println(x+" "+y);
			}
		System.out.println("sr");
		for(i=0;i<blimit;i++)
			{
			int x = sr[i].getValue();
			int y = sr[i].getIndex();
			System.out.println(x+" "+y);
			}*/
		for(i=0;i<n;i++)
			{
			if(a!=alimit&&(b==blimit||(sl[a]<=sr[b]&&a<alimit)))
				{
				fina[i]=sl[a];
				a++;
				}
			else
				{
				fina[i]=sr[b];
				b++;
				}
			}
		return fina;
		}
	}