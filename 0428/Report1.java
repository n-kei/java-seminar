/**
 * <p>タイトル: Report1.java</p>
 * <p>説明: Mouseイベントで座標を表示する</p>
 * <p>著作権: Copyright (c) 2002 Naoya Ando</p>
 * <p>日付: 2002/9/8</p>
 * @author Naoya Ando
 * @version 1.0
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Report1 extends JFrame
    implements ActionListener, MouseListener, KeyListener, WindowListener
{

    //タイトルバー
    String strCaption = null;

    Graphics G;

    Report1(String title)
    {
        super(title);
        strCaption = title;


        //Mouseイベントで座標を表示する
        Container cp = getContentPane();
        cp.setBackground(getBackground());
        addMouseListener(this);
        addKeyListener(this);
        addWindowListener(this);

        setVisible(true); //!!
        G = getGraphics();
    }

    //Mouseイベント
    public void mousePressed(MouseEvent evt)
    {
        int x = evt.getX();
        int y = evt.getY();
        G.drawRect(x, y, 10, 10);
    }

    public void mouseClicked(MouseEvent evt) {}
    public void mouseEntered(MouseEvent evt) {}
    public void mouseExited(MouseEvent evt) {}
    public void mouseReleased(MouseEvent evt) {
		int x = evt.getX();
		int y = evt.getY();
	
		G.drawOval(x, y, 10, 10);
	}

    //Keyイベント
    public void keyReleased(KeyEvent evt)
    {
        repaint();
    }

    public void keyPressed(KeyEvent evt) {}
    public void keyTyped(KeyEvent evt) {}

    //Windowイベント
    public void windowClosing(WindowEvent evt)
    {
        dispose();
    }

    public void windowClosed(WindowEvent evt)
    {
        menuFileExit();
    }

    public void windowOpened(WindowEvent evt) {}
    public void windowActivated(WindowEvent evt) {}
    public void windowDeactivated(WindowEvent evt) {}
    public void windowIconified(WindowEvent evt) {}
    public void windowDeiconified(WindowEvent evt) {}

    public void actionPerformed(ActionEvent evt)
    {
    }

    //タイトルバー
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
        Report1 frame = new Report1("座標の表示");
        frame.setLocation(100, 100);
        frame.setSize(320, 240);
        frame.setVisible(true);
    }
}
