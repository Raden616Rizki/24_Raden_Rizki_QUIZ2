public class AntrianDLL {
	
	Node_24 headPM = null,  headPS = null ;
	int size = 0 , noAntrian = 1 , noPesanan = 1 , pendapatan = 0 ;

	public boolean isEmptyPM() {
		return headPM == null ;
	}
	public boolean isEmptyPS() {
		return headPS == null ;
	}
	public void tambahPembeli(Pembeli item) {
		if (isEmptyPM()) {
			headPM = new Node_24 (null, item, null) ;
		} else {
			Node_24 current = headPM ;
			while (current.next != null) {
				current = current.next ;
			}
			current.next = new Node_24(current, item, null) ;
		}
		noAntrian++ ;
		size++ ;
	}
	public void cetakAntrian() {
		System.out.println("_____________________________") ;
		System.out.println("Daftar Antrian Resto Royal Delish") ;
		System.out.println("_____________________________") ;
		System.out.println("|\tNo.\t|\tNama Customer\t|\tNo. HP\t|") ;
		if (!isEmptyPM()) {
			Node_24 tmp = headPM ;
			while (tmp != null) {
				System.out.print("| " + tmp.dataPM.noAntrian ) ;
				System.out.print(" | " + tmp.dataPM.namaPembeli) ;
				System.out.print(" |" + tmp.dataPM.noHp + " |\n") ;
				tmp = tmp.next ;
			}
		} else {
			System.out.println("Antrian Masih Kosong!") ;
		}
	}
	public void hapusAntrian() {
		if (isEmptyPM()) {
			System.out.println("Linked Lists Masih Kosong, tidak dapat dihapus!") ;
		} else if (size == 1) {
			System.out.println(headPM.dataPM.namaPembeli + " Telah Memesan Menu") ;
			headPM = null ;
			size-- ;
		} else {
			System.out.println(headPM.dataPM.namaPembeli + " Telah Memesan Menu") ;
			headPM = headPM.next ;
			headPM.prev = null ;
			size-- ;
		}
	}
	public void tambahPesanan(Pesanan input) {
		if (isEmptyPS()) {
			headPS = new Node_24 (null, input, null) ;
			pendapatan += headPS.dataPS.harga ;
		} else {
			Node_24 current = headPS ;
			while (current.next != null) {
				current = current.next ;
			}
			current.next = new Node_24(current, input, null) ;
			pendapatan += current.next.dataPS.harga ;
		}
		noPesanan++ ;
	}
	public void cetakPesanan() {
		System.out.println("_____________________________") ;
		System.out.println("Daftar Pesanan Resto Royal Delish") ;
		System.out.println("_____________________________") ;
		System.out.println("|\tNo.\t|\tNama Pesanan\t|\tHarga\t|") ;
		if (!isEmptyPS()) {
			Node_24 tmp = headPS ;
			while (tmp != null) {
				System.out.print("| " + tmp.dataPS.kodePesanan ) ;
				System.out.print(" | " + tmp.dataPS.namaPesanan) ;
				System.out.print(" |" + tmp.dataPS.harga + " |\n") ;
				tmp = tmp.next ;
			}
		} else {
			System.out.println("Antrian Masih Kosong!") ;
		}
	}
}