import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int p=0,i=0,m=0;
String s;
m=Integer.parseInt(b.readLine());
int e[]=new int[8];
for(i=0;i<8;i++)
e[i]=0;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<m;i++)
{
p=Integer.parseInt(c.nextToken());
e[p]++;
}
if(e[5]==0&&e[7]==0&&e[1]==m/3&&e[2]>=e[4]&&e[6]>=e[3])
{
e[2]-=e[4];
e[6]-=e[3];
if(e[2]==e[6])
{
for(i=0;i<e[4];i++)
System.out.println("1 2 4");
for(i=0;i<e[3];i++)
System.out.println("1 3 6");
for(i=0;i<e[2];i++)
System.out.println("1 2 6");
}
else
System.out.print("-1");
}
else
System.out.print("-1");
}
}