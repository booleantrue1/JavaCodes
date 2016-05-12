import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int j=0,p=0,k=0,w=0,i=0;
double d=0;
String s,u="\0";
s=b.readLine();
d=Double.parseDouble(s);
if(d==0)
System.out.print("$0.00");
if(d>0)
{
p=s.length();
for(i=0;i<p;i++)
{
if(s.charAt(i)=='.')
{
k=1;
j=i;
if(p-j-1>=2)
u="."+s.charAt(j+1)+s.charAt(j+2);
if(p-j-1==1)
u="."+s.charAt(j+1)+"0";
break;
}
if(k==1)
break;
}
if(k==0)
{
u="."+"0"+"0";
j=i;
}
for(i=j-1;i>=0;i--)
{
u=s.charAt(i)+u;
w++;
if(w==3&&i!=0)
{
u=","+u;
w=0;
}
}
System.out.print("$"+u);
}
if(d<0)
{
s=s.replace("-"," ");
s=s.trim();
p=s.length();
for(i=0;i<p;i++)
{
if(s.charAt(i)=='.')
{
k=1;
j=i;
if(p-j-1>=2)
u="."+s.charAt(j+1)+s.charAt(j+2);
if(p-j-1==1)
u="."+s.charAt(j+1)+"0";
break;
}
if(k==1)
break;
}
if(k==0)
{
u="."+"0"+"0";
j=p;
}
for(i=j-1;i>=0;i--)
{
u=s.charAt(i)+u;
w++;
if(w==3&&i!=0)
{
u=","+u;
w=0;
}
}
System.out.print("("+"$"+u+")");
}
}
}