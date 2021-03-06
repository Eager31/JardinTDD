package Vegetaux;

public abstract class Vegetal {

	protected Etat etat;
	protected char[] dessin = {'_','.','i',' ',' ','#'}; //passage � protected pour exploiter au niveau des enfants
	
	public Vegetal () {
		this.etat = etat.GRAINE;
		this.dessin = dessin;
	}

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public char[] getDessin() {
		return dessin;
	}

	public void setDessin(char[] dessin) {
		this.dessin = dessin;
	}
	
	public char getCaractereDessin(int i) {
		return this.dessin[i];
	}
	
	public void grandir() {
		this.etat = Etat.values()[this.etat.ordinal() + 1]; //Pemet de passer � l'�tape suivante d'une �num�ration
	}
	
}
