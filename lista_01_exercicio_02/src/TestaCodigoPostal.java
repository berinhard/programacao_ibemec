
public class TestaCodigoPostal {

	public static void main(String[] args) {
		
		CodigoPostal cep01 = new CodigoPostal(75670, 234, "Rua Ernesto Basílio");
		CodigoPostal cep02 = new CodigoPostal(86410, "Avenida Maracanã");
		CodigoPostal cep03 = new CodigoPostal();
		
		System.out.println("Os valores dos CEPs criados:");
		System.out.println("01: " + cep01.mostra());
		System.out.println("02: " + cep02.mostra());
		System.out.println("03: " + cep03.mostra());
		
	}

}
