import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Vegetaux.Ail;
import Vegetaux.Carotte;

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
	
	//Test pour savoir si on plante un vegetal
	@Test
	public void TestSemerUnLegume() {
		Ail ail = new Ail();
		jardin.AjouterGraines("Ail", 1);//On est obligés d'ajouter des graines
		jardin.semer(0,0,ail);
		assertEquals(jardin.getEmplacements()[0][0].getVegetal(),ail);
	}
	
	//Test pour savoir si on plante un vegetal
	@Test(expected=IllegalArgumentException.class)
	public void TestSemerUnLegumeSansGraines() {
		Ail ail = new Ail();
		jardin.semer(0,0,ail);
	}
	
	//Test pour vérifier qu'une graine est bien retirée quand on plante
	@Test
	public void TestValeurGraineApresPlantation() {
		Carotte car = new Carotte();
		jardin.AjouterGraines("Carotte", 5);
		jardin.semer(0,0,car); //On plante nos carottes
		int nbrGraines = jardin.getPanier().get("Carotte");
		assertEquals(nbrGraines,4);
	}
	
	//Test pour savoir si on fais pousser une fois, la plante évolue
	@Test
	public void TestPasserUneSaison() {
		Carotte car = new Carotte();
		jardin.AjouterGraines("Carotte", 1);
		jardin.semer(0,0,car); 
		jardin.saisonSuivante();//On fais pousser la plante
		assertEquals(jardin.getEmplacements()[0][0].getVegetal().getCaractereDessin(jardin.getEmplacements()[0][0].getVegetal().getEtat().ordinal()),'.');
	}
}
