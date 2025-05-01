import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener {
	static final int SCREEN_WIDTH=600;
	static final int SCREEN_HEIGHT=600;
	static final int UNIT_SIZE=25;
	static final int GAME_UNITS=SCREEN_HEIGHT*SCREEN_WIDTH/UNIT_SIZE;
	static final int DELAY=75;
	final int x[]=new int[GAME_UNITS];
	final int y[]=new int[GAME_UNITS];
	int bodyparts=6;
	int appleseaten;
	int appleX;
	int appleY;
	char direction='R';
	boolean running=false;
	Timer timer;
	Random random;
	public GamePanel() {
		// TODO Auto-generated constructor stub
	}
	public void startGame() {
		
	}
	public void paintComponent(Graphics g) {
		
	}
	public void draw(Graphics g) {
		
	}
	public void move() {
		
	}
	public void checkcollision() {
		
	}
	public void gameover(Graphics g) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public class MykeyAdaptor extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			
		}
		
	}

}
