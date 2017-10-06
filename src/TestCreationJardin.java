
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Vegetaux.Ail;

public class TestCreationJardin {
	
	private Jardin jardin;
	
	@Before
	public void setUp() throws Exception {
		jardin = new Jardin(4,6);
	}

	//Premiers tests pour se rem�morer les bases
	@Test
	public void TestGetLongeur() {
		assertEquals(jardin.getLongeur(),4);
	}
	
	//Ajouter des graines dans le panier de notre jardin
	@Test
	public void AjouterGrainesDansPanier() throws Exception {
		jardin.AjouterGraines("Ail",5);
		assertEquals(jardin.VerifierGraines("Ail"),5);
	}
	
	//Emp�che d'ajouter des valeurs n�gatives dans notre jardin
	@Test(expected=IllegalArgumentException.class)
	public void AjouterValeurNegatives() throws Exception {
		jardin.AjouterGraines("Ail",-5);
	}
	
	//Cr�er des emplacements qui contiennent des v�g�taux dans notre jardin
	@Test
	public void TestEmplacementJardins() throws Exception {
		//Vegetal v = new Vegetal("Ail");
		Ail v = new Ail(); //Modification d�t � l'�volution de Vegetal
		Emplacement[][] emplacement = new Emplacement[jardin.getLongeur()][jardin.getLargeur()]; //On cr�e un talbleau � double dimension QUI PEUT contenir des emplacements
		Emplacement emplacement2 = new Emplacement(v); // On cr�e un emplacement bidon
		emplacement[0][0] = new Emplacement(v);
		assertEquals(emplacement2.getVegetal(), emplacement[0][0].getVegetal());
	}
	
	
}
