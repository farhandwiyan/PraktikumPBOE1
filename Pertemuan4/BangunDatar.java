/*  Nama File   : BangunDatar.java 
    Deskripsi   : berisi atribut dan method dalam class BangunDatar
    Pembuat     : Farhan Dwiyan Akbar
    Tanggal     : 12 - 03 - 2026
*/

package Pertemuan4;

public class BangunDatar {
    private int jmlSisi;
    protected String warna;
    private String border;
    private static int counterBangunDatar = 0;

    // method
    public BangunDatar(){
        this.jmlSisi = 0;
        this.warna = "";
        this.border = "";
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek bangun datar : " + counterBangunDatar);
    }

    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String geWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

}
