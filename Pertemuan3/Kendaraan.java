/*  Nama File   : Kendaraan.java 
    Deskripsi   : berisi atribut dan method dalam class Kendaraan
    Pembuat     : Farhan Dwiyan Akbar
    Tanggal     : 05 - 03 - 2026
*/

package Pertemuan3;

public class Kendaraan {
    // atribut
    private String noPlat;
    private String jenis;

    // method
    public Kendaraan() {
        noPlat = "";
        jenis = "";
    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }
}
