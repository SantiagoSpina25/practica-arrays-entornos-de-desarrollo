package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class TestMedianaNotas {

	static int[] notasValidas;
	static int[] notasNoValidas;
	
	@BeforeAll
	public static void inicializarDatos() {
        notasValidas = new int[]{1, 2, 3, 4, 5};
        notasNoValidas = new int[]{-1, 11, -5, -8, 20};
    }
	
	@Test
	void testMedianaNotasValoresValidos() {
		
        float mediano = MisArrays.medianaNotas(notasValidas);

        assertEquals(3, mediano);
    }
	
	@Test
	void testMedianaNotaValoresValidos() {
        assertThrows(IllegalArgumentException.class, () -> MisArrays.medianaNotas(notasNoValidas));
    }
}
