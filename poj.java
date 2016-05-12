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
String d[]=new String[k];
String e[]=new String[k];
for(i=0;i<k;i++)
e[i]=" ";
for(i=0;i<k;i++)
d[i]=b.readLine();
for(i=0;i<k;i++)
{
for(j=0;j<k;j++)
e[i]+=d[j].charAt(i);
e[i]=e[i].trim();
}
for(i=0;i<k;i++)
if(d[i].indexOf('.')<0)
t++;
for(i=0;i<k;i++)
if(e[i].indexOf('.')<0)
p++;
if(t>0&&p>0)
{
System.out.print("-1");
System.exit(0);
}
if(t==0)
{
for(i=0;i<k;i++)
System.out.println(i+1+" "+(d[i].indexOf('.')+1));
System.exit(0);
}
if(p==0)
{
for(i=0;i<k;i++)
System.out.println((e[i].indexOf('.')+1)+" "+(i+1));
System.exit(0);
}
}
}