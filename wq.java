import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,k=0,n=0,i=0;
char q='\0';
String s;
s=b.readLine();
n=s.length();
for(i=0;i<n;i++)
{
q=s.charAt(i);
if(q<=122&&q>=97)
k++;
}
j=n-k;
if(k<j)
System.out.print(s.toUpperCase());
else
System.out.print(s.toLowerCase());
}
}