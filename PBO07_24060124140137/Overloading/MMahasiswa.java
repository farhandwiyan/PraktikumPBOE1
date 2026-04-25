/*  Nama File   : MMahasiswa.java 
    Deskripsi   : Program utama untuk menguji kelas Mahasiswa
    Pembuat     : Farhan Dwiyan Akbar - 24060124140137
    Tanggal     : 25 - 04 - 2026
*/

package PBO07_24060124140137.Overloading;

public class MMahasiswa {
    public static void main(String[] args) {

        // aplikasi operator kelas Mahasiswa dan konstuktor Mahasiswa tanpa Parameter
        System.out.println("=== Bagian B dan C ===");
        Mahasiswa M1 = new Mahasiswa();
        System.out.println("Sebelum diisi");
        System.out.println("NIM : " + M1.getNIM());
        System.out.println("Nama : " + M1.getNama());
        System.out.println("Program Studi : " + M1.getProgramStudi());
        
        M1.setNIM("123456789");
        M1.setNama("Farhan Dwiyan Akbar");
        System.out.println("\nSetelah diisi");
        System.out.println("NIM : " + M1.getNIM());
        System.out.println("Nama : " + M1.getNama());
        System.out.println("Program Studi (belum diisi): " + M1.getProgramStudi());

        // aplikasi konstruktor Mahasiswa dengan tiga buah parameter
        System.out.println("\n=== Bagian D ===");
        Mahasiswa M2 = new Mahasiswa("987654321", "Leonardo DiCaprio", "Teknik Sipil");
        System.out.println("NIM : " + M2.getNIM());
        System.out.println("Nama : " + M2.getNama());
        System.out.println("Program Studi : " + M2.getProgramStudi());

        // aplikasi konstuktor dengan objek Mahasiswa lain
        System.out.println("\n=== Bagian E ===");
        Mahasiswa M3 = new Mahasiswa(M2);
        System.out.println("NIM : " + M3.getNIM());
        System.out.println("Nama : " + M3.getNama());
        System.out.println("Program Studi : " + M3.getProgramStudi());

        System.out.println("\n=== Tes setProgramStudi ===");
        // varian tanpa parameter
        M1.setProgramStudi();
        System.out.println("Program Studi (tanpa parameter): " + M1.getProgramStudi());
        
        // varian dengan parameter string
        M1.setProgramStudi("Informatika");
        System.out.println("Program Studi (dengan parameter String): " + M1.getProgramStudi());

        // varian dengan parameter Mahasiswa
        M1.setProgramStudi(M2);
        System.out.println("Program Studi (dengan parameter Mahasiswa): " + M1.getProgramStudi());
    }
}
