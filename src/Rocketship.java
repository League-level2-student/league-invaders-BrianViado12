import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject{
	
	public Rocketship(int x, int y, int width, int height, int speed, boolean isActive) {
		super(x, y, width, height, speed, isActive);
		
		// TODO Auto-generated constructor stub
	}
	public void right() {
		
		if(x<=440) {
			x += speed;
		}
	}
	public void left() {
		
		if(x>=10) {
			x-=speed;
		} 
	}
	public void up() {
		
		if(y>=10) {
			y-=speed;
		}
	}
	public void down() {
		
		if(y<=690) {
			y+=speed;
		}
	}
	void draw(Graphics g) {
		 g.setColor(Color.BLUE);
	        g.fillRect(x, y, width, height);
	       
	}

}
