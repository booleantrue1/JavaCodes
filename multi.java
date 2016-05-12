import java.io.*;
import java.math.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j,n=0,t,i;
String s;
System.out.println("Enter The Sizes Of The Matrices");
int n=Integer.parseInt(b.readLine());
int a[][]=new int[n][n];
for(i=0;i<n;j++)
{
s=b.readLine();
StringTokenizer c=new StringTokenizer(s);
for(j=0;j<n;j++)
a[i][j]=Integer.parseInt(c.nextToken());
}
for(i=0;i<n;j++)
{
s=b.readLine();
StringTokenizer z=new StringTokenizer(s);
for(j=0;j<n;j++)
b[i][j]=Integer.parseInt(z.nextToken());
}
int c[][]=new int[n][n];
Thread Timer=new Thread()
{

}