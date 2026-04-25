/*  Nama File   : Mahasiswa.java 
    Deskripsi   : Kelas Mahasiswa sebagai anak dari kelas CivitasAkademika
    Pembuat     : Farhan Dwiyan Akbar - 24060124140137
    Tanggal     : 25 - 04 - 2026
*/

package PBO07_24060124140137.UniversalInclusion.Seminar;

public class Mahasiswa extends CivitasAkademika{
    private String NIM;
    private String DosenWali;

    public Mahasiswa() {
        super();
        this.NIM = "";
        this.DosenWali = "";
    }

    public Mahasiswa(String Nama, String NIM) {
        super(Nama);
        this.NIM = NIM;
        this.DosenWali = "";
    }

    public String getNIM() {
        return this.NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getWali() {
        return this.DosenWali;
    }

    // mengubah isian dosenwali dengan parameter input Dosen
    public void setWali(Dosen DosenWali) {
        this.DosenWali = DosenWali.getNama();
    }

    // menampilkan data mahasiswa
    public void tampilDataMahasiswa() {
        System.out.println("Nama: " + this.getNama());
        System.out.println("NIM: " + this.NIM);
        System.out.println("Dosen Wali: " + this.DosenWali);
    }

    @Override
    public String getNomor() {
        return this.NIM;
    }
}
