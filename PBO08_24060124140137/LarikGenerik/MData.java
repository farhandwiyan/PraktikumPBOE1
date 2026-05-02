/*  Nama File   : MData.java 
    Deskripsi   : Main class untuk menguji kelas Data
    Pembuat     : Farhan Dwiyan Akbar - 24060124140137
    Tanggal     : 02 - 05 - 2026
*/

package PBO08_24060124140137.LarikGenerik;

public class MData {
    public static void main(String[] args) {
        // kamus
        Data<Anabul> D;
        Anabul anabul;
        Kucing K;

        // algoritma
        D = new Data<>();
        K = new Kucing("Yupi", 5.0);

        // setIsi dan getSize
        D.setIsi(1, K);
        System.out.println("Size D setelah setIsi ke-1: " + D.getSize());
        D.setIsi(2, new Anjing("Snowie"));
        System.out.println("Size D setelah setIsi ke-2: " + D.getSize());
        D.setIsi(5, new Burung("Love Bird"));
        System.out.println("Size D setelah setIsi ke-3: " + D.getSize());

        // getIsi
        System.out.println("\n=== Data Posisi ke-1 ===");
        anabul = D.getIsi(1);
        System.out.println("Nama: " + anabul.getNama());
        System.out.print("Suara: "); anabul.Bersuara();
        System.out.print("Gerak: "); anabul.Gerak();

        System.out.println("\n=== Data Posisi ke-2 ===");
        anabul = D.getIsi(2);
        System.out.println("Nama: " + anabul.getNama());
        System.out.print("Suara: "); anabul.Bersuara();
        System.out.print("Gerak: "); anabul.Gerak();

        System.out.println("\n=== Data Posisi ke-3 ===");
        anabul = D.getIsi(3);
        System.out.println("Data posisi ke-3: " + anabul); // null

        System.out.println("\n=== Data Posisi ke-5 ===");
        anabul = D.getIsi(5);
        System.out.println("Nama: " + anabul.getNama());
        System.out.print("Suara: "); anabul.Bersuara();
        System.out.print("Gerak: "); anabul.Gerak();

    }
}
