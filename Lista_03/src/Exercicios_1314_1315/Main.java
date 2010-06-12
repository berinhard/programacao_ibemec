package Exercicios_1314_1315;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new MainFrame(300, 150, 400, 0);
		frame.show();
	}

}

class MainFrame extends JFrame{
	MainFrame(int width, int height, int x, int y){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Exercicio 13.13");
		setSize(width, height);
		setLocation(x, y);
		getContentPane().add(new TemperaturePanel());
	}
}

class TemperaturePanel extends JPanel implements ActionListener{
	
	JLabel directions, directions_2;
	JTextField fahrenheit_field;
	JTextField celsius_field;
	JLabel celsius;	
	
	TemperaturePanel(){
		directions = new JLabel("Enter Fahrenheit temperature:");
		directions_2 = new JLabel("Enter Celsius temperature:");
		fahrenheit_field = new JTextField(3);
		fahrenheit_field.addActionListener(this);
		celsius_field = new JTextField(3);
		celsius_field.addActionListener(this);
		celsius = new JLabel();
		celsius.setFont(new Font(null, 0, 28));
		add(directions);
		add(fahrenheit_field);
		add(directions_2);
		add(celsius_field);
		add(celsius);
	}

	public void actionPerformed(ActionEvent event){
		double f = 0;
		int c = 0;
		String fText = fahrenheit_field.getText();
		String cText = celsius_field.getText();
		fahrenheit_field.setText("");
		celsius_field.setText("");
		celsius.setText("");
		if (fText.equals("") && cText.equals("")){
			return;
		}
		if (!fText.equals("")){
			f = Double.parseDouble(fText);
			c = (int)Math.round(5 * (f - 32) / 9);
		} else {
			c = Integer.parseInt(cText);
			f = (9.0/5) * c + 32;
		}
		DecimalFormat df = new DecimalFormat("000.0");
		celsius.setText(df.format(f) + "\u00B0F = " + c + "\u00B0C");
	}
	
}