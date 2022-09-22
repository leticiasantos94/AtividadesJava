package POO;

public abstract class AnimalAbstract {

		
		private String nome;
		private int idade;
		private String emiteSom;
		
		
		abstract public void seMove (String velocidade);
		
		public AnimalAbstract(String nome,int idade,String emiteSom) {
			
			this.nome = nome;
			this.idade = idade;
	        this.emiteSom = emiteSom;
		}

		
	    public AnimalAbstract(String nome2, int idade2, String emiteSom2) {
			// TODO Auto-generated constructor stub
		}

		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public int getIdade() {
			return idade;
		}


		public void setIdade(int idade) {
			this.idade = idade;
		}


		public String getEmiteSom() {
			return emiteSom;
		}


		public void setEmiteSom(String emiteSom) {
			this.emiteSom = emiteSom;
		}


		public void imprimir() {
	    	System.out.println("\nNome do animal: "+nome+"\nIdade do animal: "+idade);
	    }

		public void comunica(String string) {
			 
			
		}

		public void comunica(int som) {
			// TODO Auto-generated method stub
			
		}

		
		}
