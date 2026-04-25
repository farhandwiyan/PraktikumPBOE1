/*  Nama File   : CivitasAkademika.java 
    Deskripsi   : Kelas CivitasAkademika sebagai induk dari kelas Dosen dan Mahasiswa
    Pembuat     : Farhan Dwiyan Akbar - 24060124140137
    Tanggal     : 25 - 04 - 2026
*/

package PBO07_24060124140137.UniversalInclusion.Seminar;

public abstract class CivitasAkademika {
    private String Nama;

    public CivitasAkademika() {
        this.Nama = "";
    }

    public CivitasAkademika(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public abstract String getNomor();
}
