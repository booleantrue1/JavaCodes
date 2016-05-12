/*<applet code=mainscreen.class height=800 width=800></applet>*/
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class mainscreen {
	
	static ImageIcon red,redk,yellowk,yellow;
	static ActionEvent prevEvent = null;
	static JButton[] b=new JButton[64];
	static JButton righttop=null,lefttop=null,current,prev,rightbottom=null,leftbottom=null,rightrighttop,leftlefttop,rightrightbottom,leftleftbottom;
	static int counter=0;
	static JFrame frm;
	static JPanel contentPane;
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		frm = new JFrame("Checkers Window");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel(new GridLayout(8,8));
		Dimension bDimension = new Dimension(85,85);
		listener mylistener = new listener();
		JButton[] b=new JButton[64];
		redk=new ImageIcon("redk.jpg");
		yellowk=new ImageIcon("yellowk.jpg");
		red=new ImageIcon("red.jpg");
		yellow=new ImageIcon("yellow.jpg");
		for(int i = 0;i<64;++i)
		{
			b[i]=new JButton();
			b[i].setPreferredSize(bDimension);
			b[i].setVisible(true);
			b[i].addActionListener(mylistener);
			contentPane.add(b[i]);
		}
		for(int j=0;j<8;j++)
			for(int i=0;i<8;i++)
			{
				if(j%2==0)
					if(i%2==0)
					{
						b[8*j+i].setBackground(Color.RED);
						if(j<3)
							b[8*j+i].setIcon(yellow);		
						if(j>4)
							b[8*j+i].setIcon(red);
					}
					else
						b[8*j+i].setBackground(Color.BLACK);
				else if(j%2!=0)
					if(i%2==0)
						b[8*j+i].setBackground(Color.BLACK);
					else
					{
						b[8*j+i].setBackground(Color.RED);
						if(j<3)
							b[8*j+i].setIcon(yellow);
						if(j>4)
							b[8*j+i].setIcon(red);
					}
			}

		frm.setContentPane(contentPane);
		frm.pack();
		frm.setVisible(true);}
		public static class listener implements ActionListener{
			public void actionPerformed(ActionEvent currentEvent) {
				// TODO Auto-generated method stub
				current=(JButton) currentEvent.getSource();
				if(current.getBackground()==Color.RED)
				{
					if(current.getIcon()==null)
						if(prevEvent!=null)
					{
						prev=(JButton) prevEvent.getSource();
						if(prev.getIcon()==red&&counter%2!=0)
							JOptionPane.showMessageDialog(frm,"YELLOW'S TURN");
						else if(prev.getIcon()==red&&counter%2==0)
						{
							if((current.getX()==prev.getX()+85||current.getX()==prev.getX()-85))
							{
								if(current.getY()==prev.getY()-85&&current.getY()!=0)
								{
									((AbstractButton) currentEvent.getSource()).setIcon(red);
									
										((AbstractButton) prevEvent.getSource()).setIcon(null);
									counter++;
								}
								else if(current.getY()==0)
								{
									((AbstractButton) currentEvent.getSource()).setIcon(redk);
									
										((AbstractButton) prevEvent.getSource()).setIcon(null);
									counter++;
								}
							}
							else if((current.getY()==prev.getY()-170)&&(lefttop.getIcon()!=null))
								if(lefttop.getIcon()==yellow)
							{
								
									((AbstractButton) prevEvent.getSource()).setIcon(null);
									lefttop.setIcon(null);
								if(current.getY()!=0)
									((AbstractButton) currentEvent.getSource()).setIcon(red);
								else if(current.getY()==0)
									((AbstractButton) currentEvent.getSource()).setIcon(redk);
									counter++;	
							}
							else if((current.getY()==prev.getY()-170)&&(righttop.getIcon()!=null))
								if(righttop.getIcon()==yellow)
							{
								
									((AbstractButton) prevEvent.getSource()).setIcon(null);
									righttop.setIcon(null);
								if(current.getY()!=0)
									((AbstractButton) currentEvent.getSource()).setIcon(red);
								else if(current.getY()==0)
									((AbstractButton) currentEvent.getSource()).setIcon(redk);
									counter++;	
							}
						
							else
								JOptionPane.showMessageDialog(frm,"INVALID MOVE");
						//	if(lefttop.getIcon()==yellow&&leftlefttop.getIcon()==null||righttop.getIcon()==yellow&&rightrighttop.getIcon()==null||leftbottom.getIcon()==yellow&&leftleftbottom.getIcon()==null||rightbottom.getIcon()==yellow&&rightrightbottom.getIcon()==null)
						//	counter--;
						}

						else if(prev.getIcon()==yellow&&counter%2==0)
							JOptionPane.showMessageDialog(frm,"GREY'S TURN");
					    else if(prev.getIcon()==yellow&&counter%2!=0)
						{
							if((current.getX()==prev.getX()+85||current.getX()==prev.getX()-85))
							{
								if(current.getY()==prev.getY()+85&&current.getY()!=595)
								{
									((AbstractButton) currentEvent.getSource()).setIcon(yellow);
									
										((AbstractButton) prevEvent.getSource()).setIcon(null);
									counter++;
								}
								else if(current.getY()==595)
								{
									((AbstractButton) currentEvent.getSource()).setIcon(yellowk);
									
										((AbstractButton) prevEvent.getSource()).setIcon(null);
									counter++;
								}
							}
							else if((current.getY()==prev.getY()+170)&&(leftbottom.getIcon()==red||rightbottom.getIcon()==red))
							{
								
									((AbstractButton) prevEvent.getSource()).setIcon(null);
								if(current.getX()==prev.getX()-170&&(leftbottom.getIcon()==red))
									leftbottom.setIcon(null);
								else if((current.getX()==prev.getX()+170)&&(rightbottom.getIcon()==red))
									rightbottom.setIcon(null);
									counter++;
								if(current.getY()!=595)
									((AbstractButton) currentEvent.getSource()).setIcon(yellow);
								else if(current.getY()==595)
									((AbstractButton) currentEvent.getSource()).setIcon(yellowk);							
							}
							else
								JOptionPane.showMessageDialog(frm,"INVALID MOVE");
					//		if(lefttop.getIcon()==red&&leftlefttop.getIcon()==null||righttop.getIcon()==red&&rightrighttop.getIcon()==null||leftbottom.getIcon()==red&&leftleftbottom.getIcon()==null||rightbottom.getIcon()==red&&rightrightbottom.getIcon()==null)
			        //		counter--;
						}
					    else if(prev.getIcon()==redk&&counter%2==0)
					    {
					    	if((current.getX()==prev.getX()+85||current.getX()==prev.getX()-85)&&(current.getY()==prev.getY()+85||current.getY()==prev.getY()-85))
							{
									((AbstractButton) currentEvent.getSource()).setIcon(redk);
									
										((AbstractButton) prevEvent.getSource()).setIcon(null);
									counter++;
							}
					    	else if((current.getY()==prev.getY()+170||(current.getY()==prev.getY()-170)&&(lefttop.getIcon()==yellow||righttop.getIcon()==yellow||leftbottom.getIcon()==yellow||rightbottom.getIcon()==yellow)))
							{
								
									((AbstractButton) prevEvent.getSource()).setIcon(null);
								if(current.getX()==prev.getX()-170&&(leftbottom.getIcon()==yellow))
									leftbottom.setIcon(null);
								else if(current.getX()==prev.getX()-170&&(lefttop.getIcon()==yellow))
									lefttop.setIcon(null);
								else if((current.getX()==prev.getX()+170)&&(rightbottom.getIcon()==yellow))
									rightbottom.setIcon(null);
								else if((current.getX()==prev.getX()+170)&&(righttop.getIcon()==yellow))
									righttop.setIcon(null);
									counter++;
									((AbstractButton) currentEvent.getSource()).setIcon(redk);						
							}
					   // 	if(lefttop.getIcon()==yellow&&leftlefttop.getIcon()==null||righttop.getIcon()==yellow&&rightrighttop.getIcon()==null||leftbottom.getIcon()==yellow&&leftleftbottom.getIcon()==null||rightbottom.getIcon()==yellow&&rightrightbottom.getIcon()==null)
						//		counter--;
					    	
					    }
					    else if(prev.getIcon()==yellowk&&counter%2!=0)
					    {
					    	if((current.getX()==prev.getX()+85||current.getX()==prev.getX()-85)&&(current.getY()==prev.getY()+85||current.getY()==prev.getY()-85))
							{
									((AbstractButton) currentEvent.getSource()).setIcon(yellowk);
									
										((AbstractButton) prevEvent.getSource()).setIcon(null);
									counter++;
							}
					    	else if((current.getY()==prev.getY()-170)&&(lefttop.getIcon()==red||righttop.getIcon()==red))
							{
								
									((AbstractButton) prevEvent.getSource()).setIcon(null);
								if(current.getX()==prev.getX()-170&&(lefttop.getIcon()==red))
									lefttop.setIcon(null);
								else if((current.getX()==prev.getX()+170)&&(righttop.getIcon()==red))
									righttop.setIcon(null);
									counter++;
									((AbstractButton) currentEvent.getSource()).setIcon(yellowk);			
							}
					    	else if((current.getY()==prev.getY()+170)&&(leftbottom.getIcon()==red||rightbottom.getIcon()==red))
					    	{
					    		((AbstractButton) prevEvent.getSource()).setIcon(null);
								if(current.getX()==prev.getX()-170&&(leftbottom.getIcon()==red))
									leftbottom.setIcon(null);
								else if((current.getX()==prev.getX()+170)&&(rightbottom.getIcon()==red))
									rightbottom.setIcon(null);
									counter++;
									((AbstractButton) currentEvent.getSource()).setIcon(yellowk);	
					    	}
					  //  	if(lefttop.getIcon()==red&&leftlefttop.getIcon()==null||righttop.getIcon()==red&&rightrighttop.getIcon()==null||leftbottom.getIcon()==red&&leftleftbottom.getIcon()==null||rightbottom.getIcon()==red&&rightrightbottom.getIcon()==null)
						//		counter--;
					    }

					}
					prevEvent=currentEvent;
					if(current.getX()>=170)
					righttop=(JButton) contentPane.getComponentAt(current.getX()+125, current.getY()-40);
					else
						righttop=null;
					lefttop=(JButton) contentPane.getComponentAt(current.getX()-40, current.getY()-40);
					rightbottom=(JButton) contentPane.getComponentAt(current.getX()+125, current.getY()+125);
					leftbottom=(JButton) contentPane.getComponentAt(current.getX()-40, current.getY()+125);
				//	rightrighttop=(JButton) contentPane.getComponentAt(current.getX()+210, current.getY()-125);
				//	leftlefttop=(JButton) contentPane.getComponentAt(current.getX()-125, current.getY()-125);
				//	rightrightbottom=(JButton) contentPane.getComponentAt(current.getX()+210, current.getY()+210);
				//	leftleftbottom=(JButton) contentPane.getComponentAt(current.getX()-125, current.getY()+210);
				}
			
		}
		
	}
	
}
