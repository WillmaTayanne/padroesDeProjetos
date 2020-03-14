package jogoController;

import java.util.Scanner;

import projetoController.jogabilidade;
import projetoController.Inimigos;
import projetoController.PontuacaoController;

public class NewJogo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" |   Começar partida, Let’s go baby   | ");
		
		System.out.println("Digite seu nome");
		String nome = entrada.nextLine();
		
		System.out.println("Qual personagem você quer escolher");
		
		int a = entrada.nextInt();
		
		jogabilidade novojogo = new jogabilidade();
		PontuacaoController p = new PontuacaoController(a);
		novojogo.jogar(a, nome);
		
		Inimigos i = new Inimigos(a);
		System.out.println(" você é "+ i.getNome());
		System.out.println(novojogo.jogar(a, nome));
		
		
	
		
		
		
		
		
	}
}
