/*  Nama File   : MGaris.java 
    Deskripsi   : berisi atribut dan method dalam class Garis
    Pembuat     : Farhan Dwiyan Akbar
    Tanggal     : 04 - 03 - 2026
*/

package Pertemuan2;

public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();

        Titik T1 = new Titik(1, 2);
        Titik T2 = new Titik(2, 4);
        Garis G2 = new Garis(T1, T2);

        System.out.println("Garis1:");
        G1.printGaris();
        System.out.println("\nGaris2:");
        G2.printGaris();

        System.out.println("\n=== Uji Getter & Setter ===");
        G1.setTitikAwal(new Titik(2, 7));
        G1.setTitikAkhir(new Titik(9, 8));
        System.out.println("Titik awal G1 setelah set : (" + G1.getTitikAwal().getAbsis() + "," + G1.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik akhir G1 setelah set : (" + G1.getTitikAkhir().getAbsis() + "," + G1.getTitikAkhir().getOrdinat() + ")");

        System.out.println("\n=== Uji Panjang Garis ===");
        System.out.println("Panjang garis G1 : " + G1.getPanjangGaris());
        System.out.println("Panjang garis G2 : " + G2.getPanjangGaris());

        System.out.println("\n=== Uji Gradien Garis ===");
        System.out.println("Gradien garis G1 : " + G1.getGradienGaris());
        System.out.println("Gradien garis G2 : " + G2.getGradienGaris());

        System.out.println("\n=== Uji Titik Tengah ===");
        System.out.print("Titik tengah G1 : ");
        G1.getTitikTengah().printTitik();
        System.out.print("Titik tengah G2 : ");
        G2.getTitikTengah().printTitik();

        System.out.println("\n=== Uji Garis Sejajar ===");
        System.out.println("G1 sejajar dengan G2 : " + G1.isGarisSejajar(G2));
        
        Garis G3 = new Garis(new Titik(1, 3), new Titik(8,4));
        System.out.println("G1 sejajar dengan G3 : " + G1.isGarisSejajar(G3));

        System.out.println("\n=== Uji Garis Tegak Lurus ===");
        System.out.println("G1 tegak lurus dengan G2: " + G1.isGarisTegakLurus(G2));

        Garis G4 = new Garis(new Titik(1, 5), new Titik(3,4));
        System.out.println("G2 tegak lurus dengan G4: " + G2.isGarisTegakLurus(G4));

        System.out.println("\n=== Uji Persamaan Garis ===");
        System.out.println("Persamaan G1: \n" + G1.getPersamaanGaris());
        System.out.println("\nPersamaan G2: \n" + G2.getPersamaanGaris());

        System.out.println("\n=== Uji Counter Garis ===");
        System.out.println("Jumlah objek Garis: " + Garis.getCounterGaris());
    }
}
