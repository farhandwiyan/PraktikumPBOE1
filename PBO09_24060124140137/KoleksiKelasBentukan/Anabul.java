/*  Nama File   : Anabul.java 
    Deskripsi   : Kelas anabul sebagai induk dari kelas kucing, anjing, dan burung
    Pembuat     : Farhan Dwiyan Akbar - 24060124140137
    Tanggal     : 25 - 04 - 2026
*/

package PBO09_24060124140137.KoleksiKelasBentukan;

public abstract class Anabul {
    private String Panggilan;

    public Anabul() {
        this.Panggilan = "";
    }

    public Anabul(String Panggilan) {
        this.Panggilan = Panggilan;
    }

    public String getNama() {
        return this.Panggilan;
    }

    public void setNama(String Panggilan) {
        this.Panggilan = Panggilan;
    }
    
    // abstact method
    public abstract void Gerak();
    public abstract void Bersuara();
}
