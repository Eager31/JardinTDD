import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Vegetaux.Ail;
import Vegetaux.Betterave;
import Vegetaux.IOgm;
import Vegetaux.IRacePure;

public class TestVegetauxSpeciaux {

	private Jardin jardin;
	
	@Before
	public void setUp() throws Exception {
		jardin = new Jardin(4,6);
	}
	
	//Test pour vérifier la duplication de graines lorsqu'on récolte de l'ail #IRacePure
	@Test
	public void TestIRacePure() {
		Ail ail = new Ail();
		jardin.getPanier().put("Ail", 1);
		jardin.semer(0, 0, ail);
		jardin.saisonSuivante();
		jardin.saisonSuivante();
		jardin.saisonSuivante();
		jardin.saisonSuivante();
		jardin.recolter();
		int i = jardin.getPanier().get("Ail");
		assertEquals(i,3);
	}
	
	//Test pour vérifier la duplication de graines lorsqu'on récolte de l'ail #IOgm
	//Une betterave pousse
	@Test
	public void TestIOGmAil() {
		Betterave bet = new Betterave();
		jardin.getPanier().put("Betterave", 1);
		jardin.semer(0, 0, bet);
		jardin.saisonSuivante();
		jardin.saisonSuivante();
		jardin.saisonSuivante();
		jardin.saisonSuivante();
		jardin.recolter(); //La betterave de type "IOgm se fait récolter"
		for (int x = 0; x < jardin.getLongeur(); x++) {
			for (int y = 0; y < jardin.getLongeur(); y++) {
				if (jardin.getEmplacements()[x][y] != null) {
					assertTrue(jardin.getEmplacements()[x][y].getVegetal() instanceof IOgm); // Une betterave a poussé
				}
			}
		}
	}
		

}
