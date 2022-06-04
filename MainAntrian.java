import java.util.Scanner ;
public class MainAntrian {
	static void menu() {
		System.out.println("Menu : ") ;
		System.out.println(" [1] Tambah Antrian\n [2] Cetak Antrian\n [3] Hapus Antrian\n [4] Laporkan Pengurutan Pesanan By Nama\n [5] Hitung Total Pendapatan\n [6] Keluar") ;
		System.out.print("Pilih (1 - 5) : ") ;
	}
	public static void main(String[] args) {
		
		int opsi ;

		AntrianDLL ad = new AntrianDLL() ;
		Scanner raden = new Scanner (System.in) ;
		Scanner rizki = new Scanner (System.in) ;

		System.out.println("========= QUIZ 2 PRAKTIKUM ASD TI - 1F dan TI - 1G =========") ;
		System.out.println("Dibuat oleh : Raden Rizki\nNIM : 2141720064\nAbsen : 24") ;

		do {
			menu() ;
			opsi = raden.nextInt() ;

			switch(opsi) {
			case 1 :
				System.out.println("_____________________________") ;
				System.out.println("Masukkan Data Pembeli") ;
				System.out.println("_____________________________") ;
				System.out.println("Nomor Antrian : " + ad.noAntrian) ;
				System.out.print("Nama Customer : ") ;
				String nc = rizki.nextLine() ;
				System.out.print("Nomor HP : ") ;
				String nh = rizki.nextLine() ;

				Pembeli pm = new Pembeli(ad.noAntrian, nc, nh) ;
				ad.tambahPembeli(pm) ;
				break ;
			case 2 :
				ad.cetakAntrian() ;
				break ;
			case 3 :
				ad.hapusAntrian() ;
				System.out.println("_____________________________") ;
				System.out.println("Transaksi Input Pesanan") ;
				System.out.println("_____________________________") ;
				System.out.println("Nomor Pesanan : " + ad.noPesanan) ;
				System.out.print("Pesanan : ") ;
				String ps = rizki.nextLine() ;
				System.out.print("Harga : ") ;
				int hg = raden.nextInt() ;
				Pesanan pn = new Pesanan(ad.noPesanan, ps, hg) ;
				ad.tambahPesanan(pn) ;
				ad.cetakPesanan() ;
				break ;
			case 4 :
				ad.cetakPesanan() ;
				break ;
			case 5 :
				System.out.println("_____________________________") ;
				System.out.println("TOTAL PENDAPATAN") ;
				System.out.println("_____________________________") ;
				System.out.println("Pendapatan Hari Ini : " + ad.pendapatan) ;
				break ;
			}
		} while (opsi == 1 || opsi == 2 || opsi == 3 || opsi == 4 || opsi == 5) ;
	}
}