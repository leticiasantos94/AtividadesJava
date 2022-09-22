package POO;

public class Carro {
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	void liga() { //método apenas indica que o carro está ligado quando for chamado.
		System.out.println("O carro está ligado...");
	}
	void acelera(double quantidade)
	{
		double velocidadeNova = this.velocidadeAtual+quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	int pegaMarcha() //verificar através de um laço condicional e velocidade atual, para verificar se é menor que zero, ou se 
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
