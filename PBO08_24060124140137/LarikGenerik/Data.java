/*  Nama File   : Data.java 
    Deskripsi   : Kelas Data sebagai kelas generik yang memiliki atribut berupa larik
    Pembuat     : Farhan Dwiyan Akbar - 24060124140137
    Tanggal     : 02 - 05 - 2026
*/

package PBO08_24060124140137.LarikGenerik;

public class Data<G> {
    private G[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data() {
        this.ruang = (G[]) new Object[100];
        this.banyak = 0;
    }

    public G getIsi(int Posisi) {
        if (1 <= Posisi && Posisi <= 100) {
            return ruang[Posisi - 1];
        }
        return null;
    }

    public void setIsi(int Posisi, G Objek) {
        if (1 <= Posisi && Posisi <= 100) {
            ruang[Posisi - 1] = Objek;
            banyak += 1;
        }
    }

    public int getSize() {
        return banyak;
    }
    
}
