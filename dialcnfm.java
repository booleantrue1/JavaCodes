/*<APPLET CODE=dialcnfm.java HEIGHT=400 WIDTH=400>
</APPLET>*/
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class dialcnfm extends JApplet implements ActionListener
{
JButton b1,b2,b3;
public void init()
{
b1=new JButton("display dialog");
Container cp=getContentPane();//Container is an abstract class hence memory can not be made. "This is for the main window." Now to give any colour etc to the main window we have to use the next to next line.
cp.setLayout(new FlowLayout());
cp.setBackground(Color.blue);
cp.add(b1);//b1 button added to main window.
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
int result=JOptionPane.showConfirmDialog((Component)null,"abc","def",JOptionPane.OK_CANCEL_OPTION);//Component is a class which holds the default icons.
if(result==JOptionPane.OK_OPTION)
showStatus("you clicked yes");
else
showStatus("you clicked no");
}
}