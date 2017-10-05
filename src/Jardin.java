import java.util.HashMap;

public class Jardin {

	private int longeur;
	private int largeur;
	private HashMap<String,Integer> panier;
	
	public Jardin(int i, int j) {
		// TODO Auto-generated constructor stub
		this.longeur = i;
		this.largeur = j;
		this.panier = new HashMap<String, Integer>();
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

	public void AjouterGraines(String nomVegetal, int nombreGraines) {
		// TODO Auto-generated method stub
		this.panier.put(nomVegetal, nombreGraines);
	}
	
	public int VerifierGraines(String nomVegetal) {
		// TODO Auto-generated method stub
		return this.panier.get(nomVegetal);
	}
	

}
