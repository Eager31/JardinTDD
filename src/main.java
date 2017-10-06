import java.util.Scanner;

import Vegetaux.Ail;
import Vegetaux.Betterave;
import Vegetaux.Carotte;
import Vegetaux.Tomate;


public class main {

	private static Scanner scanner;

	public static void main(String[] args) {
		Jardin jardin = new Jardin(5, 4);
		jardin.AjouterGraines("Ail", 10);
		jardin.AjouterGraines("Betterave", 5);
		jardin.AjouterGraines("Carotte", 5);
		jardin.AjouterGraines("Tomate", 5);
		
		int Etat = 1;
		while (Etat == 1) {
			System.out.println("MENU");
			System.out.println("1 - Semer une graîne");
			System.out.println("2 - Récolter toutes les plantes qui sont matures");
			System.out.println("3 - Passer à la saison suivante (toutes les plantes grandissent)");
			System.out.println("4 - Quitter l'application");
			//System.out.println(jardin.toString());
		
			int res = 0;
			try {
				scanner = new Scanner(System.in);
				res = scanner.nextInt();
				switch(res) {
					case 1 : //Semer une graine
						System.out.println("Entre la position X");
						int X = scanner.nextInt();
						System.out.println("Entre la position Y");
						int Y = scanner.nextInt();
						System.out.println("Que voulez vous planter ?");
						System.out.println("1 - Ail");
						System.out.println("2 - Betterave");
						System.out.println("3 - Carotte");
						System.out.println("4 - Tomate");
						int choixLegume = scanner.nextInt();
						switch (choixLegume) {
							case 1 :
								jardin.semer(X, Y, new Ail());
							break;
							case 2 :
								jardin.semer(X, Y, new Betterave());
							break;
							case 3 :
								jardin.semer(X, Y, new Carotte());
							break;
							case 4 :
								jardin.semer(X, Y, new Tomate());
							break;
						}
						System.out.println(jardin.toString());
						break;
					case 2 : //Récolter toutes les plantes qui sont matures
						jardin.recolter();
						System.out.println(jardin.toString());
						break;
					case 3 : //Passer à la saison suivante (toutes les plantes grandissent)
						jardin.saisonSuivante();
						System.out.println(jardin.toString());
						break;
					case 4: //Quitter l'application
						Etat = 0;
						System.out.println("Fermeture du Jardin");
						break;
					default :
						System.out.println("Le chiffre doit-être compris entre un et quatre");
						break;
				}
			}catch(Exception e) {
			System.out.println("Veuillez entrer un chiffre");
			}
		}
		

	}

}
