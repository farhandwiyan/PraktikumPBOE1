/*  Nama File   : MMhasiswa.java 
    Deskripsi   : berisi atribut dan method dalam class Garis
    Pembuat     : Farhan Dwiyan Akbar
    Tanggal     : 04 - 03 - 2026
*/

package Pertemuan3;

public class MMahasiswa {
    public static void main(String[] args) {
        Matkul PBO = new Matkul("PBO", "Pemrograman Berorientasi Objek", 3);
        Matkul TBO = new Matkul("TBO", "Teori Bahasa dan Otomata", 3);
        Mahasiswa M1 = new Mahasiswa("137", "Farhan", "Informatika");
        Dosen D1 = new Dosen("506", "Pak Priyo", "Informatika");
        Kendaraan K1 = new Kendaraan("B123", "Mobil");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(TBO);
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = "+M1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah = "+M1.getJumlahSks());
    }
}