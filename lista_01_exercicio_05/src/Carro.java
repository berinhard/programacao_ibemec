
public class Carro {
	private double qtdCombustivel;
	private double consumo;

	public Carro(double consumo){
		this.qtdCombustivel = 0;
		this.consumo = consumo;
	}
	
	public void andar(double km){
		double gasto = km / this.consumo;
		if (gasto > this.qtdCombustivel){
			System.out.print("Combustivel insufuciente. ");
			km = this.qtdCombustivel * this.consumo;
			gasto = this.qtdCombustivel;
		}
		this.qtdCombustivel = this.qtdCombustivel - gasto;
		System.out.println("Carro andou " + km + " km");
	}
	
	public double getQtdCombustivel(){
		return this.qtdCombustivel;
	}
	
	public void setQtdCombustivel(double qtdCombustivel){
		this.qtdCombustivel = qtdCombustivel;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	
	

}
