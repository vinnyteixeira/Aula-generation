package RpgProject;

import java.util.Scanner;

public class TesteMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int escolha=1;
		Scanner ler = new Scanner(System.in);
		
		String nome;
		System.out.println("\nNome do personagem: ");
		nome = ler.next();
		
		
		while(escolha!=0) {
			System.out.println("\n------- Matador de Orcs ---------");
			System.out.println("\n0-Sair");
			System.out.println("\n1-Batalha direta");
			System.out.println("\n2-Aventura");
			System.out.println("\nescolha: ");
			escolha=ler.nextInt();
			
			if (escolha==1) {
				
				
				Guerreiro guerreiro = new Guerreiro(nome);
				Orc orc = new Orc();
				System.out.println("\nVoc� acaba de se deparar com o orc, que te acaba por te encurralar junto a parede.\n Ele � bem maior que voc�, seus           m�sculos enormes suados cheiram como um cad�ver em estado de putrefa��o. Ele segura um machado de duas m�os.\n O orc          diz algumas palavras em sua l�ngua nativa, porem voc� as interpreta como VOC� MORRE AQUI!\n");
				
				do {
					
					if (guerreiro.getVida()>0) {
					System.out.println("\n"+guerreiro.getNome()+" tentativa de ataque:");
					
					if (orc.defesa(guerreiro.jogarDado(20))) {
						orc.receberDano(guerreiro.atacar());
					}
					}
					else {
						System.out.println("\n"+guerreiro.getNome()+" morreu! \n GAME OVER");
						break;
					}
					if (orc.getVida()>0) {
						System.out.println("\n"+orc.getNome()+" tentativa de ataque:");
						if (guerreiro.defesa(orc.jogarDado(20))) {
							guerreiro.receberDano(orc.atacar());	
						}
					}
					else {
						System.out.println("\n"+guerreiro.getNome()+" derrotou o Orc! Parab�ns !!");
						break;
					}
					

				}while (true);
				
			}
			//fim batalha orc
			
			if (escolha==1) {
				
				Guerreiro guerreiro = new Guerreiro(nome);
				Lobisomen lobisomen = new Lobisomen();
				System.out.println("\nVoc� acaba de se deparar com um enorme lobisomen, com garras afiadas cujo ataque pode destro�ar ate mesmo �rvores\n");
				
				do {
					
					if (guerreiro.getVida()>0) {
					System.out.println("\n"+guerreiro.getNome()+" tentativa de ataque:");
					
					if (lobisomen.defesa(guerreiro.jogarDado(20))) {
						lobisomen.receberDano(guerreiro.atacar());
					}
					}
					else {
						System.out.println("\n"+guerreiro.getNome()+" morreu! \n GAME OVER");
						break;
					}
					if (lobisomen.getVida()>0) {
						System.out.println("\n"+lobisomen.getNome()+" tentativa de ataque:");
						if (guerreiro.defesa(lobisomen.jogarDado(20))) {
							guerreiro.receberDano(lobisomen.atacar());	
						}
					}
					else {
						System.out.println("\n"+guerreiro.getNome()+" derrotou o Lobisomen! Parab�ns !!");
						break;
					}
					

				}while (true);
			
			
			
			
			
			
		}
	}

}}
