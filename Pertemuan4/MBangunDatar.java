/*  Nama File   : MBangunDatar.java 
    Deskripsi   :  berisi program utama untuk menggunakan class BangunDatar
    Pembuat     : Farhan Dwiyan Akbar
    Tanggal     : 12 - 03 - 2026
*/

package Pertemuan4;

public class MBangunDatar {
    public static void main(String[] args) {
        // Persegi
        Persegi P1 = new Persegi();
        P1.setSisi(10);
        P1.setWarna("Merah");
        P1.setBorder("Putus-putus");

        System.out.println("=== Persegi ===");
        P1.printInfo();
        System.out.println("Luas : " + P1.getLuas());
        System.out.println("Keliling : " + P1.getKeliling());
        System.out.println("Diagonal : " + P1.getDiagonal());
        System.out.println();

        // Lingkaran
        Lingkaran L1 = new Lingkaran();
        L1.setJari(7);
        L1.setWarna("Biru");
        L1.setBorder("Solid");

        System.out.println("=== Lingkaran ===");
        L1.printInfo();
        System.out.println("Luas : " + L1.getLuas());
        System.out.println("Keliling : " + L1.getKeliling());
        System.out.println();

        System.out.println("=== Counter Jumlah Bangun Datar ===");
        BangunDatar.printCounterBangunDatar();
    }
}
