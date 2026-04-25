/*  Nama File   : MSeminar.java 
    Deskripsi   : Kelas Seminar untuk mengelola peserta seminar, yaitu dosen dan mahasiswa
    Pembuat     : Farhan Dwiyan Akbar - 24060124140137
    Tanggal     : 25 - 04 - 2026
*/


package PBO07_24060124140137.UniversalInclusion.Seminar;

public class MSeminar {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("Dr.Luthfi ", "NIP001");
        Dosen d2 = new Dosen("Dr. Bella", "NIP002");

        Mahasiswa m1 = new Mahasiswa("Andi", "NIM100");
        Mahasiswa m2 = new Mahasiswa("Budi", "NIM101");
        Mahasiswa m3 = new Mahasiswa("Caca", "NIM102");
        Mahasiswa m4 = new Mahasiswa("Deni", "NIM103");
        Mahasiswa m5 = new Mahasiswa("Raid", "NIM104");

        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d2);

        Seminar seminar = new Seminar();
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);

        System.out.println("=== MENAMPILKAN PESERTA SEMINAR ===");
        seminar.tampilPeserta();

        System.out.println("\nJumlah Peserta Mahasiswa: " + seminar.countMahasiswa());
        System.out.println("Total Semua Peserta: " + seminar.countPeserta());

        System.out.println("\n=== DATA DETAIL MAHASISWA ===");
        m1.tampilDataMahasiswa();
        System.out.println();
        m2.tampilDataMahasiswa();
        System.out.println();
        m3.tampilDataMahasiswa();
        System.out.println();
        m4.tampilDataMahasiswa();
        System.out.println();
        m5.tampilDataMahasiswa();
    }
}
