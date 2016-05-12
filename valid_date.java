import java.io.*;
class mahesh
{
public static void main(String arg[])throws IOException
{String s;
int d,m,y,r,f=0;
BufferedReader n=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER A DATE IN FORM OF DD/MM/YYYY");
s=n.readLine();
d=Integer.parseInt(s.substring(0,2));
m=Integer.parseInt(s.substring(3,5));
y=Integer.parseInt(s.substring(6,10));
r=y%4;
switch(m)
{
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:if(d>31)
        {
		f=1;
		}
		break;
case 4:
case 6:
case 9:
case 11:if(d>30)
        {
		f=1;
		}
		break;
case 2:if(r==0)
       {
	   if(d>29)
       {	   
	   f=1;
	   }}
	   else if(d>28)
	   {
	   f=1;
	   }
	   break;
default : f=1;
}		
if(f==0)
System.out.println(s);
else System.out.println("INVALID DATE");
}
}