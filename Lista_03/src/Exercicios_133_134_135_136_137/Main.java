package Exercicios_133_134_135_136_137;

import javax.swing.*;
import java.awt.*;

public class Main {

	public static void main(String[] args) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		//Descomente as linhas para ter o efeito desejado pelo exercício
		//new MainFrame13_3(screenSize).show();
		//new MainFrame13_4(screenSize).show();
		//new MainFrame13_5(screenSize).show();
		//new MainFrame13_6(screenSize).show();
		new MainFrame13_7(screenSize).show();
	}

}

class MainFrame13_3 extends JFrame{
	MainFrame13_3(Dimension screenSize){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int w = screenSize.width / 2;
		int h = screenSize.height / 2;
		setTitle("Exercicio 13.3");
		setSize(w, h);
		setLocation(w, h);
	}
}

class MainFrame13_4 extends JFrame{
	MainFrame13_4(Dimension screenSize){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int w = screenSize.width;
		int h = screenSize.height;
		setTitle("Exercicio 13.4");
		setSize(w, h);
		setLocation(0, 0);
	}
}

class MainFrame13_5 extends JFrame{
	MainFrame13_5(Dimension screenSize){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int w = screenSize.width;
		int h = screenSize.height;
		setTitle("Exercicio 13.5");
		setSize(w/4, h/4);
		int x = w/2 - w/8;
		int y = h/2 - h/8;
		setLocation(x, y);
	}
}

class MainFrame13_6 extends JFrame{
	MainFrame13_6(Dimension screenSize){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int w = screenSize.width / 2;
		int h = screenSize.height / 2;
		setTitle("Exercicio 13.6");
		int x = w - w/2;
		int y = h - h/2;
		setSize(w, h);
		setLocation(x, y);
		String out = "Largura = " + w + " pixels e altura = " + h + " pixels.";
		JLabel label = new JLabel(out);
		getContentPane().add(label);
	}
}

class MainFrame13_7 extends JFrame{
	MainFrame13_7(Dimension screenSize){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int w = screenSize.width / 2;
		int h = screenSize.height / 2;
		setTitle("Exercicio 13.7");
		int x = w - w/2;
		int y = h - h/2;
		setSize(w, h);
		setLocation(x, y);
		String out = "Largura = " + w + " pixels e altura = " + h + " pixels.";
		JLabel label = new JLabel(out);
		Font font = new Font("Dialog", Font.BOLD, 40);
		label.setFont(font);
		getContentPane().add(label);
	}
}