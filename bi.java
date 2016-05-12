import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int u=0,f=0,i=0,m=0,p=0,w=0,l=0,h=0,k=0,n=0,v=0;
String s;
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
if(n==0)
{
for(i=1;i<=m;i++)
{
System.out.print(i+" ");
if(i%3==0)
System.out.print("\n");
}
System.exit(0);
}
char d[]=new char[m];
d[0]='\0';
char q='a',r='\0';
for(i=0;i<n;i++)
{
s=b.readLine();
StringTokenizer y=new StringTokenizer(s);
k=Integer.parseInt(y.nextToken());
p=Integer.parseInt(y.nextToken());
if(d[k-1]=='\0'&&d[p-1]=='\0')
{
d[k-1]=q;
d[p-1]=q;
q++;
}
if(d[k-1]=='\0'&&d[p-1]!='\0')
d[k-1]=d[p-1];
if(d[k-1]!='\0'&&d[p-1]=='\0')
d[p-1]=d[k-1];
if(d[k-1]!='\0'&&d[p-1]!='\0')
if(d[k-1]!=d[p-1])
w=1;
}
if(w==1)
{
System.out.print("-1");
System.exit(0);
}
int e[]=new int[q-'a'];
for(r='a';r<q;r++)
{
for(i=0;i<m;i++)
{
if(d[i]==r)
e[r-'a']++; 
}
}
for(i=0;i<m;i++)
if(d[i]=='\0')
l++;
for(i=0;i<q-'a';i++)
if(e[i]==2)
h++;
if(l<h)
{
System.out.print("-1");
System.exit(0);
}
for(i=0;i<q-'a';i++)
{
if(e[i]>3)
{
System.out.print("-1");
System.exit(0);
}
}
for(r='a';r<q;r++)
{
for(i=0;i<m;i++)
if(d[i]==r)
{
System.out.print(i+1+" ");
u++;
f=1;
}
if(u==2)
{
for(i=0;i<m;i++)
if(d[i]=='\0')
{
d[i]='*';
System.out.print(i+1);
break;
}
}
u=0;
if(f==1)
System.out.print("\n");
f=0;
}
for(i=0;i<m;i++)
{
if(d[i]=='\0')
{
System.out.print(i+1+" ");
v++;
}
if(v%3==0&&v!=0)
System.out.print("\n");
}
}
}