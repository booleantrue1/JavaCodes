import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=0,i=0,max=-1,p=0,count=0;
String s;
n=Integer.parseInt(b.readLine());
StringTokenizer c=new StringTokenizer(b.readLine());
int nos[]=new int[n];
int curp[]=new int[100001];
int prevp[]=new int[100001];
int cd[]=new int[100001];
int flag[]=new int[100001];
for(i=0;i<=100000;i++)
{
curp[i]=0;
prevp[i]=0;
cd[i]=0;
flag[i]=0;
}
for(i=0;i<n;i++)
{
//System.out.println(count);
nos[i]=Integer.parseInt(c.nextToken());
if(curp[nos[i]]==0)
{
curp[nos[i]]=i+1;
prevp[nos[i]]=i+1;
count++;
}
else
{
if(cd[nos[i]]==0)
{
cd[nos[i]]=i+1-prevp[nos[i]];
prevp[nos[i]]=i+1;
}
else
{
if(cd[nos[i]]==i+1-prevp[nos[i]])
{
prevp[nos[i]]=i+1;
}
else
{
if(flag[nos[i]]!=-1)
{flag[nos[i]]=-1;count--;}
}
}
}
}
System.out.println(count);
for(i=1;i<=100000;i++)
if(curp[i]!=0&&flag[i]!=-1)
System.out.println(i+" "+cd[i]);
}
}