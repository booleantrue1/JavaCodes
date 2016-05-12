import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class hot extends JFrame implements ActionListener 
{
JButton b;
JLabel l;
JTextField t;
hot()
{
super("HOT KEY");
resize(400,400);
Container cp=getContentPane();
cp.setLayout(new FlowLayout());
b=new JButton("SHOW");
l=new JLabel("CHECK");
t=new JTextField(20);
b.addActionListener(this);
cp.add(l);
cp.add(t);
cp.add(b);
b.setMnemonic('S');
pack();//does not work in applet.
show();
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b)
{
t.setText("Hot Key");
l.setText("HOT KEY");
}
}
public static void main(String aa[])
{
hot obj=new hot();
}
}