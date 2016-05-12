import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,m=0,i=0;
String s,u="\0",t="\0";
int d[];
int e[];
for(;;)
{
m=Integer.parseInt(b.readLine());
d=new int[m];
e=new int[m];
if(m==0)
{System.out.print(t.trim());System.exit(0);}
else
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(i=0;i<m;i++)
{
e[i]=Integer.parseInt(c.nextToken());
d[e[i]-1]=i+1;
}
for(i=0;i<m;i++)
if(d[i]!=e[i])
{t+="not ambiguous"+"\n";break;}
if(i==m)
t+="ambiguous"+"\n";
}
}
}
}