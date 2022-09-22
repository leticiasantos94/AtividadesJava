package POO;

public class Pregui�aAbstract {

	public class Preguica2 extends AnimalAbstract {
		
	private String sobeArvore;
		
		public Preguica2(String nome,int idade,String emiteSom,String sobeArvore) {
			super(nome,idade,emiteSom);
			this.sobeArvore = sobeArvore;
		}

		public String getSobeArvore() {
			return sobeArvore;
		}

		public void setSobeArvore(String sobeArvore) {
			this.sobeArvore = sobeArvore;
		}
		
		public void imprimirInfo() {
			System.out.println("\nNome da preguica: "+getNome()+"\nIdade da preguica: "+getIdade()+"\nSom que a preguica emite: "+getEmiteSom()+"\nComo a preguica se locomove: "+sobeArvore);
		
		}
	  
		@Override
		public void comunica (int som) {
			for(int x=0;x<som;x++) {
				System.out.println("\nAhhh Ahhh ahh");
			}
		}
		
		@Override
		public void seMove (String velocidade) {
		System.out.println("\nA preguica sobe a arvore vagarosamente "+velocidade+" !");
		
	}
	}
}
