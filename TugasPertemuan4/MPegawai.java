/*  Nama File   : MPegawai.java 
    Deskripsi   : berisi program utama untuk menggunakan class Pegawai
    Pembuat     : Farhan Dwiyan Akbar
    Tanggal     : 18 - 03 - 2026
*/

package TugasPertemuan4;

public class MPegawai {
    public static void main(String[] args){
        DosenTetap dTetap = new DosenTetap("D1234", "Prof. Gregorius, S.ASA., M.ASA.", "17 Agustus 1954", "20 Januari 2014", 15000000.0, "Fakultas Sains dan Matematika", "NIDN123");
        DosenTamu dTamu = new DosenTamu("D1235", "Djuan Setyo, S.GTI.", "14 Februari 1997", "1 Januari 2021", 10000000.0, "Fakultas Sains dan Matematika", "NIDK123", "30 Desember 2027");
        Tendik tendik = new Tendik("T1234", "Lamine Yamal", "13 Juli 2007", "1 Januari 2026", 8000000.0, "Sumber Daya");

        System.out.println("==== Dosen Tetap ====");
        dTetap.printInfo();
        dTetap.printTunjangan(2014);

        System.out.println("\n==== Dosen Tamu ====");
        dTamu.printInfo();

        System.out.println("\n==== Tendik ====");
        tendik.printInfo();
        tendik.printTunjangan(2026);
    }
}
