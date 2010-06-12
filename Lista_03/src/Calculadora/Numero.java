package Calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Numero implements ActionListener{
	
	int valor;
	Calculadora calc;
	
	Numero(int valor, Calculadora calc){
		this.valor = valor;
		this.calc = calc;
	}
	
	public void actionPerformed(ActionEvent e){
		if (this.calc.concatenaNumero()){
			int numNoVisor = this.calc.getNumeroNoVisor();
			numNoVisor = numNoVisor * 10 + this.valor;
			this.calc.setNumeroNoVisor(numNoVisor);
		} else {
			this.calc.setNumeroNoVisor(this.valor);
		}
	}
	
	
}
