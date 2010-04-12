/*
 * 1.Escreva uma classe chamada Aluno que contenha os atributos privados
 * denominados nome, matricula, nota1, nota2, nota3, peso1, peso2 e peso3.
 * Além disso,
	a. Crie um construtor-padrão para a classe.
	b. Crie um construtor que inicialize todos os membros de
			dados com os valores recebidos como argumento.
	c. Crie os métodos de acesso (getters e setters) para
			todos os atributos. Os métodos setters devem validar
			os dados de entrada conforme as regras definidas abaixo:
		§ o nome deve conter pelo menos dois caracteres e não deve possuir números;
		§ a matrícula de ser constituída de 9 dígitos apenas;
	d. Escreva um método público para calcular a média ponderada das três notas;
	e. Sabendo que os quatro primeiros dígitos da matrícula representam
			o ano de ingresso do aluno na instituição de ensino, escreva
			um método que, a partir da matrícula, retorne o ano de ingresso.
	f. Implemente um programa-exemplo para testar sua classe que utilize
			todos os atributos e métodos criados.*/

public class Aluno {

	private String nome;
	private int matricula;
	private double nota1;
	private double nota2;
	private double nota3;
	private int peso1;
	private int peso2;
	private int peso3;
	
	private final String NOME_INVALIDO = "";
	private final int MATRICULA_INVALIDA = -1;

	public Aluno(String nome, int matricula, double nota1, double nota2, double nota3,
				 int peso1, int peso2, int peso3) {
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setNota1(nota1);
		this.setNota2(nota2);
		this.setNota3(nota3);
		this.setPeso1(peso1);
		this.setPeso2(peso2);
		this.setPeso3(peso3);
	}

	public Aluno(){
	}
	
	public double calculaMediaPonderada(){
		double mediaPonderada = 0;
		mediaPonderada = this.nota1 * this.peso1 + this.nota2 * this.peso2 + this.nota3 * this.peso3;
		mediaPonderada = mediaPonderada / (this.peso1 + this.peso2 + this.peso3);
		return mediaPonderada;
	}
	
	public int anoDeMatricula(){
		int anoDeMatricula = 0;
		String anoString = "";
		anoString = Integer.toString(this.matricula);
		anoString = anoString.substring(0, 4);
		anoDeMatricula = Integer.parseInt(anoString);
		return anoDeMatricula;
	}
	
	public void imprimeAluno(){
		System.out.println("Nome: " + this.getNome());
		System.out.println("Matricula: " + this.getMatricula());
		System.out.println("Nota 1: " + this.getNota1() + " - Peso 1: " + this.getPeso1());
		System.out.println("Nota 2: " + this.getNota2() + " - Peso 2: " + this.getPeso2());
		System.out.println("Nota 3: " + this.getNota3() + " - Peso 3: " + this.getPeso3());
		System.out.println("================================================");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		int tamanhoNome = nome.length();
		if (tamanhoNome >= 2){
			char[] nomeEmChar = nome.toCharArray();
			boolean nomeSemNumero = true;
			for (int i = 0; i < nomeEmChar.length; i++){
				if (Character.isDigit(nomeEmChar[i])){
					nomeSemNumero = false;
					break;
				}
			}
			if (!nomeSemNumero){
				System.out.println("Nome " + nome + " inválido: Não pode ter dígitos!");
				nome = NOME_INVALIDO;
			}
		} else {
			System.out.println("Nome " + nome + " inválido: Precisa ter mais de dois caracteres!");
			nome = NOME_INVALIDO;
		}
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		String mat = Integer.toString(matricula);
		if (mat.length() != 9){
			System.out.println("Matrícula " + matricula + " inválida: Precisa ter 9 dígitos!");
			matricula = MATRICULA_INVALIDA;
		}
		this.matricula = matricula;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public int getPeso1() {
		return peso1;
	}

	public void setPeso1(int peso1) {
		this.peso1 = peso1;
	}

	public int getPeso2() {
		return peso2;
	}

	public void setPeso2(int peso2) {
		this.peso2 = peso2;
	}

	public int getPeso3() {
		return peso3;
	}

	public void setPeso3(int peso3) {
		this.peso3 = peso3;
	}
	
	
	
}
