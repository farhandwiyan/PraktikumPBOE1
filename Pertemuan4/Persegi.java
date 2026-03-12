/*  Nama File   : Persegi.java 
    Deskripsi   : berisi atribut dan method dalam class Persegi
    Pembuat     : Farhan Dwiyan Akbar
    Tanggal     : 12 - 03 - 2026
*/

package Pertemuan4;

public class Persegi extends BangunDatar {
    private double sisi;

    // method
    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return this.sisi * this.sisi;
    }

    public double getKeliling(){
        return 4 * this.sisi;
    }

    public double getDiagonal(){
        return Math.sqrt((sisi*sisi) + (sisi*sisi));
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi : "+sisi);
    }
}
