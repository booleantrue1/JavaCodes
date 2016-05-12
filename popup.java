/*<applet code=popup.class height=400 width=400></applet>*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class popup extends Applet implements ActionListener , MouseListener
{
Label l;
PopupMenu p;
MenuItem i1,i2,i3;
public void init()
{
p=new PopupMenu();
i1=new MenuItem("m");
i2=new MenuItem("n");
i3=new MenuItem("o");
i1.addActionListener(this);
i2.addActionListener(this);
i3.addActionListener(this);
p.add(i1);
p.add(i2);
p.addSeparator();
p.add(i3);
add(p);
l=new Label("mahesh");
add(l);
addMouseListener(this);
}
public void mousePressed(MouseEvent e)
{
if(e.getModifiers()==4)
{
l.setText(String.valueOf(e.getModifiers()));
p.show(this,e.getX(),e.getY());
}
}
public void mouseClicked(MouseEvent e1){}
public void mouseReleased(MouseEvent e2){}
public void mouseEntered(MouseEvent e3){}
public void mouseExited(MouseEvent e4){}
public void actionPerformed(ActionEvent ev)
{
if(ev.getSource()==i1)
l.setText("item1");
if(ev.getSource()==i2)
l.setText("item2");
if(ev.getSource()==i3)
l.setText("item3");
}
}