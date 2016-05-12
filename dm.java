import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,n=0,k=0,t=0;
int d[]=new int[8];
d[0]=0;
String s;
t=Integer.parseInt(b.readLine());
for(i=0;i<t;i++)
{
n=Integer.parseInt(b.readLine());
s=b.readLine();
for(j=0;j<38;j++)
{
if(s.charAt(j)=='T'&&s.charAt(j+1)=='T'&&s.charAt(j+2)=='T')
d[0]++;
if(s.charAt(j)=='T'&&s.charAt(j+1)=='T'&&s.charAt(j+2)=='H')
d[1]++;
if(s.charAt(j)=='T'&&s.charAt(j+1)=='H'&&s.charAt(j+2)=='T')
d[2]++;
if(s.charAt(j)=='T'&&s.charAt(j+1)=='H'&&s.charAt(j+2)=='H')
d[3]++;
if(s.charAt(j)=='H'&&s.charAt(j+1)=='T'&&s.charAt(j+2)=='T')
d[4]++;
if(s.charAt(j)=='H'&&s.charAt(j+1)=='T'&&s.charAt(j+2)=='H')
d[5]++;
if(s.charAt(j)=='H'&&s.charAt(j+1)=='H'&&s.charAt(j+2)=='T')
d[6]++;
if(s.charAt(j)=='H'&&s.charAt(j+1)=='H'&&s.charAt(j+2)=='H')
d[7]++;
}
System.out.println(n+" "+d[0]+" "+d[1]+" "+d[2]+" "+d[3]+" "+d[4]+" "+d[5]+" "+d[6]+" "+d[7]);
for(j=0;j<8;j++)
d[j]=0;
}
}
}