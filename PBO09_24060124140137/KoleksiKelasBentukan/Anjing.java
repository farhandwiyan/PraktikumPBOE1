/*  Nama File   : Anjing.java 
    Deskripsi   : Kelas Anjing sebagai anak dari kelas anabul
    Pembuat     : Farhan Dwiyan Akbar - 24060124140137
    Tanggal     : 25 - 04 - 2026
*/

package PBO09_24060124140137.KoleksiKelasBentukan;

public class Anjing extends Anabul {
    public Anjing() {
        super();
    }

    public Anjing(String Panggilan) {
        super(Panggilan);
    }
    
    @Override
    public void Gerak() {
        System.out.println("Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println("Guk-Guk");
    }
}
