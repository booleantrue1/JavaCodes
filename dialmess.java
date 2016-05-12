/*<applet code=dialmess.class width=400 height=400></applet>*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class dialmess extends JApplet implements ActionListener 
{
JButton b1=new JButton("Button1");
JButton b2=new JButton("Button2");
JButton b3=new JButton("Button3");
JButton b4=new JButton("Button4");
JButton b5=new JButton("Button5");
public void init()
{
Container cp=getContentPane();
cp.setLayout(new FlowLayout());
cp.add(b1);cp.add(b2);cp.add(b3);cp.add(b4);cp.add(b5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
String title="DIALOG",mess=" ";
int dtype=JOptionPane.PLAIN_MESSAGE;
if(e.getSource()==b1)
{
mess="INFORMATION MESSAGE";
dtype=JOptionPane.INFORMATION_MESSAGE;
}
if(e.getSource()==b3)
{
mess="WARNING MESSAGE";
dtype=JOptionPane.WARNING_MESSAGE;
}
if(e.getSource()==b2)
{
mess="ERROR MESSAGE";
dtype=JOptionPane.ERROR_MESSAGE;
}
if(e.getSource()==b4)
{
mess="QUESTION MESSAGE";
dtype=JOptionPane.QUESTION_MESSAGE;
}
if(e.getSource()==b5)
{
mess="PLAIN MESSAGE";
dtype=JOptionPane.PLAIN_MESSAGE;
}
JOptionPane.showMessageDialog((Component)null,title,mess,dtype);
}
}