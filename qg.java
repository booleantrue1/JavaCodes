import java.io.*;
import java.util.*;
class j
{
public static void main(String aa[])throws IOException
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int e1=0,e2=0,f1=0,f2=0,g1=0,g2=0,x=0,y=0,y1=0,y2=0,m1=0,m2=0,d1=0,d2=0,i=0,p=0,q=0,k=0;
String r,s;
r=b.readLine();
s=b.readLine();
e1=Integer.parseInt(r.substring(0,4));
e2=Integer.parseInt(s.substring(0,4));
f1=Integer.parseInt(r.substring(5,7));
f2=Integer.parseInt(s.substring(5,7));
g1=Integer.parseInt(r.substring(8,10));
g2=Integer.parseInt(s.substring(8,10));
if(e1<e2)
{
y1=e1;
y2=e2;
m1=f1;
m2=f2;
d1=g1;
d2=g2;
}
if(e1>e2)
{
y1=e2;
y2=e1;
m1=f2;
m2=f1;
d1=g2;
d2=g1;
}
if(e1==e2)
{
if(f1<f2)
{
y1=e1;
y2=e2;
m1=f1;
m2=f2;
d1=g1;
d2=g2;
}
if(f1>f2)
{
y1=e2;
y2=e1;
m1=f2;
m2=f1;
d1=g2;
d2=g1;
}
if(f1==f2)
{
if(g1<g2)
{
y1=e1;
y2=e2;
m1=f1;
m2=f2;
d1=g1;
d2=g2;
}
if(g1>g2)
{
y1=e2;
y2=e1;
m1=f2;
m2=f1;
d1=g2;
d2=g1;
}
if(g1==g2)
{
System.out.print("0");
System.exit(0);
}
}
}
for(i=y1+1;i<y2;i++)
{
if(i%100!=0)
{
if(i%4==0)
k+=366;
else
k+=365;
}
else
{
if(i%400==0)
k+=366;
else
k+=365;
}
}
if(y1%100!=0)
{
if(y1%4==0)
{
if(m1==1)
p=366-(d1-1);
if(m1==2)
p=366-31-(d1-1);
if(m1==3)
p=366-31-29-(d1-1);
if(m1==4)
p=366-31-29-31-(d1-1);
if(m1==5)
p=366-31-29-31-30-(d1-1);
if(m1==6)
p=366-31-29-31-30-31-(d1-1);
if(m1==7)
p=366-31-29-31-30-31-30-(d1-1);
if(m1==8)
p=366-31-29-31-30-31-30-31-(d1-1);
if(m1==9)
p=366-31-29-31-30-31-30-31-31-(d1-1);
if(m1==10)
p=366-31-29-31-30-31-30-31-31-30-(d1-1);
if(m1==11)
p=366-31-29-31-30-31-30-31-31-30-31-(d1-1);
if(m1==12)
p=366-31-29-31-30-31-30-31-31-30-31-30-(d1-1);
x=366-p;
}
else
{
if(m1==1)
p=365-(d1-1);
if(m1==2)
p=365-31-(d1-1);
if(m1==3)
p=365-31-28-(d1-1);
if(m1==4)
p=365-31-28-31-(d1-1);
if(m1==5)
p=365-31-28-31-30-(d1-1);
if(m1==6)
p=365-31-28-31-30-31-(d1-1);
if(m1==7)
p=365-31-28-31-30-31-30-(d1-1);
if(m1==8)
p=365-31-28-31-30-31-30-31-(d1-1);
if(m1==9)
p=365-31-28-31-30-31-30-31-31-(d1-1);
if(m1==10)
p=365-31-28-31-30-31-30-31-31-30-(d1-1);
if(m1==11)
p=365-31-28-31-30-31-30-31-31-30-31-(d1-1);
if(m1==12)
p=365-31-28-31-30-31-30-31-31-30-31-30-(d1-1);
x=365-p;
}
}
else
{
if(y1%400==0)
{
if(m1==1)
p=366-(d1-1);
if(m1==2)
p=366-31-(d1-1);
if(m1==3)
p=366-31-29-(d1-1);
if(m1==4)
p=366-31-29-31-(d1-1);
if(m1==5)
p=366-31-29-31-30-(d1-1);
if(m1==6)
p=366-31-29-31-30-31-(d1-1);
if(m1==7)
p=366-31-29-31-30-31-30-(d1-1);
if(m1==8)
p=366-31-29-31-30-31-30-31-(d1-1);
if(m1==9)
p=366-31-29-31-30-31-30-31-31-(d1-1);
if(m1==10)
p=366-31-29-31-30-31-30-31-31-30-(d1-1);
if(m1==11)
p=366-31-29-31-30-31-30-31-31-30-31-(d1-1);
if(m1==12)
p=366-31-29-31-30-31-30-31-31-30-31-30-(d1-1);
x=366-p;
}
else
{
if(m1==1)
p=365-(d1-1);
if(m1==2)
p=365-31-(d1-1);
if(m1==3)
p=365-31-28-(d1-1);
if(m1==4)
p=365-31-28-31-(d1-1);
if(m1==5)
p=365-31-28-31-30-(d1-1);
if(m1==6)
p=365-31-28-31-30-31-(d1-1);
if(m1==7)
p=365-31-28-31-30-31-30-(d1-1);
if(m1==8)
p=365-31-28-31-30-31-30-31-(d1-1);
if(m1==9)
p=365-31-28-31-30-31-30-31-31-(d1-1);
if(m1==10)
p=365-31-28-31-30-31-30-31-31-30-(d1-1);
if(m1==11)
p=365-31-28-31-30-31-30-31-31-30-31-(d1-1);
if(m1==12)
p=365-31-28-31-30-31-30-31-31-30-31-30-(d1-1);
x=365-p;
}
}
if(y2%100!=0)
{
if(y2%4==0)
{
if(m2==1)
q=d2;
if(m2==2)
q=31+d2;
if(m2==3)
q=31+29+d2;
if(m2==4)
q=31+29+31+d2;
if(m2==5)
q=31+29+31+30+d2;
if(m2==6)
q=31+29+31+30+31+d2;
if(m2==7)
q=31+29+31+30+31+30+d2;
if(m2==8)
q=31+29+31+30+31+30+31+d2;
if(m2==9)
q=31+29+31+30+31+30+31+31+d2;
if(m2==10)
q=31+29+31+30+31+30+31+31+30+d2;
if(m2==11)
q=31+29+31+30+31+30+31+31+30+31+d2;
if(m2==12)
q=31+29+31+30+31+30+31+31+30+31+30+d2;
y=366-q;
}
else
{
if(m2==1)
q=d2;
if(m2==2)
q=31+d2;
if(m2==3)
q=31+28+d2;
if(m2==4)
q=31+28+31+d2;
if(m2==5)
q=31+28+31+30+d2;
if(m2==6)
q=31+28+31+30+31+d2;
if(m2==7)
q=31+28+31+30+31+30+d2;
if(m2==8)
q=31+28+31+30+31+30+31+d2;
if(m2==9)
q=31+28+31+30+31+30+31+31+d2;
if(m2==10)
q=31+28+31+30+31+30+31+31+30+d2;
if(m2==11)
q=31+28+31+30+31+30+31+31+30+31+d2;
if(m2==12)
q=31+28+31+30+31+30+31+31+30+31+30+d2;
y=365-q;
}
}
else
{
if(y2%400==0)
{
if(m2==1)
q=d2;
if(m2==2)
q=31+d2;
if(m2==3)
q=31+29+d2;
if(m2==4)
q=31+29+31+d2;
if(m2==5)
q=31+29+31+30+d2;
if(m2==6)
q=31+29+31+30+31+d2;
if(m2==7)
q=31+29+31+30+31+30+d2;
if(m2==8)
q=31+29+31+30+31+30+31+d2;
if(m2==9)
q=31+29+31+30+31+30+31+31+d2;
if(m2==10)
q=31+29+31+30+31+30+31+31+30+d2;
if(m2==11)
q=31+29+31+30+31+30+31+31+30+31+d2;
if(m2==12)
q=31+29+31+30+31+30+31+31+30+31+30+d2;
y=366-q;
}
else
{
if(m2==1)
q=d2;
if(m2==2)
q=31+d2;
if(m2==3)
q=31+28+d2;
if(m2==4)
q=31+28+31+d2;
if(m2==5)
q=31+28+31+30+d2;
if(m2==6)
q=31+28+31+30+31+d2;
if(m2==7)
q=31+28+31+30+31+30+d2;
if(m2==8)
q=31+28+31+30+31+30+31+d2;
if(m2==9)
q=31+28+31+30+31+30+31+31+d2;
if(m2==10)
q=31+28+31+30+31+30+31+31+30+d2;
if(m2==11)
q=31+28+31+30+31+30+31+31+30+31+d2;
if(m2==12)
q=31+28+31+30+31+30+31+31+30+31+30+d2;
y=365-q;
}
}
if(y2-y1>0)
System.out.print(k+p+q-1);
else
{
if(y1%100!=0)
{
if(y1%4==0)
System.out.print(366-x-y-1);
else
System.out.print(365-x-y-1);
}
else
{
if(y1%400==0)
System.out.print(366-x-y-1);
else
System.out.print(365-x-y-1);
}
}
}
}