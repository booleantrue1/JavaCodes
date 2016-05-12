import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int t=0,j=0,f=0,k=0,n=0;
double p=0,i=0;
String v[];
int d[];
int e[]=new int[360];
n=Integer.parseInt(b.readLine());
d=new int[n];
for(i=0;i<n;i++)
d[(int)i]=Integer.parseInt(b.readLine());
v=new String[n];
for(i=3;i<361;i++)
{
p=180*(i-2)/i;
j=(int)p;
if(j==p)
{
e[k]=j;
k++;
}
}
for(t=0;t<n;t++)
{
for(i=0;i<k;i++)
{
if(d[t]==e[(int)i])
{
v[t]="YES";
f=1;
break;
}
}
if(f!=1)
v[t]="NO";
f=0;
}
for(i=0;i<n;i++)
System.out.println(v[(int)i]);
}
}