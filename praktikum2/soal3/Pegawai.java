package praktikum2.soal3;

//nama class harus sesuai dengan nama file
//public class Employee{
public class Pegawai {
    public String nama;
    //objek asal harusnya menggunakan string karena memuat kata , kalo char bagusnya dipakai untuk input yang cuman menuliskan 1 huruf
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    //didalam setJabatan harus diberi parameter karena berfungsi untuk setter
//    public void setJabatan() {
//        this.jabatan = j;
//    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}