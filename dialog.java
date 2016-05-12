/*<applet code=dialog.class height=400 width=400></applet>*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class dialog extends JApplet implements ActionListener
{
JLabel l;
JButton b1,b2,b3;
JDialog dial;
public void init()
{
l=new JLabel("click ok or cancel");
b1=new JButton("display dialog");
b2=new JButton("ok");
b3=new JButton("cancel");
dial=new JDialog((Frame)null,"Dialog");
Container cp=getContentPane();//Container is an abstract class hence memory can not be made. This is for the main window.
Container dc=dial.getContentPane();//This is for dialog box window.
cp.setLayout(new FlowLayout());
cp.add(b1);//b1 button added to main window.
dc.setLayout(new FlowLayout());
dc.setBackground(Color.green);
dc.add(l);
dc.add(b2);
dc.add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
dial.setBounds(100,100,100,150);
dial.show();//dial.setVisible(true);
}
if(e.getSource()==b2)
{
showStatus("you pressed ok");
dial.dispose();//dial.setVisible(false);
}
if(e.getSource()==b3)
{
showStatus("you pressed cancel");
dial.dispose();//dial.setVisible(false);
}
}
}