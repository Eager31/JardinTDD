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



}
