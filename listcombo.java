/*<applet code=listcombo.class height=400 width=400></applet>*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class radio extends Applet implements ItemListener
{
CheckboxGroup cg1,cg2;
Checkbox cb1,cb2,cb3;
Choice c;
Font f;
List l;
TextField t;
Color c1;
String[] it={"aa","bb","cc","dd","ee"};
public void init()
{
cg1=new CheckboxGroup();
cg2=new CheckboxGroup();
cb1=new Checkbox("A",false,cg1);
cb2=new Checkbox("B",false,cg1);
cb3=new Checkbox("C",false,cg2);
add(cb1);
add(cb2);
add(cb3);
f=new Font("Serif",Font.ITALIC|Font.BOLD,10);
c1=new Color(200,0,0);
c=new Choice();
l=new List(5);
t=new TextField(20);
t.setFont(f);
setBackground(Color.green);
t.setBackground(c1);
t.setForeground(Color.white);
c.setBackground(Color.blue);
l.setBackground(Color.red);
for(String i:it)
{
c.add(i);
l.add(i);
}
//l.addActionListener(this);
add(c);
add(l);
add(t);
}
/*public void actionPerformed(ActionEvent e)
{
int i;
if(e.getSource()==c)
{
i=c.getSelectedIndex();
String ti=it[i];
showStatus(ti);
t.setText(ti);
}
if(e.getSource()==l)
{
i=l.getSelectedIndex();
String ti=it[i];
showStatus(ti);
t.setText(ti);
}
}*/
public void itemStateChange(ItemEvent e)
{
if(e.getItemSelectable()==cb1)
t.setText("A");
if(e.getItemSelectable()==cb2)
t.setText("B");
if(e.getItemSelectable()==cb3)
t.setText("C");
}
}