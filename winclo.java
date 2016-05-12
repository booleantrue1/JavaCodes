import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
class frm extends JFrame
{
int size;
int unit;
Color a1,b1;
frm(int n,Color a,Color b)
{
size=n;
a1=a;
b1=b;
unit=500/size;
resize(unit*n+14,unit*n+37);
show();
wa obj=new wa();
addWindowListener(obj);
}
public void paint(Graphics g)
{
int countx=0,i;
int county=0,j;
for(i=7,countx=0;countx<size;i+=unit,countx++)
for(j=30,county=0;county<size;j+=unit,county++)
{
if((i+j-37)%(2*unit)==unit)
{
g.setColor(a1);
g.fillRect(i,j,unit,unit);
}
else
{
g.setColor(b1);
g.fillRect(i,j,unit,unit);
}
}
}
public static void main(String args[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the colors and the number of tiles");
System.out.println("1 for RED\n2 for BLUE\n3 for GREEN\n4 for YELLOW\n5 for BLACK");
String s=b.readLine();
int c1=0,c2=0;
StringTokenizer c=new StringTokenizer(s);
double col1=Double.parseDouble(c.nextToken());
double col2=Double.parseDouble(c.nextToken());
double tmp=Double.parseDouble(c.nextToken());
if(col1>0&&col1<6&&(col1-(int)col1)==0)
c1=(int)col1;
else
{
System.out.println("INVALID INPUT");
System.exit(0);
}
if(col2>0&&col2!=col1&&col2<6&&(col2-(int)col2)==0)
c2=(int)col2;
else
{
System.out.println("INVALID INPUT");
System.exit(0);
}
int n=0;
if(tmp>0&&(tmp-(int)tmp)==0)
n=(int)tmp;
else
{
System.out.println("INVALID INPUT");
System.exit(0);
}
Color co1=Color.WHITE;
Color co2=Color.WHITE;
if(c1==1)
co1=Color.RED;
if(c1==2)
co1=Color.BLUE;
if(c1==3)
co1=Color.GREEN;
if(c1==4)
co1=Color.YELLOW;
if(c1==5)
co1=Color.BLACK;
if(c2==1)
co2=Color.RED;
if(c2==2)
co2=Color.BLUE;
if(c2==3)
co2=Color.GREEN;
if(c2==4)
co2=Color.YELLOW;
if(c2==5)
co2=Color.BLACK;
frm obj1=new frm(n,co1,co2);
}
}
class wa extends WindowAdapter
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
}