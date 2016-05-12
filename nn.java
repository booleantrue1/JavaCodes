import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int f=0,j=0,n=0,i=0;
n=Integer.parseInt(b.readLine());
String s[];
String q="\0";
s=new String[n];
for(i=0;i<n;i++)
s[i]=b.readLine();
int d[]=new int[n];
for(i=0;i<n;i++)
d[i]=1;
for(i=0;i<n-1;i++)
{
if(s[i].compareTo(s[i+1])==0)
d[j]++;
else
j++;
}
for(i=0;i<n;i++)
if(d[i]>f)
f=d[i];
System.out.print(f);
}
}