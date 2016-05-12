/*<applet code=table.class width=200 height=100></applet>*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class table extends JApplet
{
Object[] data=new Object[3];
String c[]={"RNO","NAME","PER"};
String r[][]={{"1","a","90"},{"2","b","40"},{"3","c","34"},{"4","d","90"},{"5","e","93"},{"6","f","50"}
,{"7","g","90"},{"8","g","90"},{"9","h","50"},{"10","i","70"}};
DefaultTableModel dml=new DefaultTableModel();
JTable jt=new JTable(dml);
public void init()
{
for(int col=0;col<3;col++)
dml.addColumn(c[col]);
for(int row=0;row<10;row++)
{
for(int col=0;col<3;col++)
data[col]=r[row][col];
dml.addRow(data);
}
getContentPane().add(new JScrollPane(jt));
}
}