/*  Nama File   : Anabul.java 
    Deskripsi   : Kelas anabul sebagai induk dari kelas kucing, anjing, dan burung
    Pembuat     : Farhan Dwiyan Akbar - 24060124140137
    Tanggal     : 25 - 04 - 2026
*/

package PBO08_24060124140137.GenerikClass;

public abstract class Anabul {
    private String Nama;

    public Anabul() {
        this.Nama = "";
    }

    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    // abstact method
    public abstract void Gerak();
    public abstract void Bersuara();
}
