import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,k=0,i=0,m=0;
String s;
int d[][];
m=Integer.parseInt(b.readLine());
d=new int[m][m];
for(j=0;j<m;j++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(i=0;i<m;i++)
d[j][i]=Integer.parseInt(z.nextToken());
}
for(j=0;j<m;j++)
for(i=0;i<m;i++)
if(i==j||i+j==m-1||i==(m-1)/2||j==(m-1)/2)
k+=d[j][i];
System.out.print(k);
}
}