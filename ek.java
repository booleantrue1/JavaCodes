import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int h=0,g=0,j=0,i=0,p=0,q=0,u=0,v=0,x=0,k=0;
k=Integer.parseInt(b.readLine());
String d[]=new String[k];
for(i=0;i<k;i++)
d[i]="\0";
String r="\0",s="\0",t="\0";
for(i=0;i<k;i++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
r=c.nextToken()+"0";
t=c.nextToken()+"0";
p=r.length();
q=t.length();
h=(p<q)?p:q;
g=(p<q)?q:p;
if(h==p)
for(j=0;j<q-p;j++)
r+="0";
if(h==q)
for(j=0;j<p-q;j++)
t+="0";
for(j=0;j<g-1;j++)
{
u=Integer.parseInt(r.substring(j,j+1));
v=Integer.parseInt(t.substring(j,j+1));
d[i]+=String.valueOf((x+(u+v))%10);
x=(x+(u+v))/10;
}
d[i]+=String.valueOf(x);
d[i]=d[i].trim();
for(j=g-1;j>=0;j--)
if(d[i].charAt(j)!='0')
{
d[i]=d[i].substring(0,j+1);
break;
}
for(j=0;j<g;j++)
if(d[i].charAt(j)!='0')
{
d[i]=d[i].substring(j);
break;
}
x=0;
}
for(i=0;i<k;i++)
System.out.println(d[i]);
System.exit(0);
}
}