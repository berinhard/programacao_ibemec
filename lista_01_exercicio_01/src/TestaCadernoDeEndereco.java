public class TestaCadernoDeEndereco {

	public static void main(String[] args) {
		
		CadernoDeEnderecos cadernoBernardo = new CadernoDeEnderecos("Bernardo",
											  "83423768",
											  "bernardo@uol.com.br",
											  "22 de Setembro",
											  "Rua Santa Clara, Copacana, 101");
		
		CadernoDeEnderecos cadernoRegina = new CadernoDeEnderecos("Regina",
				  							  "25576491",
				  							  "regina@gmail.com.br",
				  							  "15 de Fevereiro",
				  							  "Rua Farani, Botafogo, 134/604");
		
		CadernoDeEnderecos cadernoFabio = new CadernoDeEnderecos("Fábio",
				  							  "25423675",
				  							  "fabio@hotmail.com.br",
				  							  "01 de Março",
											  "Rua Conde de Bonfim, Tijuca, 286/102");
		
		System.out.println("Meus registros do caderno:");
		cadernoBernardo.imprimeRegistro();
		cadernoRegina.imprimeRegistro();
		cadernoFabio.imprimeRegistro();
		
		String novoEnd = "Praça da Bandeira, Tijuca, sem numero";
		System.out.println("\n" + cadernoFabio.getNome() + " mudou de endereço para: " + novoEnd);
		cadernoFabio.setEndereco(novoEnd);
		System.out.println("Agora o seu registro ficou:");
		cadernoFabio.imprimeRegistro();
		
		String novoEmail = "bernardo17@gmail.com";
		System.out.println("\n" + cadernoBernardo.getNome() + " mudou de email para: " + novoEmail);
		cadernoBernardo.setEmail(novoEmail);
		System.out.println("Agora o seu registro ficou:");
		cadernoBernardo.imprimeRegistro();
		
		String novoAniv = "21 de Agosto";
		System.out.println("\nA data de aniversário de " + cadernoRegina.getNome() + " estava errada. A certa é: " + novoAniv);
		cadernoRegina.setDataAniversario(novoAniv);
		System.out.println("Agora o seu registro ficou:");
		cadernoRegina.imprimeRegistro();
		
		String novoTel = "93415671";
		System.out.println("\n" + cadernoBernardo.getNome() + " mudou de endereço para: " + novoTel);
		cadernoBernardo.setTel(novoTel);
		System.out.println("Agora o seu registro ficou:");
		cadernoBernardo.imprimeRegistro();
		
		String novoNome = "Fabio Rodrigues";
		System.out.println("\nO nome completo de " + cadernoFabio.getNome() + " é: " + novoNome);
		cadernoFabio.setNome(novoNome);
		System.out.println("Agora o seu registro ficou:");
		cadernoFabio.imprimeRegistro();
		
	}

}
