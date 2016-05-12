import java.io.*;
import java.util.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int t=0,p=0,j=0,n=0,k=0,i=0;
char d[][]=new char[6][6];
d[0][0]='a';
d[0][1]='a';
d[0][2]='a';
d[0][3]='a';
d[0][4]='a';
d[0][5]='a';
d[1][0]='a';
d[1][5]='a';
d[2][0]='a';
d[2][5]='a';
d[3][0]='a';
d[3][5]='a';
d[4][5]='a';
d[5][0]='a';
d[5][1]='a';
d[5][2]='a';
d[5][3]='a';
d[5][4]='a';
d[5][5]='a';
String s;
for(i=1;i<5;i++)
{
s=b.readLine();
for(j=1;j<5;j++)
{
d[i][j]=s.charAt(j-1);
}
}
for(i=1;i<5;i++)
{
for(j=1;j<5;j++)
{
if((d[i][j]==d[i][j+1]&&d[i][j]==d[i+1][j])||(d[i][j]==d[i][j+1]&&d[i][j]==d[i+1][j+1])||(d[i][j]==d[i][j+1]&&d[i][j]==d[i-1][j+1])||(d[i][j]==d[i][j+1]&&d[i][j]==d[i-1][j]))
{System.out.print("YES");
System.exit(0);
}}
}
System.out.print("NO");
}
}