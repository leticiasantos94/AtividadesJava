package POO;

public class TesteAnimal {

public static void main(String[] args) {
		
		System.out.println("---------------------------------------------\n");
		
		AnimalCachorro Romeu = new AnimalCachorro();
		
		Romeu.nome = "Cão";
		Romeu.idade = 7;
		
			System.out.println("Qual o nome dele ? " + Romeu.nome);
			System.out.println("Quantos anos ele tem ? " + Romeu.idade + " anos");
			System.out.println("Que som ele faz ? " + Romeu.emitirSom());
			System.out.println("Ele está correndo ! " + Romeu.correr() + "\n");
		
			System.out.println("--------------------------------------------\n");
		AnimalCavalo Pedepano = new AnimalCavalo();
		
		Pedepano.nome = "cavalo";
		Pedepano.idade = 20;
		
			System.out.println("Qual o nome dele ? " + Pedepano.nome);
			System.out.println("Quantos anos ele tem ? " + Pedepano.idade + " anos");
			System.out.println("Que som ele faz ? " + Pedepano.emitirSom());
			System.out.println("Ele está correndo ! " + Pedepano.correr() + "\n");
			
			System.out.println("--------------------------------------------\n");
		AnimalPreguiça xlr8 = new AnimalPreguiça();
		
		xlr8.nome = "lenta";
		xlr8.idade = 12;
		
			System.out.println("Qual o nome dele ? " + xlr8.nome);
			System.out.println("Quantos anos ele tem ? " + xlr8.idade + " anos");
			System.out.println("Que som ele faz ? " + xlr8.emitirSom());
			System.out.println("Ele está correndo ! " + xlr8.correr() + "\n");
			
			System.out.println("---------------------------------------------\n");
	}
}
