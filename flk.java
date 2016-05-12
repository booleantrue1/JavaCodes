import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,k=0,j=0,f=0,ex=0,x=0,y=0,l=0;
int d[]=new int[3];
int e[]=new int[3];
String s[]=new String[8];
String t[]=new String[9];
String r;
for(i=0;i<8;i++)
{
s[i]=b.readLine();
StringTokenizer c=new StringTokenizer(s[i]);
x=Integer.parseInt(c.nextToken());
for(j=0;j<k;j++)
if(d[j]==x)
{
f=1;
break;
}
if(f==0)
{
if(k==3)
{
ex=1;
}
else
{
d[k]=x;
k++;
}
}
f=0;
y=Integer.parseInt(c.nextToken());
for(j=0;j<l;j++)
if(e[j]==y)
{
f=1;
break;
}
if(f==0)
{
if(l==3)
{
ex=1;
}
else
{
e[l]=y;
l++;
}
}
f=0;
}
if(ex==1)
System.out.print("ugly");
else
{
Arrays.sort(d);
Arrays.sort(e);
t[0]=String.valueOf(d[0])+" "+String.valueOf(e[0]);
t[1]=String.valueOf(d[0])+" "+String.valueOf(e[1]);
t[2]=String.valueOf(d[0])+" "+String.valueOf(e[2]);
t[3]=String.valueOf(d[1])+" "+String.valueOf(e[0]);
t[4]=String.valueOf(d[1])+" "+String.valueOf(e[2]);
t[5]=String.valueOf(d[2])+" "+String.valueOf(e[0]);
t[6]=String.valueOf(d[2])+" "+String.valueOf(e[1]);
t[7]=String.valueOf(d[2])+" "+String.valueOf(e[2]);
t[8]=String.valueOf(d[1])+" "+String.valueOf(e[1]);
f=0;
for(i=0;i<8;i++)
{
for(j=0;j<8;j++)
{
if((s[j].equals(t[i])))
{
f=1;
break;
}
}
if(f==0)
{
System.out.print("ugly");
System.exit(0);
}
f=0;
}
f=0;
for(i=0;i<8;i++)
{
if((s[i].equals(t[8])))
{
f=1;
break;
}
}
if(f==1)
{
System.out.print("ugly");
System.exit(0);
}
System.out.print("respectable");
}
}
}