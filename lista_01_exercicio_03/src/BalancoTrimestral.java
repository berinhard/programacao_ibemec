
/*
 * 1.Na empresa onde trabalhamos, há tabelas com o quanto
 *  foi gasto em cada mês. Para fechar o balanço do primeiro
 *  trimestre, precisamos somar o gasto total. Sabendo que, 
 *  em Janeiro foi gasto 15000 reais, em Fevereiro, 23000 reais 
 *  e em Março, 17000 reais, faça um programa que calcule e imprima 
 *  o gasto total no trimestre. Siga esses passos:
	a) Crie uma classe chamada BalancoTrimestral com um bloco main;
	b) Dentro do main (o miolo do programa), declare uma variável
	 	inteira chamada gastosJaneiro e inicialize-a com 15000;
	c) Crie também as variáveis gastosFevereiro e gastosMarco,
		inicializando-as com 23000 e 17000, respectivamente, utilize
		uma linha para cada declaração;
	d) Crie uma variável chamada gastosTrimestre e inicialize-a com a
		soma das outras 3 variáveis: 
		int gastosTrimestre = gastosJaneiro+gastosFevereiro+gastosMarco
	e) Imprima a variável gastosTrimestre.
*/
public class BalancoTrimestral {

	public static void main(String[] args) {
		
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println("Gastos do trimestre: " + gastosTrimestre);

	}

}
