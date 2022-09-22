package POO;

public class TesteAnimalAbstrac {

	import java.util.Scanner;

			public static void main(String[] args) {
			// TODO Auto-generated method stub
			
	     Scanner leia = new Scanner (System.in);
			
			CachorroAbstract cachorro = new CachorroAbstract("Lion",10,"latido","correndo");
			CavaloAbstract cavalo = new CavaloAbstract("pedepano",21,"relincha","correndo");
			PreguicaAbstract preguica = new PreguicaAbstract("xlr8",5,"balidos","subindo em arvores");
			
			AnimalAbstract animal = null;
			
			System.out.println("\nGostaria de saber mais sobre nossos animais? ");
			cachorro.imprimirInfo();
			cavalo.imprimirInfo();
			preguica.imprimirInfo();
			
			
			System.out.println("\nCenheca nossos animais:");
			System.out.println("\n1 - Cachorro");
			System.out.println("\n2 - Cavalo");
			System.out.println("\n3 - Preguica");
			System.out.println("\nQual o seu animal favorito?");
			int n = leia.nextInt();
			

			switch(n) {
			case 1: animal = cachorro;
			break;
			case 2: animal = cavalo;
			break;
			case 3: animal= preguica;
			break;
			default:System.out.println("\nQue pena, nao encontramos esse animal :(");
			}
			
			
			int i = (int) (Math.random()*3.0);
			
			if(animal != null) {
				
				animal.comunica(i);
				animal.seMove("a certa velocidade");
			}
			 


		}

	}
