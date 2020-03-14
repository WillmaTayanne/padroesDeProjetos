package projetoController;
import jogoController.*;
import java.util.Scanner;

public class PontuacaoController {

	
	public PontuacaoController(int pontos) {
		Pontuacao ponto = new Pontuacao(pontos); 
		
		if(pontos == 1) {
			ponto.setPontos(100);
			ponto.getPontos();
		}
		
		else if (pontos == 2)  {
			ponto.setPontos(200);
			ponto.getPontos();
		}
		else {
			ponto.setPontos(50);
			ponto.getPontos();
		}
		
	}

	
	public String ganhou (String nome) {
		return "ganhou!! " +nome;
		
	}
	
	public String perdeu (String nome) {
		return "perdeu :(((( " +nome;
	}
	
	

}


