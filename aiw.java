import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,j,n=0,i,canc=0;
String r="\0";
p=Integer.parseInt(b.readLine());
for(j=0;j<p;j++)
{
int count=0;
n=Integer.parseInt(b.readLine());
String s[]=new String[n+1];
int strchk[]=new int[n+1];
int ans[]=new int[n+1];
for(i=0;i<=n;i++)
{
strchk[i]=1;
ans[i]=1;
}
for(i=1;i<=n;i++)
s[i]=b.readLine();
for(i=n;i>0;i--)
if(strchk[i]==1)
{
strchk[i]=0;
if(s[i].charAt(0)=='c')
{
StringTokenizer c=new StringTokenizer(s[i]);
r=c.nextToken();
canc=Integer.parseInt(c.nextToken());
strchk[canc]=0;
ans[canc]=0;
}
}
for(i=1;i<=n;i++)
if(ans[i]==1)
count++;
System.out.println(count);
for(i=1;i<=n;i++)
if(ans[i]==1)
System.out.print(i+" ");
System.out.println();
}
}
}