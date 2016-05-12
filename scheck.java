/*<applet code=scheck.class width=800 height=800></applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.sql.*;
import sun.jdbc.odbc.*;
public class scheck extends JApplet
{
JButton b1=new JButton("hello");
public void init()
{
Container cp=getContentPane();
cp.setLayout(null);
b1.setBounds(50,100,100,100);
cp.add(b1);
}
}