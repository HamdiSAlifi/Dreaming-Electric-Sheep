package persiapanQuizADT;

public final class Buku {
	private String ISBN, Pengarang, Judul;
	
	// Constructor
	public Buku(String ISBN, String Pengarang, String Judul) {
		this.ISBN = ISBN;
		this.Pengarang = Pengarang;
		this.Judul = Judul;
	}
	
	// Setter
	public void setISBN(String ISBN ) {
		this.ISBN = ISBN;
	}
	public void setPengarang(String Pengarang ) {
		this.Pengarang = Pengarang;
	}
	public void setJudul(String Judul ) {
		this.Judul = Judul;
	}
	
	// getter
	public String getISBN() {
		return ISBN;
	}
	public String getPengarang() {
		return Pengarang;
	}
	public String getJudul() {
		return Judul;
	}
	
	// LinkedList (koleksiBuku)
		
}
// KoleksiBuku class (LinkedList)
//class KoleksiBuku {
//	private LinkedList<Buku> koleksi;
//	
//	//Constructor
//	public KoleksiBuku() {
//		koleksi = new LinkedList<>();
//	}
//	
//	// nambah buku
//	public void tambahBuku(Buku buku) {
//		koleksi.addFirst(buku); // head of the LinkedList
//	}
//	
//	// dislay all koleksiBuku
//	public void tampilkanSemua() {
//		if (koleksi.isEmpty()) {
//			System.out.println("Koleksi kosong.");
//		} else {
//			System.out.println("=== Koleksi Buku ===");
//			for (Buku buku : koleksi) {
//				System.out.println(buku);
//			}
//		}
//	}
//}
//
//// Peminjaman class (Queue)
//class Peminjaman {
//	private Queue<Buku> pinjam;
//	
//	// c
//	public Peminjaman() {
//		pinjam = new LinkedList<>();
//	}
//	
//	// borrow (enqueue)
//	public void pinjamBuku(Buku buku) {
//		pinjam.offer(buku); //fifo
//	}
//	
//	// display
//	public void tampilkanAntrian() {
//		if (pinjam.isEmpty()) {
//			System.out.println("peminjaman kosong.");
//		} else {
//			System.out.println("=== antre peminjamamn ===");
//			for (Buku buku : pinjam) {
//				System.out.println(buku);
//			}
//		}
//	}
//}
//
//// pengembalian (stack)
//class Pengembalian {
//	private Stack<Buku> kembali;
//	
//	// c
//	public Pengembalian() {
//		kembali = new Stack<>();
//	}
//	
//	// return (push)
//	public void kembalikanBuku(Buku buku) {
//		kembali.push(buku);
//	}
//	
//	// display
//	public void tampilkanRiwayat( ) {
//		if (kembali.isEmpty()) {
//			System.out.println();
//		} else {
//			System.out.println("none buku kemballi");
//			for (Buku buku : kembali) {
//				System.out.println(buku);
//			}
//		}
//	}
//}