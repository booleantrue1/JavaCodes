import java.awt.*;
import java.applet.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
public class app extends JApplet implements ActionListener
{
JLabel p1,p2;
int i,j;
JButton arr[][]=new JButton[3][3];
public void init()
{
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
}
}