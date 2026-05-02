/*  Nama File   : Datum.java 
    Deskripsi   : Kelas Datum sebagai generik
    Pembuat     : Farhan Dwiyan Akbar - 24060124140137
    Tanggal     : 30 - 04 - 2026
*/

package PBO08_24060124140137.GenerikOperator;

public class Datum<G> {
    private G Isi;

    public G getIsi() {
        return Isi;
    }

    public void setIsi(G IsiClassGeneric) {
        this.Isi = IsiClassGeneric;
    }
}
