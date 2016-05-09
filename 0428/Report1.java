import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;

public class Report1 extends JFrame
	implements ActionListener, MouseListener, KeyListener, WindowListener
{
	String strCaption = null;

	Graphics G;
	private int ovalX = 100;
	private int ovalY = 100;

	Report1(String title)
	{
		super(title);
		strCaption = title;

		Container cp = getContentPane();
		cp.setBackground(Color.white);
		addMouseListener(this);
		addKeyListener(this);
		addWindowListener(this);

		setVisible(true); 
		G = getGraphics();
	}

	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillOval(ovalX, ovalY, 10, 10);
	}

	public void mousePressed(MouseEvent evt)
	{
		int x = evt.getX();
		int y = evt.getY();
		G.setColor(Color.black);
		G.drawRect(x, y, 10, 10);
		G.setColor(Color.white);
	}

	public void mouseClicked(MouseEvent evt) {}
	public void mouseEntered(MouseEvent evt) {}
	public void mouseExited(MouseEvent evt) {}
	public void mouseReleased(MouseEvent evt) {
		int x = evt.getX();
		int y = evt.getY();

		G.setColor(Color.black);
		G.drawOval(x, y, 10, 10);
		G.setColor(Color.white);
	}

	public void keyReleased(KeyEvent evt)
	{
		repaint();
	}

	public void keyPressed(KeyEvent evt) {
		char key = evt.getKeyChar();	

		G.setColor(Color.white);
		G.fillOval(ovalX, ovalY, 10, 10);
		if(key == 'w') {
			ovalY--;
			if(ovalY < 0)
				ovalY = 0;
		} else if(key == 'a') {
			ovalX--;
			if(ovalX < 0)
				ovalX = 0;
		} else if(key == 's') {
			ovalY++;
			if(ovalY > 240)
				ovalY = 240;
		} else if(key == 'd') {
			ovalX++;
			if(ovalX > 320)
				ovalX = 320;
		}  

	}
	public void keyTyped(KeyEvent evt) {}

	public void windowClosing(WindowEvent evt)
	{
		dispose();
	}
	public void windowClosed(WindowEvent evt) {}
	public void windowOpened(WindowEvent evt) {}
	public void windowActivated(WindowEvent evt) {}
	public void windowDeactivated(WindowEvent evt) {}
	public void windowIconified(WindowEvent evt) {}
	public void windowDeiconified(WindowEvent evt) {}

	public void actionPerformed(ActionEvent evt)
	{
	}

	void updateCaption()
	{
		this.setTitle(strCaption);
	}

	void menuFileExit()
	{
		System.exit(0);
	}

	public static void main(String[] args)
	{
		Report1 frame = new Report1("レポート12");
		frame.setLocation(100, 100);
		frame.setSize(320, 240);
		frame.setVisible(true);
	}
}
