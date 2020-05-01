package tap.src.main;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JFrame;

public class waterGame extends Canvas implements Runnable {

	public static int WIDTH =320;
	public static final int HEIGHT = WIDTH /12*9;
	public static final int SCALE =2;                 //Variables to help display ratio
	public final String TITLE="Hydration Simulator";
	
	private boolean isrunning=false;
	private Thread thread;
	
	private BufferedImage image = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
	private BufferedImage spriteSheet=null;
	
	private MainCharacter mc;

	
	private synchronized void start() //Starts thread
	{
		if(isrunning)
			return;
		isrunning=true;
		thread=new Thread(this);
		thread.start();
		
	}
	
	private synchronized void stop()//stops game loop
	{
		if(!isrunning)
			return;
		isrunning=false;
		try
		{
			thread.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
			
		}
		System.exit(1);
	}
	
	public void initialize()//initialize images
	{
		requestFocus();//brings focus to window without clicking on it
		BuffImageLoader loader = new BuffImageLoader();
		try
		{
			spriteSheet=loader.loadImage("/SpriteSheet.png");
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		addKeyListener(new KbInput(this));
		
		mc=new MainCharacter(200,200,this);
		
	}
	
	public void run()//game loop
	{
		initialize();
		long lTime=System.nanoTime();
		final double numTicks=60.0;
		double ns = 1000000000/numTicks;
		double delta=0;
		int update=0;
		int fps=0;
		long timer=System.currentTimeMillis();
		
		while(isrunning)
		{
			long now= System.nanoTime();
			delta+=(now-lTime)/ns;
			lTime=now;
			if(delta >=1)
			{
				tick();
				update++;
				delta--;
			}
			render();
			fps++;
			
			if(System.currentTimeMillis()-timer>1000)
			{
				timer+=1000;
				System.out.println(update + "Ticks, Fps " +fps);
				update=0;
				fps=0;
			}
			
		}
		stop();
		
		
	}
	
	private void tick()//updates
	{
		mc.tick();
	}
	
	private void render()//renders
	{
		BufferStrategy bs =this.getBufferStrategy();
		if(bs==null)
		{
			createBufferStrategy(3);
			return;
		}
		
		Graphics graphic =bs.getDrawGraphics();
		graphic.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		mc.render(graphic);
		graphic.dispose();
		bs.show();
		
		
	}
	
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		if(key==KeyEvent.VK_RIGHT) 
		{
			mc.setVelocityX(5);
		}
		else if(key==KeyEvent.VK_LEFT)
		{
			mc.setVelocityX(-5);
		}
		else if(key==KeyEvent.VK_DOWN)
		{
			mc.setVelocityY(5);
		}
		else if(key==KeyEvent.VK_UP) 
		{
			mc.setVelocityY(-5);
		}
	}
	
	public void keyReleased(KeyEvent e)
	{
		int key = e.getKeyCode();
		if(key==KeyEvent.VK_RIGHT) 
		{
			mc.setVelocityX(0);
		}
		else if(key==KeyEvent.VK_LEFT)
		{
			mc.setVelocityX(0);
		}
		else if(key==KeyEvent.VK_DOWN)
		{
			mc.setVelocityY(0);
		}
		else if(key==KeyEvent.VK_UP) 
		{
			mc.setVelocityY(0);
		}
	}
	
	public static void main(String args[])
	{
		waterGame game = new waterGame();
		game.setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE)); //construct dimension to specified width x height times scale 
		game.setMaximumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		game.setMinimumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		
		JFrame frame = new JFrame(game.TITLE);
		frame.add(game); //place dimensions into frame and preferred settings
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		game.start();
	}
	
	public BufferedImage getSpriteSheet()
	{
		return spriteSheet;
	}
	
}
