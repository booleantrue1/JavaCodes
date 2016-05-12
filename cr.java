import java.io.*;
import java.util.*;
class Combinations
{
private boolean done = false;
private int a[];
private int maxs[];
public Combinations(int num_things,int num_at_a_time)
{
a=new int[num_at_a_time];
for(int i=0;i<num_at_a_time;i++)
a[i]=i;
maxs=new int[num_at_a_time];
for(int i=num_at_a_time-1,j=0;i>-1;i--,j++)
maxs[i]=num_things-j;
}
public boolean next(int array[]) 
{
for (int k=0; k < array.length; k++)
array[k] = a[k];
return increment();
}
private boolean increment()
{
if(done)
return false;
int end = a.length - 1;
while (++a[end] == maxs[end])
{
end--;
if(end==-1)
return done=true;
}
for(int i=end+1;i<a.length;i++)
a[i]=a[i-1]+1;
return true;
}
}
class Permutations
{
private int a[];
private boolean first=true;
public Permutations(int array[])
{
a=new int[array.length];
for(int k=0;k<array.length;k++)
a[k]=array[k];
sort();
}
public boolean next(int array[]) 
{
if(first)
{
first=false;
for(int k=0;k<array.length;k++)
array[k]=a[k];
return true;
}
int t;
for(int i=a.length-1,ii,j;;)
{
ii=i--;
if(a[i]<a[ii])
{
j=a.length;
while(!(a[i]<a[--j]))
{}
t=a[i];a[i]=a[j];a[j]=t;
reverse(ii,a.length-1);
for(int k=0;k<array.length;k++)
array[k]=a[k];
return true;
}
if(i==0)
return false;
}
}
private void reverse(int b,int e)
{
int m=(b+e+1)/2;
int t;
for(int i=b,j=e;i<m;i++,j--)
{
t=a[i];a[i]=a[j];a[j]=t;
}
}
private void sort()
{
int n=a.length;
int t;
for(int g=n/2;g>0;g/=2)
for(int i=g;i<n;i++)
for(int j=i-g;j>=0;j-=g)
if(a[j]>a[j+g])
{
t=a[j];a[j]=a[j+g];a[j+g]=t;
}
}
}
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int guess[]=new int[8],count=0;
Combinations combos=new Combinations(10,8);
while(combos.next(guess))
{
Permutations permus=new Permutations(guess);
while(permus.next(guess))
{
count++;
//if((guess[1]*1000+guess[0]*100+guess[6]*10+guess[2])+(guess[1]*1000+guess[0]*100+guess[4]*10+guess[4])==(guess[3]*10000+guess[0]*1000+guess[5]*100+guess[2]*10+guess[6]))
//{
System.out.println(guess[0]+" "+guess[1]+" "+guess[2]+" "+guess[3]);//+" "+guess[2]+" "+guess[3]+" "+guess[4]+" "+guess[5]+" "+guess[6]);
//System.out.println(   " ball    " + guess[1] + guess[0] + guess[4] + guess[4] );
//System.out.println( "games   " +guess[3] +guess[0] +guess[5] +guess[2] +guess[6] );
//}
if(count==1814400)
break;
}
if(count==1814400)
break;
}
}
}