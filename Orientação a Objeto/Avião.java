package POO;

public class Avião {
	
	private String companhiaAérea;
	private String destino;
	private String aeroporto;
	
	public Avião (String nome, String lugar, String endereço)
	{
		companhiaAérea = nome;
		destino = lugar;
		aeroporto = endereço;
	}
	public String getviagem()
	{
		String informações = companhiaAérea+ " " +destino+ " " +aeroporto;
		return informações;
		
	}

}
