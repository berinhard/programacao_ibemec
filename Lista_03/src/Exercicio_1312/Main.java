package Exercicio_1312;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

	public static void main(String[] args) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int w = screenSize.width;
		JFrame frame = new MainFrame(900, 300, 140, 0);
		frame.show();
	}

}

class MainFrame extends JFrame{
	MainFrame(int width, int height, int x, int y){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Exercicio 13.12");
		setSize(width, height);
		setLocation(x, y);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(6, 16));
		for (int i = -32; i < 62; i++){
			mainPanel.add(new LabeledPanel("" + (char)('A' + i)));
		}
		getContentPane().add(mainPanel);
	}
}

class LabeledPanel extends JPanel{
	Border blackLine = BorderFactory.createLineBorder(Color.black);
	
	LabeledPanel(String label){
		setBackground(Color.white);
		setBorder(blackLine);
		add(new JLabel(label));
	}
}
