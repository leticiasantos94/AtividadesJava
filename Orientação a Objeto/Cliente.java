package POO;

public class Cliente {
	
	private String nomeDoCliente;
	private String dataDeNascimento;
	private String telefone;
	
	public Cliente (String nome, String data, String numero)
	{
		nomeDoCliente = nome;
		dataDeNascimento = data;
		telefone = numero;
	}
	public String getdadosDoCliente()
	{
		String dadosDoCliente = nomeDoCliente+ " " +dataDeNascimento+ " " +telefone;
		return dadosDoCliente;
	
	}
}
