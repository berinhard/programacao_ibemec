package Exercicio_1313;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

	public static void main(String[] args) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int w = screenSize.width;
		int h = screenSize.height;
		JFrame frame = new MainFrame(w, h, 0, 0);
		frame.show();
	}

}

class MainFrame extends JFrame{
	MainFrame(int width, int height, int x, int y){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Exercicio 13.13");
		setSize(width, height);
		setLocation(x, y);
		getContentPane().add(new ButtonPanel());
	}
}

class ButtonPanel extends JPanel{
	
	ButtonPanel(){
		JButton redButton = new JButton("Red");
		JButton blueButton = new JButton("Blue");
		JButton greenButton = new JButton("Green");
		JButton yellowButton = new JButton("Yellow");
		JButton whiteButton = new JButton("White");
		JButton pinkButton = new JButton("Pink");
		JButton orangeButton = new JButton("Orange");
		JButton magentaButton = new JButton("magenta");
		JButton lightGrayButton = new JButton("Light Gray");
		JButton grayButton = new JButton("Gray");
		JButton darkGrayButton = new JButton("Dark Gray");
		JButton cyanButton = new JButton("Cyan");
		JButton blackButton = new JButton("Black");
		add(redButton);
		add(greenButton);
		add(blueButton);
		add(blackButton);
		add(cyanButton);
		add(darkGrayButton);
		add(grayButton);
		add(lightGrayButton);
		add(magentaButton);
		add(orangeButton);
		add(pinkButton);
		add(whiteButton);
		add(yellowButton);
		redButton.addActionListener(new ColorAction(Color.red));
		greenButton.addActionListener(new ColorAction(Color.green));
		blueButton.addActionListener(new ColorAction(Color.blue));
		blackButton.addActionListener(new ColorAction(Color.black));
		cyanButton.addActionListener(new ColorAction(Color.cyan));
		darkGrayButton.addActionListener(new ColorAction(Color.darkGray));
		lightGrayButton.addActionListener(new ColorAction(Color.lightGray));
		magentaButton.addActionListener(new ColorAction(Color.magenta));
		orangeButton.addActionListener(new ColorAction(Color.orange));
		pinkButton.addActionListener(new ColorAction(Color.pink));
		whiteButton.addActionListener(new ColorAction(Color.white));
		yellowButton.addActionListener(new ColorAction(Color.yellow));
		grayButton.addActionListener(new ColorAction(Color.gray));
	}

	class ColorAction implements ActionListener{
		
		private Color color;
		
		ColorAction(Color color){
			this.color = color;
		}
		
		public void actionPerformed(ActionEvent event){
			setBackground(color);
		}
	}
	
}

