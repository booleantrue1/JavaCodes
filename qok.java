import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int t,n=0,i=0,m=-1,leftbound=0,rightbound=0,j,rightkaleft=0,leftkaright=0,outerright=0,outerleft=0,next=0,prev=0;
String s;
t=Integer.parseInt(b.readLine());
StringTokenizer c=new StringTokenizer(b.readLine());
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
int rightkaright=99999999;
int leftkaleft=-99999999;
prev=n;
if(m<n)
{
outerleft=m;
outerright=n;
rightkaleft=m;
leftkaright=n;
}
if(m>n)
{
outerleft=n;
outerright=m;
rightkaleft=n;
leftkaright=m;
}
for(i=0;i<t-2;i++)
{
next=Integer.parseInt(c.nextToken());
if(next>outerright)
{
rightkaleft=outerright;
outerright=next;
leftkaright=outerleft;
}
else
{
if(next<outerleft)
{
leftkaright=outerleft;
outerleft=next;
rightkaleft=outerright;
}
else
{
if(next<prev)
{
if(next<rightkaleft)
{
System.out.print("yes");
System.exit(0);
}
leftbound=rightkaleft;
rightbound=outerright;
}
else
{
if(next>leftkaright)
{
System.out.print("yes");
System.exit(0);
}
rightbound=leftkaright;
leftbound=outerleft;
}
break;
}
}
}
prev=next;
for(j=i+1;j<t-2;j++)
{
next=Integer.parseInt(c.nextToken());
if(next>rightbound||next<leftbound)
{
System.out.print("yes");
System.exit(0);
}
if(next<prev)
rightbound=prev;
else
leftbound=prev;
}
System.out.print("no");
}
}