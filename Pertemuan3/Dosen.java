/*  Nama File   : Dosen.java 
    Deskripsi   : berisi atribut dan method dalam class Garis
    Pembuat     : Farhan Dwiyan Akbar
    Tanggal     : 04 - 03 - 2026
*/

package Pertemuan3;

public class Dosen {
    // atribut
    private String nip;
    private String nama;
    private String prodi;

    // method
    public Dosen(){
        nip = "";
        nama = "";
        prodi = "";
    }

    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNIP(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public void setNIP(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }
}
