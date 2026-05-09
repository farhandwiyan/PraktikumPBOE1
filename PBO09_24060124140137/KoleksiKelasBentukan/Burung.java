/*  Nama File   : Burung.java 
    Deskripsi   : Kelas Burung sebagai anak dari kelas anabul
    Pembuat     : Farhan Dwiyan Akbar - 24060124140137
    Tanggal     : 25 - 04 - 2026
*/

package PBO09_24060124140137.KoleksiKelasBentukan;

public class Burung extends Anabul {
    public Burung() {
        super();
    }

    public Burung(String Panggilan) {
        super(Panggilan);
    }
    
    @Override
    public void Gerak() {
        System.out.println("Terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println("Cuit");
    }
}
