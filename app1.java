/*<applet code=app1.class height=500 width=450></applet>*/
import java.awt.*;
import java.applet.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
public class app1 extends JApplet implements ActionListener
{
int x1=0,y1=0,x2=0,y2=0,x3=0,y3=0;
JButton p1,p2;
//TextField t1;
JLabel win1,win2,draw;
int i,j;
static int counter=1;
JButton arr[][]=new JButton[3][3];
static int flag[][]=new int[3][3];
JButton ar[][]=new JButton[3][3];
public void init()
{
win1=new JLabel("     PLAYER FIRST WINS");
win1.setForeground(Color.RED);
win2=new JLabel("    PLAYER SECOND WINS");
win2.setForeground(Color.RED);
draw=new JLabel("           MATCH DRAW");
draw.setForeground(Color.RED);
p1=new JButton("PLAYER FIRST TURN");
p2=new JButton("PLAYER SECOND PLEASE WAIT");
add(p1);
add(p2);
//t1=new TextField("0");
//add(t1);
for(i=0;i<3;i++)
for(j=0;j<3;j++)
flag[i][j]=0;
for(i=0;i<3;i++)
for(j=0;j<3;j++)
arr[i][j]=new JButton("");
setLayout(null);
for(i=0;i<3;i++)
for(j=0;j<3;j++)
add(arr[i][j]);
arr[0][0].setBounds(0,0,150,150);
arr[0][1].setBounds(150,0,150,150);
arr[0][2].setBounds(300,0,150,150);
arr[1][0].setBounds(0,150,150,150);
arr[1][1].setBounds(150,150,150,150);
arr[1][2].setBounds(300,150,150,150);
arr[2][0].setBounds(0,300,150,150);
arr[2][1].setBounds(150,300,150,150);
arr[2][2].setBounds(300,300,150,150);
p1.setBounds(5,470,219,20);
p2.setBounds(225,470,220,20);
//t1.setBounds(100,500,100,30);
p2.setEnabled(false);
for(i=0;i<3;i++)
for(j=0;j<3;j++)
arr[i][j].addActionListener(this);
p1.addActionListener(this);
p2.addActionListener(this);
for(i=0;i<3;i++)
for(j=0;j<3;j++)
arr[i][j].setEnabled(false);
}
public void actionPerformed(ActionEvent e)
{
showStatus("Match Is In Progress....");
if(e.getSource()==p1||e.getSource()==p2)
{
int i,j;
for(i=0;i<3;i++)
for(j=0;j<3;j++)
arr[i][j].setEnabled(true);
if(e.getSource()==p1)
p1.setEnabled(false);
if(e.getSource()==p2)
p2.setEnabled(false);
}
else
{
if(counter%2==1)
{
p2.setText("PLAYER SECOND TURN");
p1.setText("PLAYER FIRST PLEASE WAIT");
p1.setEnabled(false);
p2.setEnabled(true);
counter++;
if(e.getSource()==arr[0][0])
{
flag[0][0]=1;
ar[0][0]=new JButton("",new ImageIcon("pic1.jpg"));
ar[0][0].setBounds(0,0,150,150);
add(ar[0][0]);
remove(arr[0][0]);
}
if(e.getSource()==arr[0][1])
{
flag[0][1]=1;
ar[0][1]=new JButton("",new ImageIcon("pic1.jpg"));
ar[0][1].setBounds(150,0,150,150);
add(ar[0][1]);
remove(arr[0][1]);
}
if(e.getSource()==arr[0][2])
{
flag[0][2]=1;
ar[0][2]=new JButton("",new ImageIcon("pic1.jpg"));
ar[0][2].setBounds(300,0,150,150);
add(ar[0][2]);
remove(arr[0][2]);
}
if(e.getSource()==arr[1][0])
{
flag[1][0]=1;
ar[1][0]=new JButton("",new ImageIcon("pic1.jpg"));
ar[1][0].setBounds(0,150,150,150);
add(ar[1][0]);
remove(arr[1][0]);
}
if(e.getSource()==arr[1][1])
{
flag[1][1]=1;
ar[1][1]=new JButton("",new ImageIcon("pic1.jpg"));
ar[1][1].setBounds(150,150,150,150);
add(ar[1][1]);
remove(arr[1][1]);
}
if(e.getSource()==arr[1][2])
{
flag[1][2]=1;
ar[1][2]=new JButton("",new ImageIcon("pic1.jpg"));
ar[1][2].setBounds(300,150,150,150);
add(ar[1][2]);
remove(arr[1][2]);
}
if(e.getSource()==arr[2][0])
{
flag[2][0]=1;
ar[2][0]=new JButton("",new ImageIcon("pic1.jpg"));
ar[2][0].setBounds(0,300,150,150);
add(ar[2][0]);
remove(arr[2][0]);
}
if(e.getSource()==arr[2][1])
{
flag[2][1]=1;
ar[2][1]=new JButton("",new ImageIcon("pic1.jpg"));
ar[2][1].setBounds(150,300,150,150);
add(ar[2][1]);
remove(arr[2][1]);
}
if(e.getSource()==arr[2][2])
{
flag[2][2]=1;
ar[2][2]=new JButton("",new ImageIcon("pic1.jpg"));
ar[2][2].setBounds(300,300,150,150);
add(ar[2][2]);
remove(arr[2][2]);
}
int i,j;
for(i=0;i<3;i++)
for(j=0;j<3;j++)
if(flag[i][j]==0)
arr[i][j].setEnabled(false);
}
else
{
p1.setText("PLAYER FIRST TURN");
p2.setText("PLAYER SECOND PLEASE WAIT");
p2.setEnabled(false);
p1.setEnabled(true);
counter++;
if(e.getSource()==arr[0][0])
{
flag[0][0]=2;
ar[0][0]=new JButton("",new ImageIcon("pic2.jpg"));
ar[0][0].setBounds(0,0,150,150);
add(ar[0][0]);
remove(arr[0][0]);
}
if(e.getSource()==arr[0][1])
{
flag[0][1]=2;
ar[0][1]=new JButton("",new ImageIcon("pic2.jpg"));
ar[0][1].setBounds(150,0,150,150);
add(ar[0][1]);
remove(arr[0][1]);
}
if(e.getSource()==arr[0][2])
{
flag[0][2]=2;
ar[0][2]=new JButton("",new ImageIcon("pic2.jpg"));
ar[0][2].setBounds(300,0,150,150);
add(ar[0][2]);
remove(arr[0][2]);
}
if(e.getSource()==arr[1][0])
{
flag[1][0]=2;
ar[1][0]=new JButton("",new ImageIcon("pic2.jpg"));
ar[1][0].setBounds(0,150,150,150);
add(ar[1][0]);
remove(arr[1][0]);
}
if(e.getSource()==arr[1][1])
{
flag[1][1]=2;
ar[1][1]=new JButton("",new ImageIcon("pic2.jpg"));
ar[1][1].setBounds(150,150,150,150);
add(ar[1][1]);
remove(arr[1][1]);
}
if(e.getSource()==arr[1][2])
{
flag[1][2]=2;
ar[1][2]=new JButton("",new ImageIcon("pic2.jpg"));
ar[1][2].setBounds(300,150,150,150);
add(ar[1][2]);
remove(arr[1][2]);
}
if(e.getSource()==arr[2][0])
{
flag[2][0]=2;
ar[2][0]=new JButton("",new ImageIcon("pic2.jpg"));
ar[2][0].setBounds(0,300,150,150);
add(ar[2][0]);
remove(arr[2][0]);
}
if(e.getSource()==arr[2][1])
{
flag[2][1]=2;
ar[2][1]=new JButton("",new ImageIcon("pic2.jpg"));
ar[2][1].setBounds(150,300,150,150);
add(ar[2][1]);
remove(arr[2][1]);
}
if(e.getSource()==arr[2][2])
{
flag[2][2]=2;
ar[2][2]=new JButton("",new ImageIcon("pic2.jpg"));
ar[2][2].setBounds(300,300,150,150);
add(ar[2][2]);
remove(arr[2][2]);
}
int i,j;
for(i=0;i<3;i++)
for(j=0;j<3;j++)
if(flag[i][j]==0)
arr[i][j].setEnabled(false);
}
//t1.setText(String.valueOf(Integer.parseInt(t1.getText()))+1);
boolean poss1=(flag[0][0]==1)&&(flag[0][1]==1)&&(flag[0][2]==1);
boolean poss2=(flag[1][0]==1)&&(flag[1][1]==1)&&(flag[1][2]==1);
boolean poss3=(flag[2][0]==1)&&(flag[2][1]==1)&&(flag[2][2]==1);
boolean poss4=(flag[0][0]==1)&&(flag[1][0]==1)&&(flag[2][0]==1);
boolean poss5=(flag[0][1]==1)&&(flag[1][1]==1)&&(flag[2][1]==1);
boolean poss6=(flag[0][2]==1)&&(flag[1][2]==1)&&(flag[2][2]==1);
boolean poss7=(flag[0][0]==1)&&(flag[1][1]==1)&&(flag[2][2]==1);
boolean poss8=(flag[2][0]==1)&&(flag[1][1]==1)&&(flag[0][2]==1);
boolean poss9=(flag[0][0]==2)&&(flag[0][1]==2)&&(flag[0][2]==2);
boolean poss10=(flag[1][0]==2)&&(flag[1][1]==2)&&(flag[1][2]==2);
boolean poss11=(flag[2][0]==2)&&(flag[2][1]==2)&&(flag[2][2]==2);
boolean poss12=(flag[0][0]==2)&&(flag[1][0]==2)&&(flag[2][0]==2);
boolean poss13=(flag[0][1]==2)&&(flag[1][1]==2)&&(flag[2][1]==2);
boolean poss14=(flag[0][2]==2)&&(flag[1][2]==2)&&(flag[2][2]==2);
boolean poss15=(flag[0][0]==2)&&(flag[1][1]==2)&&(flag[2][2]==2);
boolean poss16=(flag[2][0]==2)&&(flag[1][1]==2)&&(flag[0][2]==2);
if(poss1||poss9)
{
x1=0;
y1=0;
x2=0;
y2=1;
x3=0;
y3=2;
}
if(poss2||poss10)
{
x1=1;
y1=0;
x2=1;
y2=1;
x3=1;
y3=2;
}
if(poss3||poss11)
{
x1=2;
y1=0;
x2=2;
y2=1;
x3=2;
y3=2;
}
if(poss4||poss12)
{
x1=0;
y1=0;
x2=1;
y2=0;
x3=2;
y3=0;
}
if(poss5||poss13)
{
x1=0;
y1=1;
x2=1;
y2=1;
x3=2;
y3=1;
}
if(poss6||poss14)
{
x1=0;
y1=2;
x2=1;
y2=2;
x3=2;
y3=2;
}
if(poss7||poss15)
{
x1=0;
y1=0;
x2=1;
y2=1;
x3=2;
y3=2;
}
if(poss8||poss16)
{
x1=2;
y1=0;
x2=1;
y2=1;
x3=0;
y3=2;
}
int winner=0;
if(poss1||poss2||poss3||poss4||poss5||poss6||poss7||poss8)
winner=1;
if(poss9||poss10||poss11||poss12||poss13||poss14||poss15||poss16)
winner=2;
if(winner!=0)
{
//t1.setText("over");
int i,j;
for(i=0;i<3;i++)
for(j=0;j<3;j++)
{
if(flag[i][j]!=0)
ar[i][j].setEnabled(false);
}
for(i=0;i<3;i++)
for(j=0;j<3;j++)
{
if(flag[i][j]==0)
{
ar[i][j]=new JButton("",new ImageIcon("pic3.jpg"));
ar[i][j].setBounds(150*j,150*i,150,150);
add(ar[i][j]);
remove(arr[i][j]);
ar[i][j].setEnabled(false);
}
}
p1.setBounds(800,800,0,0);
p2.setBounds(800,800,0,0);
if(winner==1)
{
showStatus("Congratulations Player 1 !!!");
win1.setBounds(150,470,150,20);
add(win1);
}
if(winner==2)
{
showStatus("Congratulations Player 2 !!!");
win2.setBounds(150,470,150,20);
add(win2);
}
ar[x1][y1].setEnabled(true);
ar[x2][y2].setEnabled(true);
ar[x3][y3].setEnabled(true);
}
if(winner==0&&counter==10)
{
showStatus("Better Luck Next Time!!!");
p1.setBounds(800,800,0,0);
p2.setBounds(800,800,0,0);
draw.setBounds(150,470,150,20);
add(draw);
int i,j;
for(i=0;i<3;i++)
for(j=0;j<3;j++)
ar[i][j].setEnabled(false);
}
}
}
}