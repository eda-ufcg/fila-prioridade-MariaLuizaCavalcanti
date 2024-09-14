public class HeapFilaPrioridade implements FilaPrioridade {

	private Heap heap;

	public HeapFilaPrioridade(int capacidade) {
		this.heap = new Heap(capacidade);
	}

	// adicionar o pair no heap
	public void add(String elemento, int prioridade) {
		Pair p = new Pair(elemento, prioridade);
		this.heap.add(p);
	}

	// recuperar a raiz
	public String removeNext() {
		this.heap.remove();
		return this.heap.getRaiz();
	}

	public static void main(String[] args) {
		heap.add("a", 1);
		heap.add("b", 2);
		heap.add("c", 3);
		heap.add("d", 4);
		heap.add("e", 5);

		System.out.println(this.heap.removeNext());
	}

}