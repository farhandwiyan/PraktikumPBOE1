/*  Nama File   : MDatum.java 
    Deskripsi   : Main class untuk menguji kelas Datum
    Pembuat     : Farhan Dwiyan Akbar - 24060124140137
    Tanggal     : 30 - 04 - 2026
*/

package PBO08_24060124140137.GenerikClass;

public class MDatum {
    public static void main(String[] args) {
        // kamus
        Kucing A;
        Datum<Anabul> anu;

        // algoritma
        A = new Anggora("Timtam", 5.5);
        anu = new Datum<>();

        System.out.println("\nTes 1");
        anu.setIsi(A);  // Anggora
        anu.getIsi().Bersuara(); // Meong
        anu.getIsi().Gerak(); // Melata

        System.out.println("\nTes 2");
        anu.setIsi(new KembangTelon("KenKen", 8.0)); // KembangTelon
        anu.getIsi().Bersuara(); // Meong
        anu.getIsi().Gerak(); // Melata

        System.out.println("\nTes 3");
        anu.setIsi(new Anjing("Snowie")); // Anjing
        anu.getIsi().Bersuara(); // Guk-Guk
        anu.getIsi().Gerak(); // Melata

        System.out.println("\nTes 4");
        anu.setIsi(new Burung("Elang")); // Burung
        anu.getIsi().Bersuara(); // Cuit
        anu.getIsi().Gerak(); // Terbang
    }

}
