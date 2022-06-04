public class Node_24 {
	
	Pesanan dataPS ;
	Pembeli dataPM ;
	Node_24 prev, next ;

	public Node_24() {

	}

	public Node_24(Node_24 prev, Pesanan data, Node_24 next) {
		this.prev = prev ;
		this.dataPS = data ;
		this.next = next ;
	}

	public Node_24(Node_24 prev, Pembeli data, Node_24 next) {
		this.prev = prev ;
		this.dataPM = data ;
		this.next = next ;
	}
}