import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioInputStream;
import java.applet.Applet;


public class ChickenFight extends JFrame implements KeyListener{

	boolean playing = true;

	public ChickenFight(){
		this.draw = new Drawing();
	}
	public Drawing draw;
		public void keyPressed(KeyEvent e){
			
			String filepath = "Rooster.wav";
			AttackSound pow = new AttackSound();

			if(e.getKeyCode() == KeyEvent.VK_UP){
				draw.moveUp();
				System.out.print("Dodging");
			}
			else if(e.getKeyCode() == KeyEvent.VK_DOWN){
				draw.moveAttack();
				pow.attackSound(filepath);
				System.out.print("Attacks");
			}
			else if(e.getKeyCode() == KeyEvent.VK_LEFT){
				draw.moveLeft();
				System.out.print("Backing");
			}
			else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
				draw.moveRight();
				System.out.print("Forwarding");
			}
			else if(e.getKeyCode() == KeyEvent.VK_W){
				draw.moveUp1();
				System.out.print("Dodging");
			}
			else if(e.getKeyCode() == KeyEvent.VK_S){
				draw.moveAttack1();
				pow.attackSound(filepath);
				System.out.print("Attacks");
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
	}

	public void keyTyped(KeyEvent e){
	}

	public static void  main (String args[]){
		ChickenFight myFrame = new ChickenFight();
		String filepath = "bgMusic.wav";
		Sound musicObject = new Sound();
		musicObject.playMusic(filepath);
		myFrame.setSize(1366,720);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.add(myFrame.draw);
		myFrame.addKeyListener(myFrame);
		System.out.println("Playing...");
	}
}

