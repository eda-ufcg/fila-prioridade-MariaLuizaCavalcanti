import java.util.ArrayList;

public class InsereFinalFilaPrioridade implements FilaPrioridade {

	private ArrayList<Pair> fila;

	public InsereFinalFilaPrioridade(int capacidade) {
		this.fila = new ArrayList<Pair>(capacidade);
	}
	
	// criar um Pair e adicionar no fim da fila
	public void add(String elemento, int prioridade) {
		Pair p = new Pair(elemento, prioridade);
		this.fila.add(p);
	}


	// buscar pelo elemento de maior prioridade na fila.
	public String removeNext() {
		Pair maiorP = null;

		for (Pair p: fila) {
			if (maiorP == null || p.getPrioridade() > maiorP.getPrioridade()) {
				maiorP = p;
			}

		}
		fila.remove(maiorP);	
		return maiorP.getElemento();

	}
}
