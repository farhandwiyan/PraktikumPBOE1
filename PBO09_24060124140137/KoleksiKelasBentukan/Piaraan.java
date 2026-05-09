/*  Nama File   : Piaraan.java 
    Deskripsi   : Kelas Piaraan menggunakan Antian atau Qeueu
    Pembuat     : Farhan Dwiyan Akbar - 24060124140137
    Tanggal     : 09 - 05 - 2026
*/

package PBO09_24060124140137.KoleksiKelasBentukan;

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private Queue<Anabul> Lanabul;
    private int nbelm;

    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return this.nbelm;
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    public Anabul dequeueAnabul() {
        // kamus lokal
        Anabul firstElm;

        // algoritma
        firstElm = Lanabul.poll();
        if (firstElm != null) {
            nbelm--;
        }

        return firstElm;
    }

    public void showAnabul() {
        System.out.println("Daftar Anabul dalam Antrean:");
        for (Anabul anabul : Lanabul) {
            System.out.println(anabul.getNama());
        }
    }

    public int countKucing() {
        // kamus lokal
        int count;

        // algoritma
        count = 0;
        for (Anabul anabul : Lanabul) {
            if (anabul instanceof Kucing) {
                count++;
            }
        }

        return count;
    }

    public double bobotKucing() {
        // kamus lokal
        double bobot;

        // algoritma
        bobot = 0;
        for (Anabul anabul : Lanabul) {
            if (anabul instanceof Kucing) {
                bobot += ((Kucing)anabul).getBobot();
            }
        }

        return bobot;
    }

    public void showJenisAnabul() {
        System.out.println("Daftar Anabul dalam Antrean:");
        for (Anabul anabul : Lanabul) {
            System.out.println(anabul.getNama() + ", berjenis " + anabul.getClass().getSimpleName());
        }
    }
}
