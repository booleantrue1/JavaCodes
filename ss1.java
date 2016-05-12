/*<applet code=ss1.class width=800 height=800></applet>*/
import java.awt.*;
import java.sql.*;
import sun.jdbc.odbc.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.lang.*;
public class ss1 extends JApplet implements ActionListener, ItemListener
{
String string_fullname="",string_name,string_relname,string_gender,string_dob,string_mobno;
CheckboxGroup chkgrp_gender;
Checkbox chkbox_male,chkbox_female;
Choice choice_sal;
JLabel label_name,label_relname,label_dob,label_mobno;
JTextField txtfield_name,txtfield_relname,txtfield_dob,txtfield_mobno;
JButton button_submit;
public void init()
{
CheckboxGroup chkgrp_gender;
choice_sal=new Choice();
choice_sal.add("Mr.");
choice_sal.add("Mrs.");
choice_sal.add("Ms.");
Checkbox chkbox_male,chkbox_female;
chkgrp_gender=new CheckboxGroup();
chkbox_male=new Checkbox("Male",false,chkgrp_gender);
chkbox_female=new Checkbox("Female",false,chkgrp_gender);
chkbox_male.addItemListener(this);
chkbox_female.addItemListener(this);
label_name=new JLabel("Name");
label_relname=new JLabel("Father's  /  Husband's Name");
label_dob=new JLabel("Date Of Birth");
label_mobno=new JLabel("Mobile Number");
txtfield_name=new JTextField(10);
txtfield_relname=new JTextField(10);
txtfield_dob=new JTextField(20);
txtfield_mobno=new JTextField(20);
button_submit=new JButton("SUBMIT");
button_submit.addActionListener(this);
setLayout(null);
label_name.setBounds(250,50,40,20);
choice_sal.setBounds(300,50,50,20);
txtfield_name.setBounds(380,50,180,20);
chkbox_male.setBounds(250,80,100,20);
chkbox_female.setBounds(250,110,100,20);
label_relname.setBounds(250,140,170,20);
txtfield_relname.setBounds(440,140,100,20);
label_dob.setBounds(250,170,200,20);
txtfield_dob.setBounds(440,170,100,20);
label_mobno.setBounds(250,200,150,20);
txtfield_mobno.setBounds(440,200,100,20);
button_submit.setBounds(370,240,100,20);
add(label_name);add(txtfield_name);add(label_relname);add(txtfield_relname);
add(button_submit);add(txtfield_mobno);add(txtfield_dob);add(label_dob);
add(label_mobno);add(chkbox_male);add(chkbox_female);add(choice_sal);
}
public void itemStateChanged(ItemEvent ie)
{
//System.out.println("itemchanged");
if(ie.getItemSelectable()==chkbox_male) 
  {string_gender="Male";System.out.println(string_gender);}
else if(ie.getItemSelectable()==chkbox_female) 
  {string_gender="Female";System.out.println(string_gender);}
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==button_submit)
{
int sal_index=choice_sal.getSelectedIndex();
if(sal_index==0)
string_fullname="Mr.#";
if(sal_index==1)
string_fullname="Mrs.#";
if(sal_index==2)
string_fullname="Ms.#";
string_name=txtfield_name.getText();
string_fullname=string_fullname+string_name;
string_relname=txtfield_relname.getText();
string_dob=txtfield_dob.getText();
string_mobno=txtfield_mobno.getText();
DatabaseConnection db = new DatabaseConnection(string_fullname,string_gender,string_relname,string_dob,string_mobno);
}}}
class DatabaseConnection extends Frame
{
DatabaseConnection(String string_fullname,String string_gender,String string_relname,String string_dob,String string_mobno)
{
super();
try
{
new JdbcOdbcDriver();
Connection conn=DriverManager.getConnection("jdbc:odbc:Database1");
//System.out.println("Connection successful");
Statement s=conn.createStatement();
s.executeUpdate("insert into register values('"+string_fullname+"','"+string_gender+"','"+string_relname+"','"+string_dob+"','"+string_mobno+"')");
/*s.executeUpdate("update tabfav set grade='PASS' where per>=40");
ResultSet r=s.executeQuery("select * from register");
while(r.next())
{
System.out.print(r.getInt(1));
System.out.print(" "+r.getString(2));
System.out.println(" "+r.getString(3));
System.out.println(" "+r.getString(4));
}
System.out.println("Table updated");
*/
conn.close();
}
catch(Exception exc)
{
System.out.print(exc.getMessage());
}
}
}