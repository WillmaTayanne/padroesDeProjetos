package Front;

import java.util.Scanner;

import Back.SaudacaoFactory;
import Back.pessoa;


public class Boasvindas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual seu nome ? ");
		String nome = entrada.nextLine();
		System.out.println("Qual seu genero ? ");
		String genero = entrada.nextLine();
		
		SaudacaoFactory fabrica = new SaudacaoFactory(genero);
		
		pessoa p = fabrica.saudacao(nome);
		
		System.out.println(p.saudacao());
		
		
	}
}
