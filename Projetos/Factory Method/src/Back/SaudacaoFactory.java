package Back;


public class SaudacaoFactory {

	String genero = "-";
	  
	  public SaudacaoFactory( String g ) {
	    this.genero = g;
	  }

	  public String getGenero() {
	    return genero;
	  }

	  public void setGenero(String genero) {
	    this.genero = genero;
	  }
	  
	  
	  public pessoa saudacao(String nome) {
			if (this.genero.equals("m"))
				return new mulher(nome);
			else if(this.genero.contentEquals("f"))
				return new homem(nome);
			else 
				return new pessoa(nome);

	
}
	  
}
