package quizKemarin;
import java.util.*;


class Buku {
	private String judul;
	private String pengarang;
	private String isbn;
	
	public Buku(String judul, String pengarang, String isbn) {
		this.judul 		= judul;
		this.pengarang 	= pengarang;
		this.isbn 		= isbn;
		
	}
	
	@Override
	public String toString() {
		return "Judul : " + judul +
				", Pengarang : " + pengarang +
				", ISBN : " + isbn;
	}
}


public class programBuku {

	public static void main(String[] args) {
		LinkedList<Buku> koleksiBuku = new LinkedList<>();
		Queue<Buku> peminjaman = new LinkedList<>();
		Stack<Buku> pengembalian = new Stack<>();
		
		Buku b1 = new Buku("1","A","JMK001");
		Buku b2 = new Buku("2","B","JMK002");
		Buku b3 = new Buku("3","C","JMK003");
		
		koleksiBuku.add(b1);
		koleksiBuku.add(b2);
		koleksiBuku.add(b3);
		
		peminjaman.add(b1);
		peminjaman.add(b2);
		
		pengembalian.push(b1);
		
		System.out.println("==== Koleksi Buku ====");
		for (Buku b : koleksiBuku) {
			System.out.println(b);
		}
		
		System.out.println("\n==== Daftar Peminjaman ====");
		for (Buku b : peminjaman) {
			System.out.println(b);
		}
		
		System.out.println("\n==== Daftar Pengembalian ====");
		for (Buku b : pengembalian) {
			System.out.println(b);
		}
		
		

	}

}
