package Vegetaux;

import java.util.AbstractMap.SimpleEntry;

public class Betterave extends Vegetal implements IOgm{

	public Betterave() {
		// TODO Auto-generated constructor stub
		super();
		this.dessin[3] = 'b';
		this.dessin[4] = 'B';
	}

	@Override
	public SimpleEntry<Integer, Integer> seDupliquer(int longeur, int largeur) {
		// TODO Auto-generated method stub
		int nX = (int) (Math.random() * longeur ); //Pour un entier entre 0 et longueurMax  
		int nY = (int) (Math.random() * largeur );
		SimpleEntry<Integer,Integer> refonte = new SimpleEntry<>(nX,nY); //On crée la valeur de retour (deux paramètres de retour)
		return refonte;
	}

}
