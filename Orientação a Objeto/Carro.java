package POO;

public class Carro {
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	void liga() { //m�todo apenas indica que o carro est� ligado quando for chamado.
		System.out.println("O carro est� ligado...");
	}
	void acelera(double quantidade)
	{
		double velocidadeNova = this.velocidadeAtual+quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	int pegaMarcha() //verificar atrav�s de um la�o condicional e velocidade atual, para verificar se � menor que zero, ou se 
	{
		if(this.velocidadeAtual<0)
		{
			return -1;
		}
		if (this.velocidadeAtual>=0 && this.velocidadeAtual <40);
		{
			return 1;
		}
		if (this.velocidadeAtual>=40 && this.velocidadeAtual <80);
		{
			return 2;
		}
		{
		return 3;
	}
	}
}
