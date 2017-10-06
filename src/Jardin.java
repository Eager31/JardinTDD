import java.util.Arrays;
import java.util.HashMap;

public class Jardin {

	private int longeur;
	private int largeur;
	private HashMap<String,Integer> panier;
	private Emplacement[][] emplacements;
	
	public Jardin(int i, int j) {
		// TODO Auto-generated constructor stub
		this.longeur = i;
		this.largeur = j;
		this.panier = new HashMap<String, Integer>();
		this.emplacements = new Emplacement[this.longeur][this.largeur]; //Pourra contenir des emplacements
	}

	public int getLongeur() {
		return longeur;
	}

	public void setLongeur(int longeur) {
		this.longeur = longeur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public HashMap<String, Integer> getPanier() {
		return panier;
	}

	public void setPanier(HashMap<String, Integer> panier) {
		this.panier = panier;
	}

	public void AjouterGraines(String nomVegetal, int nombreGraines) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if(nombreGraines < 0)
		      throw new IllegalArgumentException();
		    else
		    {
		    	this.panier.put(nomVegetal, nombreGraines);
		    }
	}
	
	public int VerifierGraines(String nomVegetal) {
		// TODO Auto-generated method stub
		return this.panier.get(nomVegetal);
	}

	public Emplacement[][] getEmplacements() {
		return emplacements;
	}

	public void setEmplacements(Emplacement[][] emplacements) {
		this.emplacements = emplacements;
	}

	@Override
	public String toString() {
			return String.format("Voici notre jardin :\n %s\n Et notre panier contient :\n Tomate : %d graine(s) \n Carotte : %d graine(s)\n Ail : %d graine(s)\n Betterave :  %d graine(s)",RetournerJardin()				
						,this.panier.get("Tomate"),this.panier.get("Carotte"),this.panier.get("Ail"),this.panier.get("Betterave"));
		}

	public String RetournerJardin() {
		// TODO Auto-generated method stub
		String chaineFinale = "\n"; //Saut de ligne d�s le d�but
		String tmp;
		for (int x = 0; x < this.longeur; x++) {
			for (int y = 0; y < this.largeur; y++) {
					if (this.emplacements[x][y]  != null) {
						tmp = String.format("%c", this.emplacements[x][y].getVegetal().getCaractereDessin( this.emplacements[x][y].getVegetal().getEtat().ordinal() ));//On affiche le caract�re
						chaineFinale = chaineFinale.concat(tmp);
					}else {
						tmp = String.format("%c", 'o'); //Si c'est nul
						chaineFinale = chaineFinale.concat(tmp);
					}
			}
			chaineFinale = chaineFinale.concat("\n");
		}
		return chaineFinale;
	}

}
