/*
 * 1.Desenvolva uma classe de nome CodigoPostal, cujas
 * instâncias sejam capazes de guardar o Código Postal
 * de uma dada rua. Note que cada Código Postal é constituído
 * por dois números inteiros, que designaremos respectivamente
 * por "indicativo" e "extensão", e o nome da rua (Ex: 38408-046 Armando Lombardi).
 * Deverão poder ser criados códigos postais dados: 
		+ "indicativo", "extensão" e rua + "indicativo" e rua
				(ficando nesse caso a extensão igual a zero)
		+ nenhum parâmetro (ficando nesse caso os atributos numéricos a zero e a
				rua com a mensagem "Indisponível".
 * Para além dos usuais métodos seletores (getters) e modificadores (setters)
 * implemente também o método mostra, cuja evocação, permita visualizar
 * a informação relativa a um determinado código postal no formato:
		CEP: 38408 - 046 Armando Lombardi
		(ou CEP: Indisponível se for o caso).
 * Escreva um programa de teste para a classe CodigoPostal.
 * Crie várias instâncias da classe e teste os vários métodos implementados.
 */
public class CodigoPostal {
	
	private int indicativo;
	private int extensao;
	private String rua;
	
	private final int VALOR_CEP_NAO_INFORMADO = 0;
	private final String RUA_NAO_INFORMADA = "Indisponível";
	
	public CodigoPostal(int indicativo, int extensao, String rua) {
		this.indicativo = indicativo;
		this.extensao = extensao;
		this.rua = rua;
	}

	public CodigoPostal(int indicativo, String rua) {
		this.indicativo = indicativo;
		this.extensao = VALOR_CEP_NAO_INFORMADO;
		this.rua = rua;
	}
	
	public CodigoPostal(){
		this.indicativo = VALOR_CEP_NAO_INFORMADO;
		this.extensao = VALOR_CEP_NAO_INFORMADO;
		this.rua = RUA_NAO_INFORMADA;
	}
	
	public String mostra(){
		String cepExtenso = "CEP: ";
		if (this.getRua().equals(RUA_NAO_INFORMADA)){
			cepExtenso = cepExtenso + RUA_NAO_INFORMADA;
		} else {
			cepExtenso = cepExtenso + this.getIndicativo() + " - " + this.getExtensao() + " " + this.getRua();
		}
		return cepExtenso;
	}
	
	public int getIndicativo() {
		return indicativo;
	}
	public void setIndicativo(int indicativo) {
		this.indicativo = indicativo;
	}
	public int getExtensao() {
		return extensao;
	}
	public void setExtensao(int extensao) {
		this.extensao = extensao;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	
	
}
