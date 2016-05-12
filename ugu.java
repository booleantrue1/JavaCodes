import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int index=-1,max=-100000000,min=100000000,p=0,k=0,exists=0,same=0,n=0,j=0,i=0;
String s,r;
n=Integer.parseInt(b.readLine());
String d[]=new String[n];
d[0]="\0";
int e[][]=new int[n][n];
int f[]=new int[n];
f[0]=0;
for(i=0;i<n;i++)
e[i][0]=0;
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
r=c.nextToken();
p=Integer.parseInt(c.nextToken());
for(j=0;j<k;j++)
if(d[j].compareTo(r)==0)
{
e[j][f[j]]=p+e[j][f[j]-1];
f[j]++;
exists=1;
}
if(exists==0)
{
d[k]=r;
e[k][f[k]]+=p;
f[k]++;
k++;
}
exists=0;
}
for(i=0;i<k;i++)
System.out.println(e[i][f[i]-1]);
for(i=0;i<k;i++)
{
if(e[i][f[i]-1]>max)
{
max=e[i][f[i]-1];
index=i;
same=1;
continue;
}
if(e[i][f[i]-1]==max)
same++;
index=-1;
}
if(same==1)
{
System.out.print(d[index]);
System.exit(0);
}
for(j=0;j<k;j++)
{
if(e[j][f[j]-1]!=max)
continue;
for(i=0;i<f[j];i++)
{
if(e[j][i]==max)
break;
}
if(i<min)
{
min=i;
index=j;
}
}
System.out.print(d[index]);
}
}