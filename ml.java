import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,x=0,y=0,n=0,k=0,j=0;
String s;
s=b.readLine();
n=s.length();
int d[][]=new int[2*n+3][2*n+3];
x=n+1;
y=n+1;
d[x][y]++;
for(i=0;i<n;i++)
{
if(s.charAt(i)=='L')
d[--x][y]++;
if(s.charAt(i)=='R')
d[++x][y]++;
if(s.charAt(i)=='U')
d[x][++y]++;
if(s.charAt(i)=='D')
d[x][--y]++;
}
//System.out.print(x+" "+y);
if(Math.sqrt((x-n-1)*(x-n-1)+(y-n-1)*(y-n-1))!=0&&Math.sqrt((x-n-1)*(x-n-1)+(y-n-1)*(y-n-1))!=1)
{
for(i=1;i<2*n+2;i++)
{
for(j=1;j<2*n+2;j++)
{
if(d[i][j]>1)
{
System.out.print("BUG");
System.exit(0);
}
if(d[i][j]==1)
{
if(d[i-1][j]==1)
k++;
if(d[i+1][j]==1)
k++;
if(d[i][j-1]==1)
k++;
if(d[i][j+1]==1)
k++;
if(k>2)
{
System.out.print("BUG");
System.exit(0);
}
}
k=0;
}
}
System.out.print("OK");
System.exit(0);
}
if(Math.sqrt((x-n-1)*(x-n-1)+(y-n-1)*(y-n-1))==0)
{
if(n==0)
{
System.out.print("OK");
System.exit(0);
}
else
{
System.out.print("BUG");
System.exit(0);
}
}
if(Math.sqrt((x-n-1)*(x-n-1)+(y-n-1)*(y-n-1))==1)
{
if(n==1)
{
System.out.print("OK");
System.exit(0);
}
else
{
System.out.print("BUG");
System.exit(0);
}
}
}
}