import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,n=0,t=0,j;
double tmp,base,cur,pert;
String s="\0",r="\0",name="\0",anss="\0";
t=Integer.parseInt(b.readLine());
for(i=0;i<t;i++)
{
n=Integer.parseInt(b.readLine());
s=b.readLine();
StringTokenizer c1=new StringTokenizer(s);
anss=c1.nextToken();
base=Double.parseDouble((c1.nextToken()).substring(1));
r=c1.nextToken();
cur=(Double.parseDouble(r.substring(0,r.length()-1)))*base/100+base;
for(j=1;j<n;j++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
name=c.nextToken();
tmp=Double.parseDouble((c.nextToken()).substring(1));
r=c.nextToken();
pert=Double.parseDouble((r).substring(0,r.length()-1));
if((pert*tmp)/100+tmp>cur)
{
anss=name;
cur=(pert*tmp)/100+tmp;
base=tmp;
}
else
{
if((pert*tmp)/100+tmp==cur)
{
if(tmp>base)
{
anss=name;
cur=(pert*tmp)/100+tmp;
base=tmp;
}
}
}
}
System.out.println(anss);
}
}
}