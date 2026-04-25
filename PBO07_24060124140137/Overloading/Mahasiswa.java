/*  Nama File   : Mahasiswa.java 
    Deskripsi   : Kelas Mahasiswa dengan polimorfisme ad hoc overloading
    Pembuat     : Farhan Dwiyan Akbar - 24060124140137
    Tanggal     : 25 - 04 - 2026
*/

package PBO07_24060124140137.Overloading;

class Mahasiswa {
    public String NIM;
    public String Nama;
    public String ProgramStudi;

    // konstruktor tanpa parameter
    public Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }
    
    // konstruktor dengan parameter input
    public Mahasiswa(String NIM, String Nama, String ProgramStudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;
    }

    // konstruktor dengan parameter objek Mahasiswa
    public Mahasiswa(Mahasiswa mhs) {
        this.NIM = mhs.NIM;
        this.Nama = mhs.Nama;
        this.ProgramStudi = mhs.ProgramStudi;
    }

    public String getNIM() {
        return this.NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getProgramStudi() {
        return this.ProgramStudi;
    }

    // varian tanpa parameter
    public void setProgramStudi() {
        this.ProgramStudi = "";
    }

    // varian dengan parameter string
    public void setProgramStudi(String Prodi) {
        this.ProgramStudi = Prodi;
    }

    // varian dengan paremeter objek Mahasiswa
    public void setProgramStudi(Mahasiswa Mhs) {
        this.ProgramStudi = Mhs.ProgramStudi;
    }   
}
