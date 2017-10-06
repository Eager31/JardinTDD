
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

	//Premiers tests pour se remémorer les bases
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
	
	//Empêche d'ajouter des valeurs négatives dans notre jardin
	@Test(expected=IllegalArgumentException.class)
	public void AjouterValeurNegatives() throws Exception {
		jardin.AjouterGraines("Ail",-5);
	}
	
	//Créer des emplacements qui contiennent des végétaux dans notre jardin
	@Test
	public void TestEmplacementJardins() throws Exception {
		//Vegetal v = new Vegetal("Ail");
		Ail v = new Ail(); //Modification dût à l'évolution de Vegetal
		Emplacement[][] emplacement = new Emplacement[jardin.getLongeur()][jardin.getLargeur()]; //On crée un talbleau à double dimension QUI PEUT contenir des emplacements
		Emplacement emplacement2 = new Emplacement(v); // On crée un emplacement bidon
		emplacement[0][0] = new Emplacement(v);
		assertEquals(emplacement2.getVegetal(), emplacement[0][0].getVegetal());
	}
	
	
}
