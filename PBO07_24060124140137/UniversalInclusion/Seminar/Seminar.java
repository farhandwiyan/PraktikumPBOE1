/*  Nama File   : Seminar.java 
    Deskripsi   : Kelas Seminar untuk mengelola peserta seminar, yaitu dosen dan mahasiswa
    Pembuat     : Farhan Dwiyan Akbar - 24060124140137
    Tanggal     : 25 - 04 - 2026
*/

package PBO07_24060124140137.UniversalInclusion.Seminar;

public class Seminar {
    public CivitasAkademika[] pesertas;
    public int banyakPeserta;

    public Seminar() {
        this.pesertas = new CivitasAkademika[100];  // max kapasitas 100
        this.banyakPeserta = 0;
    }

    public int countPeserta() {
        return banyakPeserta;
    }

    public void registrasi(CivitasAkademika peserta) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = peserta;
            banyakPeserta++;
        } else {
            System.out.println("Kuota Seminar Sudah Penuh");
        }
    }

    public void tampilPeserta() {
        int i;

        for (i = 0; i < banyakPeserta; i++) {
            System.out.println("Nomor: " + pesertas[i].getNomor() + ", Nama: " + pesertas[i].getNama());
        }
    }

    public int countMahasiswa() {
        int i, count;

        count = 0;
        for (i = 0; i < pesertas.length; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }

        return count;
    }
}
