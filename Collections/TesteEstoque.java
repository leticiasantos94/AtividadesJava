package POO;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;

	public class TesteEstoque {

		public static void main(String[] args) {
			
			Estoque produto1 = new Estoque("Açucar");
			Estoque produto2 = new Estoque("Macarrão");
			Estoque produto3 = new Estoque("Café Solúvel");
			Estoque produto4 = new Estoque("Arroz");
			Estoque produto5 = new Estoque("Açucar");
			
			ArrayList<Estoque> produtos = new ArrayList<>();
			
			produtos.add(produto1);
			produtos.add(produto2);
			produtos.add(produto3);
			produtos.add(produto4);
			produtos.add(produto5);
			
				System.out.println("Produtos em estoque: " + produtos + "\n");
			
			produtos.remove(produto1);
			produtos.remove(produto3);
				
				System.out.println("Produtos removidos !\n \nO novo estoque é:    " + produtos + "\n");
			
			Estoque produto6 = new Estoque("Batata frita");
			Estoque produto7 = new Estoque("Carne");
			
			produtos.set(0, produto6);
			produtos.set(0, produto7);
			 
				System.out.println("Produtos substituidos !\n \nO novo estoque é:    " + produtos + "\n");
			
			produtos.add(produto4);
			produtos.add(produto2);
			
			System.out.println("Produtos adicionados !\n\nO estoque atual é:   " + produtos + "\n");
			

		}

	}
