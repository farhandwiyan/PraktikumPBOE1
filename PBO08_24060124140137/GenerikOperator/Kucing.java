/*  Nama File   : Kucing.java 
    Deskripsi   : Kelas Kucing sebagai anak dari kelas anabul
    Pembuat     : Farhan Dwiyan Akbar - 24060124140137
    Tanggal     : 30 - 04 - 2026
*/

package PBO08_24060124140137.GenerikOperator;

public class Kucing extends Anabul {
    private double Bobot;

    public Kucing() {
        super();
        this.Bobot = 0.0;
    }

    public Kucing(String Nama, double Bobot) {
        super(Nama);
        this.Bobot = Bobot;
    }

    public double getBobot() {
        return this.Bobot;
    }

    public void setBobot(double Bobot) {
        this.Bobot = Bobot;
    }
    
    @Override
    public void Gerak() {
        System.out.println("Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println("Meong");
    }
}
