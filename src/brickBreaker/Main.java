package brickBreaker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// create a screen view
		JFrame obj = new JFrame();
		GameContent game = new GameContent();
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Brick Breaker");
		obj.setResizable(false);
		
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(game);
		obj.setVisible(true);
	}

}
