import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Vegetaux.Ail;

public class TestFonctionnalités {

	private Jardin jardin;
	
	@Before
	public void setUp() throws Exception {
		jardin = new Jardin(4,6);
	}

	//Test d'initialisation d'affichage
	@Test
	public void TestAffichageJardinVide() {
		 //Notre jardin ne doit contenir que des 'o'
		assertTrue(jardin.RetournerJardin().contains("oooo")); 
	}

	//Test affichage après ajout d'un légume
	@Test
	public void TestAffichageJardinAvecModifications() {
		jardin.getEmplacements()[0][2] = new Emplacement(new Ail());
		assertTrue(jardin.RetournerJardin().contains("oo_o")); 
	}
}
