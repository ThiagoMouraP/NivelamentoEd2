package ed2;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] remedios = {35, 33, 42, 10, 14, 19, 27, 44, 26, 31};
		int[] ordenados = ordenar(remedios);
		
		printzada(ordenados);
	}
	
	public static int[] ordenar(int[] v) {
	    // for utilizado para controlar a quantidade de vezes que o vetor será ordenado.
	    for(int i = 0; i < v.length - 1; i++) {
	      // for utilizado para ordenar o vetor.
	      for(int j = 0; j < v.length - 1 - i; j++) {
	        /* Se o valor da posição atual do vetor for maior que o proximo valor,
	          então troca os valores de lugar no vetor. */
	        if(v[j] > v[j + 1]) {
	          int aux = v[j];
	          v[j] = v[j + 1];
	          v[j + 1] = aux;
	        }
	      }
	    }
	    return v;
	  }

	public static void printzada (int[] lista) {
		for(int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}
}
