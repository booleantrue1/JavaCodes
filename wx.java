import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,j=0,i=0;
double n=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Double.parseDouble(c.nextToken());
int d[]=new int[m];
int e[]=new int[m];
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
d[0]=Integer.parseInt(z.nextToken());
for(i=1;i<m;i++)
d[i]=d[i-1]+Integer.parseInt(z.nextToken());
for(i=0;i<m;i++)
{
if(d[i]>n)
{
e[j]=(i-j);
if(j>0)
n+=(d[j]-d[j-1]);
else
n+=d[j];
j++;
i--;
continue;
}
else
{
if(d[i]==n)
{
e[j]=(i-j+1);
if(j>0)
n+=(d[j]-d[j-1]);
else
n+=d[j];
j++;
i--;
continue;
}
}
if(j==m)
break;
if(i==m-1)
{
e[j]=(i-j+1);
if(j>0)
n+=(d[j]-d[j-1]);
else
n+=d[j];
j++;
i--;
}
}
Arrays.sort(e);
System.out.print(e[m-1]);
}
}