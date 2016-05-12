import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
String s;
int p=0,i=0,f=0;
char c='\0';
char d='\0';
s=b.readLine();
p=s.length();
for(i=0;i<p-1;i++)
{
c=s.charAt(i);
d=s.charAt(i+1);
if(c==d)
{
f++;
if(f==6)
{
System.out.print("YES");
break;
}
}
else 
f=0;
}
if(f<6)
System.out.print("NO");
}
}