import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,i=0;
String s;
int d[][]=new int[5][5];
int e[][]=new int[5][5];
d[0][0]=0;
d[0][1]=0;
d[0][2]=0;
d[0][3]=0;
d[0][4]=0;
d[1][4]=0;
d[2][4]=0;
d[3][4]=0;
d[1][0]=0;
d[2][0]=0;
d[3][0]=0;
d[4][0]=0;
d[4][1]=0;
d[4][2]=0;
d[4][3]=0;
d[4][4]=0;
e[0][0]=0;
e[0][1]=0;
e[0][2]=0;
e[0][3]=0;
e[0][4]=0;
e[1][4]=0;
e[2][4]=0;
e[3][4]=0;
e[1][0]=0;
e[2][0]=0;
e[3][0]=0;
e[4][0]=0;
e[4][1]=0;
e[4][2]=0;
e[4][3]=0;
e[4][4]=0;
for(i=1;i<4;i++)
{
s=b.readLine();
StringTokenizer c =new StringTokenizer(s);
for(j=1;j<4;j++)
e[i][j]=Integer.parseInt(c.nextToken());
}
for(i=1;i<4;i++)
for(j=1;j<4;j++)
d[i][j]=1;
for(i=1;i<4;i++)
{
for(j=1;j<4;j++)
if(e[i][j]%2!=0)
{
d[i-1][j]=(int)Math.abs(d[i-1][j]-1);
d[i][j-1]=(int)Math.abs(d[i][j-1]-1);
d[i][j]=(int)Math.abs(d[i][j]-1);
d[i][j+1]=(int)Math.abs(d[i][j+1]-1);
d[i+1][j]=(int)Math.abs(d[i+1][j]-1);
}
}
for(i=1;i<4;i++)
{
for(j=1;j<4;j++)
System.out.print(d[i][j]);
System.out.print("\n");
}
}
}