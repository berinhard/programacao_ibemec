package Exercicios_131_132;

import javax.swing.JFrame;

public class Main extends JFrame{

	public static void main(String[] args) {
		new MyFrame();
	}

}

class MyFrame extends JFrame{
	MyFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 500);
		this.show();
	}
}
