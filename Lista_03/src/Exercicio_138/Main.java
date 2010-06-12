package Exercicio_138;

import javax.swing.*;
import java.awt.*;

public class Main {

	public static void main(String[] args) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		new MainFrame13_8(screenSize).show();
	}

}

class MainFrame13_8 extends JFrame{
	MainFrame13_8(Dimension screenSize){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int w = screenSize.width / 2;
		int h = screenSize.height / 2;
		setTitle("Exercicio 13.8");
		int x = w - w/2;
		int y = h - h/2;
		setSize(w, h);
		setLocation(x, y);
		getContentPane().add(new MainPanel());
	}
}

class MainPanel extends JPanel{
	MainPanel(){
		setBackground(Color.YELLOW);
		JLabel label = new JLabel("Go, blue!");
		label.setFont(new Font(null, Font.BOLD, 40));
		label.setForeground(Color.BLUE);
		add(label);
	}
}