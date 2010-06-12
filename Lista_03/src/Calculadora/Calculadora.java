package Calculadora;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout;

public class Calculadora extends JFrame {

	public static final int ZERO = 0;
	public static final char OPERADOR_INVALIDO = ' ';

	private JTextField visor;
	private int valor1;
	private char operador;
	private int primeiroNumero;

	public static void main(String[] args) {
		new Calculadora();
	}

	public Calculadora() {
		visor = new JTextField("0");
		visor.setHorizontalAlignment(JTextField.RIGHT);
		visor.setFont(new Font("Dialog", Font.PLAIN, 20));
		visor.setEditable(false);

		Container cp = getContentPane();
		cp.add(visor, BorderLayout.NORTH);
		cp.add(panelDeNumeros(), BorderLayout.CENTER);
		cp.add(panelDeOperacoes(), BorderLayout.EAST);

		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculadora");
		setSize(300, 300);
		setLocation(0, 0);
		setVisible(true);
	}

	private JPanel panelDeNumeros() {
		JPanel panel = new JPanel(new GridLayout(4, 3));
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new Numero(7, this));
		panel.add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new Numero(8, this));
		panel.add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new Numero(9, this));
		panel.add(b9);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new Numero(4, this));
		panel.add(b4);setSize(50000, 0);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new Numero(5, this));
		panel.add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new Numero(6, this));
		panel.add(b6);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new Numero(1, this));
		panel.add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new Numero(2, this));
		panel.add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new Numero(3, this));
		panel.add(b3);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new Numero(0, this));
		panel.add(b0);
		
		return panel;
	}

	private JPanel panelDeOperacoes() {
		JPanel panel = new JPanel(new GridLayout(6, 1));
		
		JButton bLimpar = new JButton("Limpar");
		bLimpar.addActionListener(new OperacaoCalculadora('C', this));
		panel.add(bLimpar);
		
		JButton bMais = new JButton("+");
		bMais.addActionListener(new OperacaoCalculadora('+', this));
		panel.add(bMais);
		
		JButton bMenos = new JButton("-");
		bMenos.addActionListener(new OperacaoCalculadora('-', this));
		panel.add(bMenos);
		
		JButton bMultiplica = new JButton("*");
		bMultiplica.addActionListener(new OperacaoCalculadora('*', this));
		panel.add(bMultiplica);
		
		JButton bDivide = new JButton("/");
		bDivide.addActionListener(new OperacaoCalculadora('/', this));
		panel.add(bDivide);
		
		JButton bCalcula = new JButton("=");
		bCalcula.addActionListener(new OperacaoCalculadora('=', this));
		panel.add(bCalcula);
		
		return panel;
	}
	
	protected boolean concatenaNumero(){
		if (getNumeroNoVisor() == ZERO) {
			return true;
		}
		if (!(operador == OPERADOR_INVALIDO && primeiroNumero == ZERO)) {
			return true;
		}
		return false;
	}

	protected boolean temOperacaoDefinida() {
		if (operador == OPERADOR_INVALIDO && primeiroNumero == ZERO) {
			return false;
		}
		return true;
	}

	protected void zeraCalculadora() {
		this.operador = OPERADOR_INVALIDO;
		this.primeiroNumero = ZERO;
	}

	protected int getNumeroNoVisor() {
		return Integer.parseInt(visor.getText());
	}

	protected void setNumeroNoVisor(String numero) {
		visor.setText(numero);
	}

	protected void setNumeroNoVisor(int numero) {
		visor.setText(Integer.toString(numero));
	}

	protected void setPrimeiroNumero(int num) {
		this.primeiroNumero = num;
	}

	protected int getPrimeiroNumero() {
		return this.primeiroNumero;
	}

	protected void setOperador(char op) {
		this.operador = op;
	}

	protected char getOperador() {
		return this.operador;
	}

}
