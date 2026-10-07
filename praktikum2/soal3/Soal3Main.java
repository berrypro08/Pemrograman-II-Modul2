package praktikum2.soal3;

public class Soal3Main {
    public static void main(String[] args) {
        //nama class yang diambil tidak sama/tidak sesuai dengan class yang ada
        Pegawai p1 = new Pegawai();
        //tidak ada titik koma di akhir blok kode
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal ="Kingdom of Orvel";
        p1.setJabatan("Assasin");
        //menambahkan nilai ke dalam objek umur di dalam variabel reference p1 yang mengarah ke class Pegawai
        p1.umur = 17;

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur);
    }
}