package projetoController;

public class Pontuacao {
	
	private int pontos;
	
	
	
	public int getPontos() {
		return pontos;
	}


	public void setPontos(int pontos) {
		this.pontos = pontos;
	}


	public Pontuacao(int ponto) {
		
		if(ponto == 1) {
			setPontos(100);
		}
		
		else if (ponto == 2)  {
			setPontos(200);

		}
		else {
			setPontos(50);

		}
		
		

	
}
}