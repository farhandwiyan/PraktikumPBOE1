package Pertemuan4;

public class Lingkaran extends BangunDatar{
    private double jari;

    // method
    public Lingkaran(){
        this.jari = 0;
    }

    public Lingkaran(double diameter, String warna, String border){
        this.jari = diameter / 2;
        this.warna = warna; // bisa diakses karena warna protected tidak private
        setBorder(border);
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return 3.14 * (this.jari*this.jari);
    }

    public double getKeliling(){
        return 2 * 3.14 * this.jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari : " + jari);
    }
}
