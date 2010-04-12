
public class TestaAluno {

	private static final int PESO_01 = 2;
	private static final int PESO_02 = 2;
	private static final int PESO_03 = 3;
	
	public static void main(String[] args) {
		
		Aluno aluno01 = new Aluno();
		Aluno aluno02 = new Aluno("Rodrigo Pimentel",
								  199803145, //matricula
								  10,		 //nota 1
								  9.5,		 //nota 2
								  7.0,		 //nota 3
								  PESO_01,	 //peso 1
								  PESO_02,	 //peso 2
								  PESO_03);	 //peso 3
		
		//erros no setNome
		aluno01.setNome("s");
		aluno01.setNome("João 13 Luis");
		
		aluno01.setNome("João Luis");
		
		//erros no setMatricula
		aluno01.setMatricula(200712);
		aluno01.setMatricula(2007123453);
		
		aluno01.setMatricula(200712345);
		aluno01.setNota1(6.2);
		aluno01.setNota2(6.0);
		aluno01.setNota3(7.0);
		aluno01.setPeso1(PESO_01);
		aluno01.setPeso2(PESO_02);
		aluno01.setPeso3(PESO_03);
		
		System.out.println("\nAlunos:");
		aluno01.imprimeAluno();
		aluno02.imprimeAluno();		
		
		System.out.println("\nMédia Ponderada do aluno " + aluno01.getNome()
				+ ": " + aluno01.calculaMediaPonderada());
		System.out.println("Média Ponderada do aluno " + aluno02.getNome()
				+ ": " + aluno02.calculaMediaPonderada());
		
		System.out.println("\nAno de matrícula do aluno " + aluno01.getNome()
				+ ": " + aluno01.anoDeMatricula());
		System.out.println("Ano de matrícula do aluno " + aluno02.getNome()
				+ ": " + aluno02.anoDeMatricula());
		
	}

}
