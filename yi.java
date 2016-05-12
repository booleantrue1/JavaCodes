import java.io.*;
class y
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int l=0,p=1,g=0,i=0,z=0,k=0;
String c;
c=b.readLine();
k=c.length();
if(c.compareTo("CCCCCP")==0||c.compareTo("PPPPPC")==0)
System.out.print("2");
else
{
for(i=0;i<k-1;i++)
{
l=0;
if(c.charAt(i)==c.charAt(i+1))
p++;
else
{
p=1;
g++;
}
if(p==5)
{
l=1;
p=1;
g++;
if(i!=k-3)
i++;
}
}
if(k>6)
if(c.charAt(k-2)==c.charAt(k-3)&&c.charAt(k-3)==c.charAt(k-4)&&c.charAt(k-4)==c.charAt(k-5)&&c.charAt(k-5)==c.charAt(k-6)&&c.charAt(k-6)!=c.charAt(k-7)&&c.charAt(k-7)==c.charAt(k-1))
z=1;
if(l==0&&z!=1)
System.out.print(g+1);
else
System.out.print(g);
}
}
}