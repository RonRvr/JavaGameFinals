import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Color;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.applet.Applet;
import javax.sound.sampled.*;

public class Drawing extends JComponent{
	
	public int x = 150;
	public int y = 420;

	public int x1 = 950;
	public int y1 = 420;
	
	public int state = 0;
	public int state1 = 0;

	public BufferedImage player;
	public URL resource = getClass().getResource("run0.png");
	public BufferedImage player1;
	public URL resource1 = getClass().getResource("RunLeft0.png");

	public BufferedImage attack;
	public URL crch = getClass().getResource("Attack0.png");
	public BufferedImage attack1;
	public URL crch1 = getClass().getResource("Attack0.png");
	
	public BufferedImage bground;
	public URL bg = getClass().getResource("bground.png");
	public BufferedImage bground1;
	public URL bg1 = getClass().getResource("bground.png");

	public BufferedImage imageL;
	public URL lefty = getClass().getResource("RunLeft0.png");
	public BufferedImage imageL1;
	public URL lefty1 = getClass().getResource("RunLeft0.png");

	public Drawing(){
		try{
			player = ImageIO.read(resource);
			player1 = ImageIO.read(resource1);
			bground = ImageIO.read(bg);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

    /*Chicken 1*/
	public void ChickenRight(){
		if(state == 0){
			resource = getClass().getResource("run0.png");
		}
		else if(state == 1){
			resource = getClass().getResource("run1.png");
		}
		else if(state == 2){
			resource = getClass().getResource("run2.png");
		}
		else if(state == 3){
			resource = getClass().getResource("run3.png");
		}
		else if(state == 4){
			resource = getClass().getResource("run4.png");
		}
		else if(state == 5){
			resource = getClass().getResource("run5.png");
			state = 0;
		}
		state++;
		try{
			player = ImageIO.read(resource);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

	public void ChickenLeft(){
		if(state == 0){
			resource = getClass().getResource("RunLeft0.png");
		}
		else if(state == 1){
			resource = getClass().getResource("RunLeft1.png");
		}
		else if(state == 2){
			resource = getClass().getResource("RunLeft2.png");
		}
		else if(state == 3){
			resource = getClass().getResource("RunLeft3.png");
		}
		else if(state == 4){
			resource = getClass().getResource("RunLeft4.png");
		}
		else if(state == 5){
			resource = getClass().getResource("RunLeft5.png");
			state = 0;
		}
		state++;
		try{
			player = ImageIO.read(resource);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

	public void attackAnimation(){
        Thread thread = new Thread(new Runnable(){
            public void run(){  
                for(int astate = 0;astate<7;astate++){
                   
                    if(astate==8){
                        resource = getClass().getResource("Attack6.png");
                    }
                    else{
                        resource = getClass().getResource("Attack"+astate+".png");
                    }
                    try{
                        player = ImageIO.read(resource);
                    }
                    catch(IOException e){
                        e.printStackTrace();
                    }
                    repaint();    
                    try{
                        Thread.sleep(30);
                    }
                    catch(InterruptedException e){

                    }
                }
                 for(int astate = 0;astate<7;astate++){
                   
                    if(astate==8){
                        resource = getClass().getResource("AttackRight6.png");
                    }
                    else{
                        resource = getClass().getResource("AttackRight"+astate+".png");
                    }
                    try{
                        player = ImageIO.read(resource);
                    }
                    catch(IOException e){
                        e.printStackTrace();
                    }
                    repaint();    
                    try{
                        Thread.sleep(30);
                    }
                    catch(InterruptedException e){
                    }
                }
            }
        });
        thread.start();
    }

	public void moveUp(){
		ChickenRight();
		repaint();
	}
	public void moveAttack(){
		attackAnimation();
		repaint();
	}
	public void moveLeft(){
		if(x<=5){
			x=x;
		}
		else{
			x=x -15;
			ChickenLeft();
			repaint();
		}
	}
	public void moveRight(){
		if(x>=1090){
			x=x;
		}
		else{
			x=x +15;
			ChickenRight();
			repaint();
		}
	}

	/*Chicken 2*/
    public void ChickenRight1(){
		if(state1 == 0){
			resource1 = getClass().getResource("run0.png");
		}
		else if(state1 == 1){
			resource1 = getClass().getResource("run1.png");
		}
		else if(state1 == 2){
			resource1 = getClass().getResource("run2.png");
		}
		else if(state1 == 3){
			resource1 = getClass().getResource("run3.png");
		}
		else if(state1 == 4){
			resource1 = getClass().getResource("run4.png");
		}
		else if(state1 == 5){
			resource1 = getClass().getResource("run5.png");
			state1 = 0;
		}
		state1++;
		try{
			player1 = ImageIO.read(resource1);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

	public void ChickenLeft1(){
		if(state1 == 0){
			resource1 = getClass().getResource("RunLeft0.png");
		}
		else if(state1 == 1){
			resource1 = getClass().getResource("RunLeft1.png");
		}
		else if(state1 == 2){
			resource1 = getClass().getResource("RunLeft2.png");
		}
		else if(state1 == 3){
			resource1 = getClass().getResource("RunLeft3.png");
		}
		else if(state1 == 4){
			resource1 = getClass().getResource("RunLeft4.png");
		}
		else if(state1 == 5){
			resource1 = getClass().getResource("RunLeft5.png");
			state1 = 0;
		}
		state1++;
		try{
			player1 = ImageIO.read(resource1);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

	public void attackAnimation1(){
        Thread thread1 = new Thread(new Runnable(){
            public void run(){  
                for(int astate1 = 0;astate1<7;astate1++){
                    if(astate1==8){
                        resource1 = getClass().getResource("Attack6.png");
                    }
                    else{
                        resource1 = getClass().getResource("Attack"+astate1+".png");
                    }
                    try{
                        player1 = ImageIO.read(resource1);
                    }
                    catch(IOException e){
                        e.printStackTrace();
                    }
                    repaint();    
                    try{
                        Thread.sleep(30);
                    }
                    catch(InterruptedException e){
                    }
                }
                 for(int astate1 = 0;astate1<7;astate1++){
                   
                    if(astate1==8){
                        resource1 = getClass().getResource("AttackRight6.png");
                    }
                    else{
                        resource1 = getClass().getResource("AttackRight"+astate1+".png");
                    }
                    try{
                     	player1 = ImageIO.read(resource1);
                    }
                    catch(IOException e){
                        e.printStackTrace();
                    }
                    repaint();    
                    try{
                        Thread.sleep(30);
                    }
                    catch(InterruptedException e){
                    }
                }
            }
        });
        thread1.start();
    }

	public void moveUp1(){
		ChickenRight1();
		repaint();
	}
	public void moveAttack1(){
		attackAnimation1();
		repaint();
	}
	public void moveLeft1(){
		if(x1<=5){
			x1=x1;
		}
		else{
			x1=x1 -15;
			ChickenLeft1();
			repaint();
		}
	}
	public void moveRight1(){
		if(x1>=1090){
			x1=x1;
		}
		else{
			x1=x1 +15;
			ChickenRight1();
			repaint();
		}
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(bground,0,0,1366,720,this);
		g.drawImage(player,x,y,250,220,this);
		g.drawImage(player1,x1,y1,250,220,this);
		g.drawImage(imageL,x,y,this);
		g.drawImage(attack,x,y,this);
		g.drawImage(attack1,x,y,this);
	}
}