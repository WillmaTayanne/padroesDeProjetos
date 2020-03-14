package projetoController;


public class Inimigos {

	String [] x = {"Soldado de Guerrilha", "Espioes", "Exercito Inimigo"};
	int total;
	int inteligencia;
	int forca;
	int estrategia;
	String nome;


	public Inimigos (int a) {
		
		if(a == 1) {
		
			setTotal(21);
			setInteligencia(5);
			setForca(8);
			setEstrategia(8);
			setNome("Soldado de Guerrilha");
	
		}
		
		if(a == 2) {
			 
			setTotal(27);
			setInteligencia(10);
			setForca(7);
			setEstrategia(10);
			setNome("Espioes");
			
		}
		
		if(a == 3) {
			
			setTotal(19);
			setInteligencia(2);
			setForca(7);
			setEstrategia(10);
			setNome("Exercito Inimigo");
		}
		
		
	}
	
	public int getTotal() {
		return total;
	}

	public int setTotal(int total) {
		return this.total = total;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(int estrategia) {
		this.estrategia = estrategia;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	

	
}



	

 






