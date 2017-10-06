import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Vegetaux.Ail;

public class TestVegetauxSpeciaux {

	private Jardin jardin;
	
	@Before
	public void setUp() throws Exception {
		jardin = new Jardin(4,6);
	}
	
	//Test pour vérifier la duplication de graines lorsqu'on récolte de l'ail #IOgm
	@Test
	public void TestIOGmAil() {
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

}
