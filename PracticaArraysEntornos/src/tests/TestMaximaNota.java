package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class TestMaximaNota {

	static int[] notasValidas;
	static int[] notasNoValidas;
	
	@BeforeAll
	public static void inicializarDatos() {
        notasValidas = new int[]{1, 2, 3, 4, 5};
        notasNoValidas = new int[]{-1, 11, -5, -8, 20};
    }
	
	@Test
	void testMediaNotasValoresValidos() {
		
        float maximo = MisArrays.maximaNota(notasValidas);

        assertEquals(5, maximo);
    }
	
	@Test
	void testMaximaNotaValoresValidos() {
        assertThrows(IllegalArgumentException.class, () -> MisArrays.maximaNota(notasNoValidas));
    }
}
