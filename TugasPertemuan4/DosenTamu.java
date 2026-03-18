/*  Nama File   : DosenTamu.java 
    Deskripsi   : berisi atribut dan method dalam class DosenTamu
    Pembuat     : Farhan Dwiyan Akbar
    Tanggal     : 18 - 03 - 2026
*/

package TugasPertemuan4;

public class DosenTamu extends Dosen{
    private String NIDK;
    private String TBK;

    // method
    public DosenTamu(){
        super();
        this.NIDK = "";
        this.TBK = "";
    }

    public DosenTamu(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas, String NIDK, String TBK){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.TBK = TBK;
    }

    public String getNIDK(){
        return this.NIDK;
    }

    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    public String getTBK(){
        return this.TBK;
    }

    public void setTBK(String TBK){
        this.TBK = TBK;
    }

    public double getTunjangan(){
        return 0.25 * getGajiPokok();
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK Dosen Tamu : " + NIDK);
        System.out.println("Tanggal Berakhir Kontrak Dosen Tamu : " + TBK);
        System.out.println("Tunjangan Dosen Tamu : " + getTunjangan());
    }
}
