package pertemuan7;

public class Tes4 {

	public static void main(String[] args) {
	    StrukturList list = new StrukturList();
	    list.addHead(new Matakuliah("IF004", "Konstruksi PL berorientasi Objek", 3));
	    list.addMid(new Matakuliah("IF003", "Struktur Diskrit", 3), 2);
	    list.addMid(new Matakuliah("IF002", "Pemrograman Web", 3), 3);
	    list.addTail(new Matakuliah("IF001", "Dasar Pemrograman", 4));
	    list.displayElement();
	}
	
}
