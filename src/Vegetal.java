
public abstract class Vegetal {

	private Etat etat;
	private char[] dessin = {'_','.','i',' ',' ','#'};
	
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
	
	
	
}
