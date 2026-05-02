/*  Nama File   : MOperatorGenerik.java 
    Deskripsi   : Main class untuk menguji kelas OperatorGenerik
    Pembuat     : Farhan Dwiyan Akbar - 24060124140137
    Tanggal     : 02 - 05 - 2026
*/


package PBO08_24060124140137.GenerikOperator;

public class MOperatorGenerik {
    public static void main(String[] args) {
        // kamus
        OperatorGenerik OG;
        Datum<Integer> angka1; Datum<Integer> angka2; // Integer
        Datum<String> string1; Datum<String> string2; // String
        Datum<Anabul> anabul1; Datum<Anabul> anabul2; // Anabul
        Datum<Kucing> kucing1; Datum<Kucing> kucing2; // kucing

        // Algoritma
        OG = new OperatorGenerik();
        
        System.out.println("=== Integer ===");
        angka1 = new Datum<>(); angka2 = new Datum<>();
        angka1.setIsi(8); angka2.setIsi(9);
        System.out.println("Sebelum Tukar: " + angka1.getIsi() + ", " + angka2.getIsi());
        OG.Tukar(angka1, angka2);        
        System.out.println("Setelah Tukar: " + angka1.getIsi() + ", " + angka2.getIsi());

        System.out.println("\n=== String ===");
        string1 = new Datum<>(); string2 = new Datum<>();
        string1.setIsi("Rumah"); string2.setIsi("Kaca");
        System.out.println("Sebelum Tukar: " + string1.getIsi() + ", " + string2.getIsi());
        OG.Tukar(string1, string2);
        System.out.println("Setelah Tukar: " + string1.getIsi() + ", " + string2.getIsi());

        System.out.println("\n=== Anabul ===");
        anabul1 = new Datum<>(); anabul2 = new Datum<>();
        anabul1.setIsi(new Kucing("TimTam", 5.5)); anabul2.setIsi(new Anjing("Snowie"));
        System.out.println("Sebelum Tukar: " + anabul1.getIsi().getNama() + ", " + anabul2.getIsi().getNama());
        OG.Tukar(anabul1, anabul2);
        System.out.println("Setelah Tukar: " + anabul1.getIsi().getNama() + ", " + anabul2.getIsi().getNama());

        System.out.println("\n=== Bobot2 ===");
        kucing1 = new Datum<>(); kucing2 = new Datum<>();
        kucing1.setIsi(new Kucing("KenKen", 7.5)); kucing2.setIsi(new KembangTelon("Embul", 6.0));
        System.out.println("Hasil Penjumlahan Bobot: " + OG.Bobot2(kucing1, kucing2));

    }
}
