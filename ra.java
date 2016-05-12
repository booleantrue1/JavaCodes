import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int i=0,x1=0,x2=0,x=0,y1=0,y2=0,y=0,t=0;
String s;
t=Integer.parseInt(b.readLine());
for(i=0;i<t;i++)
{
s=b.readLine();
x1=(int)s.charAt(0)-96;
y1=(int)s.charAt(1)-48;
x2=(int)s.charAt(3)-96;
y2=(int)s.charAt(4)-48;
x=(int)Math.abs(x1-x2);
y=(int)Math.abs(y1-y2);
x=10*x+y;
if(x==77)
{
System.out.println("6");
continue;
}
if(x==67||x==76||x==7||x==70||x==72||x==27||x==63||x==36||x==74||x==47||x==65||x==56)
{
System.out.println("5");
continue;
}
if(x==66||x==57||x==75||x==55||x==64||x==46||x==73||x==37||x==44||x==53||x==35||x==62||x==26||x==71||x==17||x==51||x==15||x==60||x==6||x==22)
{
System.out.println("4");
continue;
}
if(x==54||x==45||x==43||x==34||x==16||x==52||x==61||x==25||x==50||x==5||x==30||x==3||x==1||x==10||x==32||x==23||x==41||x==14)
{
System.out.println("3");
continue;
}
if(x==31||x==33||x==40||x==4||x==13||x==20||x==2||x==42||x==24)
{
System.out.println("2");
continue;
}
if(x==11)
{
if((x1==1&&y1==1&&x2==2&&y2==2)||(x1==1&&y1==8&&x2==2&&y2==7)||(x1==8&&y1==1&&x2==7&&y2==2)||(x1==8&&y1==8&&x2==7&&y2==7)||(x2==1&&y2==1&&x1==2&&y1==2)||(x2==1&&y2==8&&x1==2&&y1==7)||(x2==8&&y2==1&&x1==7&&y1==2)||(x2==8&&y2==8&&x1==7&&y1==7))
System.out.println("4");
else
System.out.println("2");
continue;
}
if(x==12||x==21)
{
System.out.println("1");
continue;
}
if(x==0)
{
System.out.println("0");
continue;
}
}
}
}