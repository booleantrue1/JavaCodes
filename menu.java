import java.awt.*;
import java.awt.event.*;
class men extends Frame implements ActionListener
{
Menu menu;
MenuBar mb,mb1;
MenuItem i1,i2,i3;
Label n1;
TextField t;
men()
{
super("MENU PROG");
resize(1000,1000);
setLayout(new GridLayout(2,2));
n1=new Label("NUM1");
mb=new MenuBar();
menu=new Menu("FILE");
i1=new MenuItem("ITEM 1");
i2=new MenuItem("ITEM 2");
i3=new MenuItem("ITEM 3");
add(n1);
t=new TextField(20);
add(t);
menu.add(i1);
menu.add(i2);
menu.add(i3);
i1.addActionListener(this);
i2.addActionListener(this);
i3.addActionListener(this);
mb.add(menu);
setMenuBar(mb);
show();
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==i1)
t.setText("ITEM 1");
if(e.getSource()==i2)
t.setText("ITEM 2");
if(e.getSource()==i3)
t.setText("ITEM 3");
}
public static void main(String AA[])
{
men obj=new men();
}
}