/*<applet code=radio.class height=400 width=400></applet>*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class radio extends Applet implements ItemListener
{
CheckboxGroup cg1,cg2;
Checkbox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10;
Choice c;
TextField t1,t2;
Color c1;
public void init()
{
cg1=new CheckboxGroup();
cg2=new CheckboxGroup();
cb1=new Checkbox("Blue",false,cg1);
cb2=new Checkbox("Red",false,cg1);
cb3=new Checkbox("Black",false,cg1);
cb4=new Checkbox("Green",false,cg1);
cb5=new Checkbox("Yellow",false,cg1);
cb6=new Checkbox("Blue",false,cg2);
cb7=new Checkbox("Red",false,cg2);
cb8=new Checkbox("Black",false,cg2);
cb9=new Checkbox("Green",false,cg2);
cb10=new Checkbox("Yellow",false,cg2);
setLayout(null);
add(cb1);
add(cb2);
add(cb3);
add(cb4);
add(cb5);
add(cb6);
add(cb7);
add(cb8);
add(cb9);
add(cb10);
cb1.setBounds(0,30,70,20);
cb2.setBounds(80,30,70,20);
cb3.setBounds(160,30,70,20);
cb4.setBounds(240,30,70,20);
cb5.setBounds(320,30,70,20);
t1=new TextField(20);
t2=new TextField(20);
t1.setForeground(Color.black);
t2.setForeground(Color.black);
t1.setBounds(180,60,40,20);
cb6.setBounds(0,90,70,20);
cb7.setBounds(80,90,70,20);
cb8.setBounds(160,90,70,20);
cb9.setBounds(240,90,70,20);
cb10.setBounds(320,90,70,20);
t2.setBounds(180,120,40,20);
add(t1);
add(t2);
cb1.addItemListener(this);
cb2.addItemListener(this);
cb3.addItemListener(this);
cb4.addItemListener(this);
cb5.addItemListener(this);
cb6.addItemListener(this);
cb7.addItemListener(this);
cb8.addItemListener(this);
cb9.addItemListener(this);
cb10.addItemListener(this);
}
public void itemStateChanged(ItemEvent e)
{
if(e.getItemSelectable()==cb1)
t1.setText("Blue");
if(e.getItemSelectable()==cb2)
t1.setText("Red");
if(e.getItemSelectable()==cb3)
t1.setText("Black");
if(e.getItemSelectable()==cb4)
t1.setText("Green");
if(e.getItemSelectable()==cb5)
t1.setText("Yellow");
if(e.getItemSelectable()==cb6)
t2.setText("Blue");
if(e.getItemSelectable()==cb7)
t2.setText("Red");
if(e.getItemSelectable()==cb8)
t2.setText("Black");
if(e.getItemSelectable()==cb9)
t2.setText("Green");
if(e.getItemSelectable()==cb10)
t2.setText("Yellow");
}
}