/*<applet code=link1.class height=200 width=200></applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class link1 extends Applet implements ActionListener
{
Button b1,b2,b3;
TextField t1,t2;
frm1 obj1;
frm2 obj2;
frm3 obj3;
public void init()
{
obj1=new frm1();
obj2=new frm2();
obj3=new frm3();
t1=new TextField(10);
t2=new TextField(10);
b1=new Button("Login");
b1.addActionListener(this);
t1.addActionListener(this);
add(t1);
add(b1);
add(t2);
GridLayout ob=new GridLayout(2,2);
setLayout(ob);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==t1)
{
String t=t1.getText();
//t1.setEchoChar('*');
if(t.equalsIgnoreCase("frm1"))
{
obj1.setVisible(true);
obj2.setVisible(false);
obj3.setVisible(false);
}
else
{
if(t.equalsIgnoreCase("frm2"))
{
obj2.setVisible(true);
obj1.setVisible(false);
obj3.setVisible(false);
}
else
{
if(t.equalsIgnoreCase("frm3"))
{
obj3.setVisible(true);
obj2.setVisible(false);
obj1.setVisible(false);
}
else
t2.setText("wrong password");
}
}
}
if(e.getSource()==b1)
t1.setEchoChar('*');
}
}
class frm1 extends Frame
{
frm1()
{
super("frm1");
resize(400,400);
}
}
class frm2 extends Frame
{
frm2()
{
super("frm2");
resize(400,400);
}
}
class frm3 extends Frame
{
frm3()
{
super("frm3");
resize(400,400);
}
}