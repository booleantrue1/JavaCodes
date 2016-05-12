import java.io.*;
class j
{
public static void main(String a[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(b.readLine()),i=0,u=0,v=0,w=0,f=0,g=0;
String s="\0",r="\0";
for(i=0;i<n;i++)
{
r=b.readLine();
s=b.readLine();
s=s.replace(" ","");
u=s.indexOf('+');
v=s.indexOf('=');
w=s.indexOf('m');
if(w<u)
{
f=Integer.parseInt(s.substring(u+1,v));
g=Integer.parseInt(s.substring(v+1));
System.out.println((g-f)+" + "+f+" = "+g);
}
if(w>u&&w<v)
{
f=Integer.parseInt(s.substring(0,u));
g=Integer.parseInt(s.substring(v+1));
System.out.println(f+" + "+(g-f)+" = "+g);
}
if(w>v)
{
f=Integer.parseInt(s.substring(0,u));
g=Integer.parseInt(s.substring(u+1,v));
System.out.println(f+" + "+g+" = "+(f+g));
}
}
}
}

