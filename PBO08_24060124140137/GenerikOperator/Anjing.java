/*  Nama File   : Anjing.java 
    Deskripsi   : Kelas Anjing sebagai anak dari kelas anabul
    Pembuat     : Farhan Dwiyan Akbar - 24060124140137
    Tanggal     : 25 - 04 - 2026
*/

package PBO08_24060124140137.GenerikOperator;

public class Anjing extends Anabul {
    public Anjing() {
        super();
    }

    public Anjing(String Nama) {
        super(Nama);
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
