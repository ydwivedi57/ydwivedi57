import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;
public class snake extends Frame implements KeyListener,Runnable
{int c=200;int i=200,speed=10,level,size=20,mov=0,y,x;
Button up,down,left,right;
Graphics g;
Label l;
TextArea ta;
Random r=new Random();
public void check()
	{Graphics g=getGraphics();
	for(int h=0;h<30;h++)
		{
		if(x==(i+h) && y==(c+h))
			{
			size+=10;
			 x=r.nextInt(700);
			 y=r.nextInt(700);
			 if(x<150 && y<150)
			{x=r.nextInt(700);
			 y=r.nextInt(700);}
			 level+=1;
			 l.setText("Level="+level);
			speed-=1;
			repaint();
			repaint();
			}
		}
	}
public snake()
{	up=new Button("UP");
	down=new Button("DOWN");
	left=new Button("LEFT");
	right=new Button("RIGHT");
	x=500;
	y=500;
	l=new Label();
	ta=new TextArea();
	ta.setBounds(20,40,50,50); 
	l.setBounds(20,240,90,40);
	up.setBounds(20,80,80,40);
	down.setBounds(20,120,80,40);
	left.setBounds(20,160,80,40);
	right.setBounds(20,200,80,40);
	ta.addKeyListener(this);
	add(up);
	add(ta);
	add(l);
	add(down);
	add(left);
	add(right);
	setLayout(null);
	setSize(1920,1080);
	setVisible(true);
	}
public void run()
	{try
	{
	while(true)
	{	repaint();
		repaint();
		repaint();
		if(speed>0)
		{Thread.sleep(speed);}
		else
		{repaint();repaint();
		Thread.sleep(1);}
		}
	}
	catch(Exception e)
	{System.out.println(e);}
	}
public void paint(Graphics g)
	{
	g.fillRect(x,y,20,20);
	if(mov==1)
	{
	c--;
	up.setBackground(Color.red);
	down.setBackground(Color.white);
	right.setBackground(Color.white);
	left.setBackground(Color.white);
	g.fillRect(i,c,size,20);
	check();
	if(c>1000 && i>1000)
		{System.exit(0);}
	
	}
	else if(mov==2)
	{c++;
		down.setBackground(Color.red);
		right.setBackground(Color.white);
		left.setBackground(Color.white);
		up.setBackground(Color.white);
		g.fillRect(i,c,size,20);
		check();		
		if(c>1000 && i>1000)
		{System.exit(0);}
	}
	
	else if(mov==3)
	{i++;
		left.setBackground(Color.red);
		up.setBackground(Color.white);
		down.setBackground(Color.white);
		right.setBackground(Color.white);
		g.fillRect(i,c,size,20);
		check();
		if(c>1000 && i>1000)
		{System.exit(0);}
	}
	
	else if(mov==4)
	{	i--;
		right.setBackground(Color.red);
		up.setBackground(Color.white);
		left.setBackground(Color.white);
		down.setBackground(Color.white);
		g.fillRect(i,c,size,20);
		check();
		if(c>1000 && i>1000)
		{System.exit(0);}
	}
	
}
	public void keyTyped(KeyEvent e)
	{
		char ch = e.getKeyChar();
	if(ch== 'w')
		{
		mov=1;
		up.setBackground(Color.red);
		repaint();
		}
	if(ch== 's')
		{mov=2;
		repaint();
		}
	if(ch== 'd')
		{mov=3;
		repaint();
		}
	if(ch=='a')
		{mov=4;
		repaint();
		}
	}
	  
    public void keyPressed(KeyEvent e) {
		
		  }
      
    public void keyReleased(KeyEvent e) {  
       
    }  
public static void main(String a[])
{ 
	snake s=new snake();
	Thread t=new Thread(s);
	t.start();
}
}
	
	