import java.io.*;
import java.util.*;
class j
{
public static int set[]=new int[100007];
public static int group(int p)
{
int root=p;
while(set[p]!=p)
p=set[p];
while(root!=p)
{
int t=set[root];
set[root]=p;
root=t;
}
return p;
}
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int test,i,j;
test=Integer.parseInt(b.readLine());
for(i=0;i<test;i++)
{
int chefs;
chefs=Integer.parseInt(b.readLine());
int arr[]=new int[chefs+7];
String r=b.readLine();
StringTokenizer f=new StringTokenizer(r);
for(j=1;j<=chefs;j++)
arr[j]=Integer.parseInt(f.nextToken());
for(j=1;j<=chefs;j++)
set[j]=j;
int query;
query=Integer.parseInt(b.readLine());
for(j=0;j<query;j++)
{
String s=b.readLine();
StringTokenizer obj=new StringTokenizer(s);
int t,c1,c2;
t=Integer.parseInt(obj.nextToken());
if(t==0)
{
c1=Integer.parseInt(obj.nextToken());
c2=Integer.parseInt(obj.nextToken());
int u=group(c1);
int v=group(c2);
if(u==v)
{
System.out.print("Invalid query!\n");
continue;
}
if(arr[u]>arr[v])
set[v]=u;
if(arr[v]>arr[u])
set[u]=v;
}
else
{
c1=Integer.parseInt(obj.nextToken());
System.out.println(group(c1));
}
}
}
}
}