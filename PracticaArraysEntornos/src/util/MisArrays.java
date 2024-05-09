package util;

public abstract class MisArrays {
	
	
	
	/**
     * Calcula la media de las notas en un array.
     * 
     * @param notas El array de notas de tipo entero.
     * @return La media de las notas, con decimales.
     * @throws IllegalArgumentException, si alguna nota está fuera del rango válido (entre 0 y 10).
     */
	public static float mediaNotas(int[] notas) {
        int suma = 0;
        for (int i=0; i < notas.length; i++) {
            if (notas[i] < 0 || notas[i] > 10) {
                throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
            }
            suma += notas[i];
        }

        return (float) suma / notas.length;
    }
	
	/**
     * Devuelve la nota máxima en un array.
     * 
     * @param notas El array de notas.
     * @return La nota máxima en el array.
     * @throws IllegalArgumentException, si alguna nota está fuera del rango válido (entre 0 y 10).
     */
    public static int maximaNota(int[] notas) {
        int maximaNota = notas[0];
        
        for (int i=0; i<notas.length;i++) {
        	if (notas[i] < 0 || notas[i] > 10) {
                throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
            }else if(notas[i] > maximaNota){
            	maximaNota = notas[i];
            }
            
        }

        return maximaNota;
    }
	
}
