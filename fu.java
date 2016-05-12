import java.io.*;
class j
{
static boolean verify(int d4,int m4,int y4,int d3,int m3,int y3)
{
if(y3-y4>18)
return(true);
if(y3-y4<18)
return(false);
if(y3-y4==18)
{
if(m3>m4)
return(true);
if(m3<m4)
return(false);
if(m3==m4)
{
if(d3>=d4)
return(true);
if(d3<d4)
return(false);
}
}
return(false);
}
static boolean check(int d1,int m1,int y1)
{
int r=0,f=0;
r=y1%4;
switch(m1)
{
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:if(d1>31)
        {
		f=1;
		}
		break;
case 4:
case 6:
case 9:
case 11:if(d1>30)
        {
		f=1;
		}
		break;
case 2:if(r==0)
       {
	   if(d1>29)
       {	   
	   f=1;
	   }}
	   else if(d1>28)
	   {
	   f=1;
	   }
	   break;
default : f=1;
}		
if(f==0)
return(true);
else 
return(false);
}
public static void main(String arg[])throws IOException
{
String s;
int d,m,y,do1=0,mo=0,yo=0,i=0;
BufferedReader n=new BufferedReader(new InputStreamReader(System.in));
s=n.readLine();
do1=Integer.parseInt(s.substring(0,2));
mo=Integer.parseInt(s.substring(3,5));
yo=Integer.parseInt(s.substring(6,8));
s=n.readLine();
d=Integer.parseInt(s.substring(0,2));
m=Integer.parseInt(s.substring(3,5));
y=Integer.parseInt(s.substring(6,8));
int e[][]=new int[6][3];
e[0][0]=d;e[0][1]=m;e[0][2]=y;
e[1][0]=d;e[1][1]=y;e[1][2]=m;
e[2][0]=m;e[2][1]=d;e[2][2]=y;
e[3][0]=m;e[3][1]=y;e[3][2]=d;
e[4][0]=y;e[4][1]=m;e[4][2]=d;
e[5][0]=y;e[5][1]=d;e[5][2]=m;
boolean p[]=new boolean[6];
for(i=0;i<6;i++)
p[i]=check(e[i][0],e[i][1],e[i][2]);
for(i=0;i<6;i++)
if(p[i])
{
p[i]=verify(e[i][0],e[i][1],e[i][2],do1,mo,yo);
}
for(i=0;i<6;i++)
if(p[i])
{
System.out.print("YES");
System.exit(0);
}
System.out.print("NO");
}
}