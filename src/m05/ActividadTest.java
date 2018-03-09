package m05;

import static org.junit.Assert.*;

import org.junit.Test;

public class ActividadTest {

	@Test
	public void test() {
		assertEquals(1, actividad.vocalssoles(" a "));
		assertEquals(5, actividad.vocalssoles(" a e i o u "));
		assertEquals(2, actividad.vocalssoles(" prueba si esto o u ui "));
		assertEquals(5, actividad.vocalssoles(" 1* A E I O UUU U "));
		assertEquals(6, actividad.vocalsjuntes(" aaa "));
		assertEquals(6, actividad.vocalsjuntes(" aaA "));
		assertEquals(14, actividad.vocalsjuntes(" aaA  eeee e i "));
		assertEquals(6, actividad.vocalsjuntes(" 12334 5t g j iii u "));
		assertEquals(10, actividad.numeros(" 1 2 3 4 "));
		assertEquals(0, actividad.numeros(" 0 "));
		assertEquals(3, actividad.numeros(" -1 -2 "));
		assertEquals(6, actividad.numeros(" 1 -5 "));
		assertEquals(31, actividad.numeros(" 1234543eh123 12 "));
		
	}

}
