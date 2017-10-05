import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCreationJardin {

	@Before
	public void setUp() throws Exception {
	
	}

	//Premiers tests pour se remémorer les bases
	@Test
	public void TestGetLongeur() {
		Jardin jardin = new Jardin(4,6);
		assertEquals(jardin.getLongeur(),4);
	}
	
	@Test
	public void AjouterGrainesDansPanier() {
		Jardin jardin = new Jardin(4,6);
		jardin.AjouterGraines("Ail",5);
		assertEquals(jardin.VerifierGraines("Ail"),5);
	}
	
}
