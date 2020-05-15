package concursopintura;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.svalero.concursopintura.model.Alumno;



public class TestConcurso {
	
private static Alumno alumno;
	
	@Test
	public static void  setupAll() {
		alumno = new Alumno("Paco","Alonso","4 ESO","paquito@gmail.com", "9/5/99");
	}

}
