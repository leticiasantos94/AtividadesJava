package POO;

public class Avi�o {
	
	private String companhiaA�rea;
	private String destino;
	private String aeroporto;
	
	public Avi�o (String nome, String lugar, String endere�o)
	{
		companhiaA�rea = nome;
		destino = lugar;
		aeroporto = endere�o;
	}
	public String getviagem()
	{
		String informa��es = companhiaA�rea+ " " +destino+ " " +aeroporto;
		return informa��es;
		
	}

}
