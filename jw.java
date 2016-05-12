import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,p=0,j=0;
String s;
String r[]={"S","M","L","XL","XXL"};
int d[][]={{0,1,2,3,4},{1,2,0,3,4},{2,3,1,4,0},{3,4,2,1,0},{4,3,2,1,0}};
s=b.readLine();
int e[]=new int[5];
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<5;i++)
e[i]=Integer.parseInt(c.nextToken());
n=Integer.parseInt(b.readLine());
for(i=0;i<n;i++)
{
s=b.readLine();
for(j=0;j<5;j++)
if(r[j].compareTo(s)==0)
{
p=j;
break;
}
for(j=0;j<5;j++)
{
if(e[d[p][j]]>0)
{
e[d[p][j]]--;
System.out.println(r[d[p][j]]);
break;
}
}
}
}
}