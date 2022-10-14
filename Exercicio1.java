package ed2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sequenciaInicial = {1, 7, 2, 9};
		ArrayList<Integer> sequencia = geraSequencia(sequenciaInicial);
		printzada(sequencia);
	}
	
	public static ArrayList<Integer> geraSequencia(int[] sequenciaInicial) {
		ArrayList<Integer> sequencia = new ArrayList();
		
		// adiciona sequenciaInicial ao ArrayList
		for(int i = 0; i < sequenciaInicial.length; i++) {
			sequencia.add(sequenciaInicial[i]);
		}
		
		for(int i = 0; i < 101; i++) {
			sequencia.add(sequencia.get(i) + sequencia.get(i+1));
		}
		
		return sequencia;
	}

	public static void printzada (ArrayList<Integer> lista) {
		Iterator<Integer> itr = lista.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
