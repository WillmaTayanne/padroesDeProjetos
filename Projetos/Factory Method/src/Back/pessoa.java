package Back;

public class pessoa {

	String nome;

	public pessoa(String nome) {
		super();
		this.nome = nome;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String saudacao() {
		return "Ola "+this.nome;
	}

	
}
