import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int z=0,y=0,p=0,j=0,i=0,n=0,x=0,k=0,x1=0,y1=0,x2=0,y2=0,x3=0,y3=0;
String s,s1,s2,s3,s4;
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
s1=c.nextToken();
s2=c.nextToken();
s3=c.nextToken();
s4=c.nextToken();
x1=((int)s1.charAt(0)-96);
y1=9-Integer.parseInt(s1.substring(1,2));
x2=((int)s2.charAt(0)-96);
y2=9-Integer.parseInt(s2.substring(1,2));
x3=((int)s3.charAt(0)-96);
y3=9-Integer.parseInt(s3.substring(1,2));
x=((int)s4.charAt(0)-96);
y=9-Integer.parseInt(s4.substring(1,2));
for(i=x1+1;i<10;i++)
{
if(y1==y3&&i==x3)
break;
d[y1][i]=1;
}
for(i=x1-1;i>=0;i--)
{
if(y1==y3&&i==x3)
break;
d[y1][i]=1;
}
for(i=y1+1;i<10;i++)
{
if(x1==x3&&i==y3)
break;
d[i][y1]=1;
}
for(i=y1-1;i>=0;i--)
{
if(x1==x3&&i==y3)
break;
d[i][y1]=1;
}
for(i=x2+1;i<10;i++)
{
if(y2==y3&&i==x3)
break;
d[y2][i]=1;
}
for(i=x2-1;i>=0;i--)
{
if(y2==y3&&i==x3)
break;
d[y2][i]=1;
}
for(i=y2+1;i<10;i++)
{
if(x2==x3&&i==y3)
break;
d[i][y2]=1;
}
for(i=y2-1;i>=0;i--)
{
if(x2==x3&&i==y3)
break;
d[i][y2]=1;
}
d[y3][x3]=1;
d[y3][x3-1]=1;
d[y3][x3+1]=1;
d[y3+1][x3]=1;
d[y3+1][x3-1]=1;
d[y3+1][x3+1]=1;
d[y3-1][x3]=1;
d[y3-1][x3+1]=1;
d[y3-1][x3-1]=1;
for(i=0;i<10;i++)
{
for(j=0;j<10;j++)
System.out.print(d[i][j]+" ");
System.out.println();
}
if(d[y][x]==1&&d[y][x-1]==1&&d[y][x+1]==1&&d[y+1][x]==1&&d[y+1][x-1]==1&&d[y+1][x+1]==1&&d[y-1][x]==1&&d[y-1][x+1]==1&&d[y-1][x-1]==1)
System.out.print("CHECKMATE");
else
System.out.print("OTHER");
}
}