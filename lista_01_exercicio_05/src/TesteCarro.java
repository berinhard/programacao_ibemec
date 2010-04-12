
public class TesteCarro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double consumo = 16;
		double combustivel = 20;
		double distanciaKm = 150;		
		System.out.println("Uno com consumo de " + consumo + "km por litro" +
				" tenta andar " + distanciaKm + " km:");		
		Carro uno = new Carro(consumo);
		uno.setQtdCombustivel(combustivel);
		uno.andar(distanciaKm);
		uno.getQtdCombustivel();
		
		consumo = 12;
		combustivel = 16;
		distanciaKm = 300;
		System.out.println("\nGol com consumo de " + consumo + "km por litro" +
				" tenta andar " + distanciaKm + " km:");		
		Carro gol = new Carro(consumo);
		gol.setQtdCombustivel(combustivel);
		gol.andar(distanciaKm);
		gol.getQtdCombustivel();
		
	}

}
