import java.io.*;
import java.util.*;
class j
{
static int ptr=0,flag=0,x=0,n;
static void divide(int a[],int l,int r)
{
int found=0,t=0;
flag=0;
ptr=l;
while(found==0)
{
while(a[ptr]<=a[r]&&l!=r)
r--;
if(r==l)
found=1;
else
{
t=a[ptr];
a[ptr]=a[r];
a[r]=t;
ptr=r;
}
if(found==0)
{
while(a[ptr]>=a[l]&&l!=r)
l++;
if(r==l)
found=1;
else
{
t=a[ptr];
a[ptr]=a[l];
a[l]=t;
ptr=l;
}
}
}
}
static void qsort(int a[],int left,int right)
{
if(left<right)
{
divide(a,left,right);
if(ptr<=n)
qsort(a,left,ptr-1);
if(ptr>=-1)
qsort(a,ptr+1,right);
}
}
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0;
n=Integer.parseInt(b.readLine());
int arr[]=new int[n];
String s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<n;i++)
arr[i]=Integer.parseInt(c.nextToken());
qsort(arr,0,n-1);
System.out.println("The Sorted Array Is : ");
for(i=0;i<n;i++)
System.out.print(arr[i]+" ");
}
}
