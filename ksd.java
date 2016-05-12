import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int m=0,i=0,p=0,k=0,j=0,t=0;
String s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
k=Integer.parseInt(c.nextToken());
m=Integer.parseInt(c.nextToken());
String d[]=new String[k];
String e[]=new String[m];
e[0]="\0";
for(i=0;i<k;i++)
d[i]=b.readLine();
for(i=0;i<m;i++)
{
for(j=0;j<k;j++)
e[i]+=d[j].charAt(i);
e[i]=e[i].trim();
}
for(i=0;i<k;i++)
if(d[i].indexOf('S')<0)
t++;
for(i=0;i<m;i++)
if(e[i].indexOf('S')<0)
p++;
System.out.print(t*m+p*k-t*p);
}
}