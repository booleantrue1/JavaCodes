import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,m=0,n=0,p=0;
String s[];
String t;
for(i=0;;i++)
{
t=b.readLine();
StringTokenizer c=new StringTokenizer(t);
m=Integer.parseInt(c.nextToken());
n=Integer.parseInt(c.nextToken());
p=Integer.parseInt(c.nextToken());
if(m==0&&n==0&&p==0)
break;
if(n-m==p-n)
s[i]="AP"+String.valueOf(p+p-n);
else
s[i]="GP"+String.valueOf(p*p/n);
}
s=new String[i];
for(j=0;j<i;j++)
System.out.println(s[j]);
}
}