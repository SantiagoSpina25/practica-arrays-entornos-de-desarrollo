package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class TestMediaNotas {

	static int[] notasValidas;
	static int[] notasNoValidas;
    
	@BeforeAll
	public static void inicializarDatos() {
        notasValidas = new int[]{1, 2, 3, 4, 5};
        notasNoValidas = new int[]{-1, 11, 5, 8, 10};
    }
	
	@Test
	void testMediaNotasValoresValidos() {
		
        float mediaCalculada = MisArrays.mediaNotas(notasValidas);

        assertEquals(3, mediaCalculada);
    }
	
	
	
}


