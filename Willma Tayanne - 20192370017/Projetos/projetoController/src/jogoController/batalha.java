package jogoController;
import projetoController.*;


import java.util.Scanner;

public class batalha {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int golpe;
		int opcao = 0;
		int opcao2 = 0;
		int maquina = 20;
		int ataque = 0;
		int pt = 0;
		

		do {
			
			System.out.print("\n");
			System.out.println("  Bem vindo ao League of Legends ifpb ");
			System.out.print("\n");
			System.out.println(" Escolha uma opcao pra começar jogatina ");
			System.out.print("\n");
			System.out.println(" |  1 - Escolha qual personagem você ser | ");
			System.out.println(" |  2 - Começar partida, Let’s go baby   | ");
			System.out.println(" |  3 - Fechar jogo – vai estudar! X.x   | ");
			System.out.print("\n");
			
			opcao = entrada.nextInt();
			
			switch (opcao) {               
			case 1:
			
				System.out.println("1 - Soldados da Guerrilha ");
				System.out.println("2 - Espioes ");
				System.out.println("3 - Exercito Inimigo ");
				opcao2 = entrada.nextInt();
				
				if (opcao2 == 1) {
					
					Inimigos jogador = new Inimigos(1);
				 	ataque = jogador.getTotal();
					System.out.print(ataque);	
					System.out.print("\n");
					Pontuacao p = new Pontuacao(1);
					pt = p.getPontos();
					System.out.print(pt);	

				}
				
				else if (opcao2 == 2) {
					
					Inimigos jogador = new Inimigos (2);
				 	ataque = jogador.getTotal();
					System.out.print(ataque);
					
				}
				
				else {

					Inimigos jogador = new Inimigos (3);
				 	ataque = jogador.getTotal();
					System.out.print(ataque);
					
				}
				
				break;
				

			case 2:
				System.out.print("Você deseja matar o inimigo? ");
				System.out.print(" 1 - Sim ");
				System.out.print(" 2 - Não ");
				
				golpe = entrada.nextInt();
				
				
				if(golpe == 1) { 
					if(ataque > maquina)
						System.out.print("Você Ganhou a partida " );
					
					
					else {
						System.out.print("Você perdeu a partida!");
					}
						
				}
				
				else {
					
					System.out.print("Tu é bonzinho demais lhe falta odio " );
				}
				break;
				
			case 3: 
				System.exit(0);
				break;
			
			default:
				
				System.out.print("Errou! - digite as opções 1, 2 ou 3");
			
			}
		} while (opcao != 0);
		
		

	}

}
