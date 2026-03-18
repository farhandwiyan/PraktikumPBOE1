/*  Nama File   : Dosen.java 
    Deskripsi   : berisi atribut dan method dalam class Dosen
    Pembuat     : Farhan Dwiyan Akbar
    Tanggal     : 18 - 03 - 2026
*/

package TugasPertemuan4;

public class Dosen extends Pegawai{
    public String fakultas;

    // method
    public Dosen(){
        super();
        this.fakultas = "";
    }

    public Dosen(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas(){
        return this.fakultas;
    }

    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas Dosen : " + fakultas);
    }
}
