import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	GamePanel panel;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;
	public static void main(String[] args) {
		LeagueInvaders league = new LeagueInvaders();
		league.setup();
	}
	public LeagueInvaders() {
		panel = new GamePanel();
		frame = new JFrame();
		frame.add(panel);
		frame.setSize(WIDTH, HEIGHT);
		frame.addKeyListener(panel);
	}
	void setup() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

