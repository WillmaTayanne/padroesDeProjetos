package projetoController;

public class jogabilidade {

	int maquina = 20;
	
	
	public String jogar  (int a, String nome) {

		
			if(a == 1) {
				Inimigos jogador = new Inimigos (1);
				jogador.getTotal();
				jogador.getNome();
				if(jogador.getTotal() > maquina) {
					PontuacaoController p = new PontuacaoController(a);
					 p.ganhou(nome);
				
				return p.ganhou(nome);
				}
			}
			else if (a == 2) {
				
				Inimigos jogador = new Inimigos (2);
				jogador.getTotal();
				jogador.getNome();
				if(jogador.getTotal() > maquina) {
					PontuacaoController p = new PontuacaoController(a);
					p.ganhou(nome);
					
					return p.ganhou(nome);
					}
				
			}
			
			else {
				Inimigos jogador = new Inimigos (3);
				jogador.getTotal();
				jogador.getNome();
				if( maquina > jogador.getTotal()) {
					PontuacaoController p = new PontuacaoController(a);
					p.perdeu(nome); 
					return p.perdeu(nome);
					}
			}
			
			return nome;
	}
	


	
	}
	
	

