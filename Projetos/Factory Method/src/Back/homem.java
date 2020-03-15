package Back;

public class homem extends pessoa {

	public homem(String nome) {
		super(nome);
	}
	
	public String saudacao() {
		return "Ola Sr "+getNome();
		
	}
	
}
