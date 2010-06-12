package Exercicios_139_1310_1311;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

	public static void main(String[] args) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int w = screenSize.width;
		JFrame frame = new MainFrame(w/5, 200, 2*w/5, 0);
		frame.show();
	}

}

class MainFrame extends JFrame{
	MainFrame(int width, int height, int x, int y){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Exercicio 13.9 - 13.10 - 13.11");
		setSize(width, height);
		setLocation(x, y);
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.white);
		mainPanel.add(new ColoredPanel(Color.cyan, "Cyan"));
		mainPanel.add(new ColoredPanel(Color.magenta, "Magenta"));
		mainPanel.add(new ColoredPanel(Color.green, "Green"));
		mainPanel.add(new ColoredPanel(Color.orange, "Orange"));
		mainPanel.add(new ColoredPanel(255, 255, 255));
		mainPanel.add(new ColoredPanel(255, 205, 255));
		mainPanel.add(new ColoredPanel(255, 255, 205));
		mainPanel.add(new ColoredPanel(255, 205, 205));
		mainPanel.add(new ColoredPanel(13054));
		mainPanel.add(new ColoredPanel(18573));
		getContentPane().add(mainPanel);
	}
}

class ColoredPanel extends JPanel{
	Border blackLine = BorderFactory.createLineBorder(Color.black);
	
	ColoredPanel(Color color, String label){
		setBackground(color);
		setBorder(blackLine);
		add(new Label(label));
	}
	
	ColoredPanel(int r, int g, int b){
		this(new Color(r, g, b), "(" + r + " " + g + " " + b + ")");
	}
	
	ColoredPanel(int rgbHex){
		this(new Color(rgbHex).getRed(), new Color(rgbHex).getGreen(), new Color(rgbHex).getBlue());
	}
}
