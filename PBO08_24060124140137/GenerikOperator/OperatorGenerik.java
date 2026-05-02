/*  Nama File   : OperatorGenerik.java 
    Deskripsi   : Kelas OperatorGenerik sebagai kelas yang berisi fungsi dan prosedur generik
    Pembuat     : Farhan Dwiyan Akbar - 24060124140137
    Tanggal     : 02 - 05 - 2026
*/

package PBO08_24060124140137.GenerikOperator;

public class OperatorGenerik {
    public <G> void Tukar(Datum<G> A, Datum<G> B) {
        G temp = A.getIsi();
        A.setIsi(B.getIsi());
        B.setIsi(temp);;
    }

    public <G extends Kucing> double Bobot2(Datum<G> K1, Datum<G> K2) {
        return K1.getIsi().getBobot() + K2.getIsi().getBobot();
    }
}