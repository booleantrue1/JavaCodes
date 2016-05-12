import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b = new BufferedReader(new FileReader("input.txt"));
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
int g=0,t=0,p=0,u=0,l=0,v=0,j=0,m=0,n=0,f=0,i=0;
String s,r;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
String d[][]=new String[m][n];
for(i=0;i<m;i++)
for(j=0;j<n;j++)
d[i][j]="#";
char q='\0';
for(i=0;i<p;i++)
{
f=0;
s=b.readLine();
q=s.charAt(0);
StringTokenizer z=new StringTokenizer(s);
if(q=='+')
{
r=z.nextToken();
u=Integer.parseInt(z.nextToken());
v=Integer.parseInt(z.nextToken());
r=z.nextToken();
for(t=u-1;t<m;t++)
{
for(j=v-1;j<n;j++)
{
if(d[t][j].compareTo("#")==0)
{
d[t][j]=r;
f=1;
break;
}
}
if(f==1)
break;
else
v=1;
}
}
else
{
r=z.nextToken();
r=z.nextToken();
for(t=0;t<m;t++)
{
for(j=0;j<n;j++)
{
if(d[t][j].compareTo(r)==0)
{
d[t][j]="#";
out.println(t+1+" "+(j+1));
g=1;
break;
}
}
if(g==1)
break;
}
if(g==0)
out.println("-1 -1");
g=0;
}
}
out.close();
}
}