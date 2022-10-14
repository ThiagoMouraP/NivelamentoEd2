package ed2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cabo cabo1 = new Cabo("XR132", 100);
		Cabo cabo2 = new Cabo("XR245", 80);
		Cabo cabo3 = new Cabo("XR356", 120);
		Cabo cabo4 = new Cabo("XR467", 180);
		
		LinkedList<Cabo> cabos2 = new LinkedList();
		cabos2.add(cabo1);
		cabos2.add(cabo2);
		cabos2.add(cabo3);
		cabos2.add(cabo4);
		
		LinkedList<Cabo> cabosOrdenados = juntaCabos(cabos2);
		printzada(cabosOrdenados);
	}
	
	public static LinkedList<Cabo> juntaCabos(LinkedList<Cabo> cabos) {
		PriorityQueue<Integer> ordenaPorComprimento = new PriorityQueue<Integer>();
		LinkedList<Cabo> cabosOrdenados = new LinkedList();
		
		//Ordena por comprimento
		for(int i = 0; i < cabos.size(); i++) {
			ordenaPorComprimento.add(cabos.get(i).getComprimento());
		}
		
		//Ordena os cabos, de acordo com os comprimentos
		int aux = cabosOrdenados.size();
		while(aux < cabos.size()) {
			for(int i = 0; i < cabos.size(); i++) {
				if(cabos.get(i).getComprimento() == ordenaPorComprimento.peek()) {
					cabosOrdenados.add(cabos.get(i));
					aux++;
					ordenaPorComprimento.remove();
				}
			}
		}
		
		
		return cabosOrdenados;
	}
	
	public static void printzada (LinkedList<Cabo> lista) {
		Iterator<Cabo> itr = lista.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next().getModelo());
		}
	}
	
	

}

