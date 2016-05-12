/*<applet code=ss2.class width=800 height=800></applet>*/
import java.awt.*;
import java.sql.*;
import sun.jdbc.odbc.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class ss2 extends JApplet implements ActionListener, ItemListener
{
CheckboxGroup cg1;
String s1="",s2,s3,s4,s5,s6;
int a;
Checkbox cb1,cb2;
Choice c;
JLabel n1,n2,n3,n4,n5;
JTextField t1,t2,t3,t4,t5;
JButton b1;
void f()
{
try
{
new JdbcOdbcDriver();
Connection conn=DriverManager.getConnection("jdbc:odbc:imsdatabase");
System.out.println("Connection successful");
Statement s=conn.createStatement();
//s.executeUpdate("insert into register values('"+s1+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"')");
System.out.println("Table updated");
conn.close();
}
catch(Exception exc)
{
System.out.print("Connection failed");
}
}
public void init()
{
f();
c=new Choice();
c.add("Mr.");
c.add("Mrs.");
c.add("Ms.");
Checkbox cb1,cb2;
cg1=new CheckboxGroup();
cb1=new Checkbox("Male",false,cg1);
cb2=new Checkbox("Female",false,cg1);
n1=new JLabel("Name");
n2=new JLabel("Father's  /  Husband's Name");
n3=new JLabel("Date Of Birth");
n4=new JLabel("Mobile Number");
t1=new JTextField(10);
t2=new JTextField(10);
t3=new JTextField(20);
t4=new JTextField(20);
b1=new JButton("SUBMIT");
//b1.addActionListener(this);
setLayout(null);
n1.setBounds(250,50,40,20);
c.setBounds(300,50,50,20);
t1.setBounds(380,50,180,20);
cb1.setBounds(250,80,100,20);
cb2.setBounds(250,110,100,20);
n2.setBounds(250,140,170,20);
t2.setBounds(440,140,100,20);
n3.setBounds(250,170,200,20);
t3.setBounds(440,170,100,20);
n4.setBounds(250,200,150,20);
t4.setBounds(440,200,100,20);
b1.setBounds(370,240,100,20);
add(n1);add(t1);add(n2);add(t2);add(b1);add(t4);add(t3);add(n3);add(n4);add(cb1);add(cb2);add(c);
}
public void itemStateChanged(ItemEvent ex)
{
if(ex.getItemSelectable()==cb1)
s3="Male";
else
s3="Female";
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
a=c.getSelectedIndex();
if(a==0)
s1="Mr.#";
if(a==1)
s1="Mrs.#";
if(a==2)
s1="Ms.#";
s2=t1.getText();
s1=s1+s2;
s4=t2.getText();
s5=t3.getText();
s6=t4.getText();
}
}
}