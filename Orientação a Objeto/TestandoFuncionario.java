package POO;

public class TestandoFuncionario {

	public static void main(String args[]) {
		
		Funcionário func = new Funcionário();
		func.setNome("Letícia");
		func.setSalario(2500);
		
		System.out.println(func.getNome());
		System.out.println(func.getSalario());
	}

}
