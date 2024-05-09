package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class TestMinimaNota {

	static int[] notasValidas;
	static int[] notasNoValidas;
	
	@BeforeAll
	public static void inicializarDatos() {
        notasValidas = new int[]{1, 2, 3, 4, 5};
        notasNoValidas = new int[]{-1, 11, -5, -8, 20};
    }
	
	@Test
	void testMinimaNotasValoresValidos() {
		
        float minimo = MisArrays.minimaNota(notasValidas);

        assertEquals(1, minimo);
    }
	
	@Test
	void testMinimaNotaValoresValidos() {
        assertThrows(IllegalArgumentException.class, () -> MisArrays.minimaNota(notasNoValidas));
    }
}
