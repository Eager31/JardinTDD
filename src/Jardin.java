import java.util.HashMap;

import Vegetaux.Etat;
import Vegetaux.Vegetal;

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
	
	public void retirerGraines(String nomVegetal, int nombreGraines) {
		if(nombreGraines > 0)
		      throw new IllegalArgumentException();
		else if (this.getPanier().get(nomVegetal) == 0) {
		    		System.out.println("Vous ne pouvez pas planter, vous n'avez pas assez de graine pour ce type de légume");
		    	}else {
		    		this.panier.put(nomVegetal, this.panier.get(nomVegetal)-1); //On met à jour le nombre de végetaux
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
		String chaineFinale = "\n"; //Saut de ligne dès le début
		String tmp;
		for (int x = 0; x < this.longeur; x++) {
			for (int y = 0; y < this.largeur; y++) {
					if (this.emplacements[x][y]  != null) {
						tmp = String.format("%c", this.emplacements[x][y].getVegetal().getCaractereDessin( this.emplacements[x][y].getVegetal().getEtat().ordinal() ));//On affiche le caractère
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

	public void semer(int x, int y, Vegetal v) {
		// TODO Auto-generated method stub
		String nomDeMonLegume = v.getClass().getName();
		String chaineASupprimer="Vegetaux."; //On retire le nom 
		nomDeMonLegume = nomDeMonLegume.replace(chaineASupprimer, "");
		//On a donc le nom du vegetal
		if (this.getPanier().get(nomDeMonLegume) == null) {
			throw new IllegalArgumentException();
		}else if (this.getPanier().get(nomDeMonLegume) > 0) {
			this.retirerGraines(nomDeMonLegume,-1); //On retire une graine
			this.emplacements[x][y] = new Emplacement(v);
		}
	}

	public void saisonSuivante() {
		// TODO Auto-generated method stub
		for (int x = 0; x < this.longeur; x++) {
			for (int y = 0; y < this.largeur; y++) {
				if (this.emplacements[x][y] == null)
					return;
				if (this.emplacements[x][y].getVegetal().getEtat() == Etat.MORT) {
					return;
				}else {
					this.emplacements[x][y].getVegetal().grandir();
				}
			}
		
		}

	}
}

