import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
long t=0;
int i=1,j=0,k=0;
String s;
long d[]=new long[4];
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
while(in.ready()==true)
{
s=in.readLine();
StringTokenizer c=new StringTokenizer(s);
d[0]=Long.parseLong(c.nextToken());
d[1]=Long.parseLong(c.nextToken());
d[2]=Long.parseLong(c.nextToken());
d[3]=Long.parseLong(c.nextToken());
for(j=0;j<3;j++)
for(k=j+1;k<4;k++)
if(d[k]>d[j])
{
t=d[j];
d[j]=d[k];
d[k]=t;
}
System.out.println("Case "+i+": "+(d[0]+d[1]));
i++;
}
}
}