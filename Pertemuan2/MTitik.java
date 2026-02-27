/*  Nama File   : MTitik.java 
    Deskripsi   : berisi atribut dan method dalam class Titik
    Pembuat     : Farhan Dwiyan Akbar
    Tanggal     : 27 - 02 - 2026
*/

package Pertemuan2;

public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik();
        Titik T2 = new Titik(8, 7);

        System.out.print("T1: "); 
        T1.printTitik();
        System.out.print("T2: "); 
        T2.printTitik();

        
        System.out.println("\n=== Uji Getter & Setter ===");
        T1.setAbsis(3);
        T1.setOrdinat(4);
        System.out.println("T1 setelah set : (" + T1.getAbsis() + "," + T1.getOrdinat() + ")");
        System.out.println("T2 setelah set : (" + T2.getAbsis() + "," + T2.getOrdinat() + ")");
        
        System.out.println("\n=== Uji Geser ===");
        T1.geser(2, 5);
        T2.geser(4, 3);

        System.out.println("T1: "); 
        T1.printTitik();
        System.out.println("T2: "); 
        T2.printTitik();

        System.out.println("\n=== Uji Kuadran ===");
        System.out.println("T1 berada di Kuadran: " + T1.getKuadran());
        System.out.println("T2 berada di Kuadran: " + T2.getKuadran());

        System.out.println("\n=== Uji Jarak ===");
        System.out.println("Jarak T2 ke Pusat: " + T2.getJarakPusat());
        System.out.println("Jarak T1 ke T2: " + T1.getJarak(T2));

        System.out.println("\n=== Uji Refleksi ===");
        T2.refleksiX();
        System.out.println("T2 setelah refleksi X: "); 
        T2.printTitik();

        T2.refleksiY();
        System.out.println("T2 setelah refleksi Y: "); 
        T2.printTitik();

        System.out.println("\n=== Uji Refleksi Titik Baru ===");
        Titik T3 = T1.getRefleksiX();
        System.out.println("Refleksi X: "); 
        T3.printTitik();

        Titik T4 = T1.getRefleksiY();
        System.out.println("Refleksi Y: "); 
        T4.printTitik();

        System.out.println("\n=== Uji Counter Titik ===");
        System.out.println("Jumlah objek Titik: " + Titik.getCounterTitik());
    }
}
