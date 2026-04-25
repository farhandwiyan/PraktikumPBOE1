/*  Nama File   : MAnabul.java 
    Deskripsi   : Program utama untuk menguji kelas Anabul
    Pembuat     : Farhan Dwiyan Akbar - 24060124140137
    Tanggal     : 25 - 04 - 2026
*/

package PBO07_24060124140137.UniversalInclusion.Anabul;

public class MAnabul {
    public static void main(String[] args) {
        Anabul A;
        
        A = new Kucing();
        A.Gerak();  // melata
        A.Bersuara();   // meong

        A = new Anjing();
        A.Gerak(); // melata
        A.Bersuara(); // guk-guk

        A = new Burung();
        A.Gerak(); // terbang
        A.Bersuara(); // cuit
    }
}
