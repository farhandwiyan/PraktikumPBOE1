package Pertemuan2;

public class Garis {
    // atribut
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // method
    public Garis(){
        titikAwal = new Titik(0, 0);
        titikAkhir = new Titik(1, 1);

        counterGaris++;
    }

    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;

        counterGaris++;
    }

    public Titik getTitikAwal(){
        return titikAwal;
    }

    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    public void setTitikAwal(Titik t){
        titikAwal = t;
    }

    public void setTitikAkhir(Titik t){
        titikAkhir = t;
    }

    public static int getCounterGaris(){
        return counterGaris;
    }

    public double getPanjangGaris(){
        return titikAwal.getJarak(titikAkhir);
    }

    public double getGradienGaris(){
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();

        double y = y2 - y1;
        double x = x2 - x1;

        if (x != 0) {
            return y / x; 
        } else {  
            // jika nilai x adalah 0, maka tidak bisa melakukan pembagian
            return -1;
        }
    }

    public Titik getTitikTengah(){
        double x1 = titikAwal.getAbsis();
        double x2 = titikAkhir.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double y2 = titikAkhir.getOrdinat();

        return new Titik((x1+x2)/2, (y1+y2)/2);
    }

    public boolean isGarisSejajar(Garis G){
        return this.getGradienGaris() == G.getGradienGaris();
    }

    public boolean isGarisTegakLurus(Garis G){
        return (this.getGradienGaris() * G.getGradienGaris()) == -1;
    }

    public void printGaris(){
        System.out.print("Titik awal: ");
        titikAwal.printTitik();
        System.out.print("Titik akhir: ");
        titikAkhir.printTitik();
    }

    public String getPersamaanGaris(){
        if (titikAwal.getAbsis() == titikAkhir.getAbsis()){
            return "x = " + titikAkhir.getAbsis();
        }

        double m = this.getGradienGaris();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();

        return "y = " + m + "x" + c;
    }
}
