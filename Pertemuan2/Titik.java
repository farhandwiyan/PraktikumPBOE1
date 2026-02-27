/*  Nama File   : Titik.java 
    Deskripsi   : berisi atribut dan method dalam class Titik
    Pembuat     : Farhan Dwiyan Akbar
    Tanggal     : 27 - 02 - 2026
*/
package Pertemuan2;

public class Titik {
    // atribut
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    // konstruktor
    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // method
    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public static int getCounterTitik(){
        return counterTitik;
    }

    public void setAbsis(double x){
        absis = x;
    }

    public void setOrdinat(double y){
        ordinat = y;
    }

    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    public int getKuadran(){
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0){
            return 2;
        } else if (absis < 0 && ordinat < 0){
            return 3;
        } else if (absis > 0 && ordinat < 0){
            return 4;
        } else{ // berada di titik pusat
            return 0;
        }
    }

    public double getJarakPusat(){
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    public double getJarak(Titik T){
        return Math.sqrt(((this.absis - T.getAbsis()) * (this.absis - T.getAbsis())) + ((this.ordinat - T.getOrdinat()) * (this.ordinat - T.getOrdinat())));
    }

    public void refleksiX(){
        ordinat *= -1;
    }

    public void refleksiY(){
        absis *= -1;
    }

    public Titik getRefleksiX(){
        return new Titik(absis, this.ordinat * -1);
    }

    public Titik getRefleksiY(){
        return new Titik(this.absis * -1, ordinat);
    }

    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

}