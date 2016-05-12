import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int z=0,y=0,p=0,j=0,i=0,n=0,x=0,k=0;
String s;
s=b.readLine();
int d[][]=new int[10][10];
for(i=0;i<10;i++)
{
d[i][0]=1;
d[i][9]=1;
}
for(i=0;i<10;i++)
{
d[0][i]=1;
d[9][i]=1;
}
StringTokenizer c=new StringTokenizer(s);
s=c.nextToken();
x=((int)s.charAt(0)-96);
y=9-Integer.parseInt(s.substring(1,2));
for(i=0;i<10;i++)
if(i!=y)
d[i][x]=1;
for(i=0;i<10;i++)
if(i!=x)
d[y][i]=1;
s=c.nextToken();
x=((int)s.charAt(0)-96);
y=9-Integer.parseInt(s.substring(1,2));
for(i=0;i<10;i++)
if(i!=y)
d[i][x]=1;
for(i=0;i<10;i++)
if(i!=x)
d[y][i]=1;
s=c.nextToken();
x=((int)s.charAt(0)-96);
y=9-Integer.parseInt(s.substring(1,2));
d[y][x]=1;
d[y][x-1]=1;
d[y][x+1]=1;
d[y+1][x]=1;
d[y+1][x-1]=1;
d[y+1][x+1]=1;
d[y-1][x]=1;
d[y-1][x+1]=1;
d[y-1][x-1]=1;
s=c.nextToken();
x=((int)s.charAt(0)-96);
y=9-Integer.parseInt(s.substring(1,2));
if(d[y][x]==1&&d[y][x-1]==1&&d[y][x+1]==1&&d[y+1][x]==1&&d[y+1][x-1]==1&&d[y+1][x+1]==1&&d[y-1][x]==1&&d[y-1][x+1]==1&&d[y-1][x-1]==1)
System.out.print("CHECKMATE");
else
System.out.print("OTHER");
}
}