/*  Nama File   : PNS.java 
    Deskripsi   : berisi atribut dan method dalam class PNS
    Pembuat     : Farhan Dwiyan Akbar - 24060124140137
    Tanggal     : 22 - 04 - 2026
*/

package TugasPertemuan5;

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS;
    private final int A = 7;

    // method
    public PNS() {
        super();
        this.nip = "";
        counterPNS++;
    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNIP() {
        return this.nip;
    }

    public void setNIP(String nip) {
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override 
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period selisih = Period.between(getTglMulaiKerja(), now);

        return selisih.getYears() + A;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * getPendapatan();
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP : " + this.nip);
    }
}
