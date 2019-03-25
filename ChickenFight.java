import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.sound.sampled.*;
import java.applet.Applet;


public class ChickenFight extends JFrame implements KeyListener{

	public Drawing draw;

	public ChickenFight(){
		this.draw = new Drawing();
	}
	
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_UP){
			draw.moveUp();
			System.out.print("Upward");
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			draw.moveDown();
			System.out.print("Crouches");
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT){
			draw.moveLeft();
			System.out.print("Backing");
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			draw.moveRight();
			System.out.print("Forwarding");
		}

		if(e.getKeyCode() == KeyEvent.VK_W){
			draw.moveUp1();
			System.out.print("Upward");
		}
		else if(e.getKeyCode() == KeyEvent.VK_S){
			draw.moveDown1();
			System.out.print("Crouches");
		}
		else if(e.getKeyCode() == KeyEvent.VK_A){
			draw.moveLeft1();
			System.out.print("Backing");
		}
		else if(e.getKeyCode() == KeyEvent.VK_D){
			draw.moveRight1();
			System.out.print("Forwarding");
		}
	}
	
	public void keyReleased(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_DOWN){
			draw.moveLeft1();
			System.out.print("Crouches");
		}
	}
		public void keyTyped(KeyEvent e){
	}

	public static void  main (String args[]){
		ChickenFight myFrame = new ChickenFight();
		myFrame.setSize(1366,720);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.add(myFrame.draw);
		myFrame.addKeyListener(myFrame);
		System.out.println("Playing...");
	}
}
