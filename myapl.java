/*<applet code=myapl.class width=600 height=600></applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class myapl extends Applet implements ActionListener
{
double a,b,c;
int f=0;
Label n1,n2,n4;
TextField t1,t2,t3,t4;
Button b1,b2,b3,b4,b5,b6;
public void init()
{
n1=new Label("NUM1");
n2=new Label("NUM2");
n4=new Label("OUTPUT");
t1=new TextField(10);
t2=new TextField(10);
t4=new TextField(20);
b3=new Button("ADD");
b4=new Button("SUBTRACT");
b5=new Button("MULTIPLY");
b6=new Button("DIVIDE");
b1=new Button("SHOW");
b2=new Button("REFRESH");
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
setLayout(null);
n1.setBounds(50,50,40,20);
t1.setBounds(100,50,150,20);
n2.setBounds(50,80,40,20);
t2.setBounds(100,80,150,20);
b3.setBounds(30,110,70,20);
b4.setBounds(110,110,70,20);
b5.setBounds(190,110,70,20);
b6.setBounds(270,110,70,20);
b1.setBounds(160,140,50,20);
n4.setBounds(130,170,60,20);
t4.setBounds(200,170,250,20);
b2.setBounds(160,200,70,20);
add(n1);add(t1);add(n2);add(t2);add(b3);add(b4);add(b5);add(b6);add(b1);add(n4);add(t4);add(b2);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b3)
{
a=Double.parseDouble(t1.getText());
b=Double.parseDouble(t2.getText());
c=a+b;
}
if(e.getSource()==b4)
{
a=Double.parseDouble(t1.getText());
b=Double.parseDouble(t2.getText());
c=a-b;
}
if(e.getSource()==b5)
{
a=Double.parseDouble(t1.getText());
b=Double.parseDouble(t2.getText());
c=a*b;
}
if(e.getSource()==b6)
{
a=Double.parseDouble(t1.getText());
b=Double.parseDouble(t2.getText());
if(b==0)
f=1;
else
c=a/b;
}
if(e.getSource()==b1)
{
if(f==1)
t4.setText("CAN NOT DIVIDE BY ZERO");
else
t4.setText(String.valueOf(c));
}
if(e.getSource()==b2)
{
t1.setText("");
t2.setText("");
t4.setText("");
f=0;
}
}
}