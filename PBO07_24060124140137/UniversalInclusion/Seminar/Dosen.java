/*  Nama File   : Dosen.java 
    Deskripsi   : Kelas Dosen sebagai anak dari kelas CivitasAkademika
    Pembuat     : Farhan Dwiyan Akbar - 24060124140137
    Tanggal     : 25 - 04 - 2026
*/

package PBO07_24060124140137.UniversalInclusion.Seminar;

public class Dosen extends CivitasAkademika {
    private String NIP;

    public Dosen() {
        super();
        this.NIP = "";
    }

    public Dosen(String Nama, String NIP) {
        super(Nama);
        this.NIP = NIP;
    }

    public String getNIP() {
        return this.NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    @Override
    public String getNomor() {
        return this.NIP;
    }
}
