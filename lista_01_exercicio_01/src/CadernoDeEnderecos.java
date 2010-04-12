/* 
 * 1.Escreva uma classe chamada CadernoDeEnderecos
 * que represente os dados de uma pessoa, como nome,
 * telefone, email, data de aniversário e endereço. Que campos
 * (variáveis de instância) e métodos essa classe deve ter?
 * Faça outra classe para usar/testar a classe CadernoDeEnderecos.
 */

public class CadernoDeEnderecos {

	private String nome;
	private String tel;
	private String email;
	private String dataAniversario;
	private String endereco;
	
	public CadernoDeEnderecos(String nome, String tel, String email,
			String dataAniversario, String endereco) {
		this.nome = nome;
		this.tel = tel;
		this.email = email;
		this.dataAniversario = dataAniversario;
		this.endereco = endereco;
	}
	
	public void imprimeRegistro(){
		System.out.println("Nome: " + this.getNome());
		System.out.println("Telefone: " + this.getTel());
		System.out.println("Email: " + this.getEmail());
		System.out.println("Data de Aniversário: " + this.getDataAniversario());
		System.out.println("Endereço : " + this.getEndereco());
		System.out.println("=============================================");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDataAniversario() {
		return dataAniversario;
	}
	public void setDataAniversario(String dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}