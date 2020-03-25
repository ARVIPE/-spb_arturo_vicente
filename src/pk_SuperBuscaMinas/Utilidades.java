package pk_SuperBuscaMinas;

public class Utilidades {

	/**
	 * Método que imprime una matriz por pantalla
	 */
	public static void imprimeMatrizBotones(BotonMina[][] matrizBotones) {
		// TODO
	    for(int i = 0 ; i < matrizBotones.length; i++) {
	        for(int j = 0; j < matrizBotones.length; j++){
	            System.out.println(matrizBotones[j][i].getValor() + " ");
	        }
	        System.out.println("\n");
	    }
	}

}
