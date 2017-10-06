import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestVegetaux {
	
	private Jardin jardin;
	
	@Before
	public void setUp() throws Exception {
		jardin = new Jardin(4,6);
	}

	//Test Général sur les nouvelles filles
			@Test
			public void TestFillesVegetaux() throws Exception {
				setUp();
				Ail ail = new Ail();
				Betterave betterave = new Betterave();
				Carotte carotte = new Carotte();
				Tomate tomate = new Tomate();
				
				Emplacement emplacementail = new Emplacement(ail);
				Emplacement emplacementbetterave = new Emplacement(betterave);
				Emplacement emplacementcarotte = new Emplacement(carotte);
				Emplacement emplacementtomate = new Emplacement(tomate);
				
				jardin.getEmplacements()[0][0] = new Emplacement(new Ail());
				jardin.getEmplacements()[0][1] = new Emplacement(new Betterave());
				jardin.getEmplacements()[0][2] = new Emplacement(new Carotte());
				jardin.getEmplacements()[0][3] = new Emplacement(new Tomate());
				
				assertEquals(jardin.getEmplacements()[0][0].getVegetal().getClass(),emplacementail.getVegetal().getClass());
				assertEquals(jardin.getEmplacements()[0][1].getVegetal().getClass(),emplacementbetterave.getVegetal().getClass());
				assertEquals(jardin.getEmplacements()[0][2].getVegetal().getClass(),emplacementcarotte.getVegetal().getClass());
				assertEquals(jardin.getEmplacements()[0][3].getVegetal().getClass(),emplacementtomate.getVegetal().getClass());
			}
			
			//Tests d'héritages
			@Test
			public void TestHeritage() throws Exception {
				Ail ail = new Ail();
				Betterave betterave = new Betterave();
				Carotte carotte = new Carotte();
				Tomate tomate = new Tomate();
				
				assertTrue(ail instanceof Vegetal);
				assertTrue(betterave instanceof Vegetal);
				assertTrue(carotte instanceof Vegetal);
				assertTrue(tomate instanceof Vegetal);
			}
			
			//Tests de l'état par défaut
			@Test
			public void TestEtatVegetal() throws Exception {
				Ail ail = new Ail();
				assertEquals(ail.getEtat(),Etat.GRAINE);
			}
}
