import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int k=0,f=-1,g=-1,h=-1,j=0,u=0,v=0,w=0,m=0,i=0;
m=Integer.parseInt(b.readLine());
String s[];
String p="\0",q="\0",r="\0",z,t="\0";
for(i=0;i<m;i++)
{
z=b.readLine();
StringTokenizer c=new StringTokenizer(z);
k=Integer.parseInt(c.nextToken());
t=c.nextToken();
s=new String[k];
for(j=0;j<k;j++)
{
s[j]=b.readLine();
if(s[j].charAt(0)==s[j].charAt(1)&&s[j].charAt(0)==s[j].charAt(3)&&s[j].charAt(0)==s[j].charAt(4)&&s[j].charAt(0)==s[j].charAt(6)&&s[j].charAt(0)==s[j].charAt(7))
u++;
else
{
if(s[j].charAt(0)>s[j].charAt(1)&&s[j].charAt(1)>s[j].charAt(3)&&s[j].charAt(3)>s[j].charAt(4)&&s[j].charAt(4)>s[j].charAt(6)&&s[j].charAt(6)>s[j].charAt(7))
v++;
else
w++;
}
}
if(u>f)
{p=t;f=u;}
else
if(u==f)
{p+=(", "+t);f=u;}
if(v>g)
{q=t;g=v;}
else
if(v==g)
{q+=(", "+t);g=v;}
if(w>h)
{r=t;h=w;}
else
if(h==w)
{r+=(", "+t);h=w;}
u=0;v=0;w=0;}
System.out.println("If you want to call a taxi, you should call: "+(p.trim())+".");
System.out.println("If you want to order a pizza, you should call: "+(q.trim())+".");
System.out.println("If you want to go to a cafe with a wonderful girl, you should call: "+(r.trim())+".");
}
}

