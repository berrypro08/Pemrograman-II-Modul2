class Buah{
        private String nama;
        private double berat;
        private double harga;
        private double jumlah;

        Buah(String nama,double berat,double harga, double jumlah){
                this.nama = nama;
                this.harga = harga;
                this.berat = berat;
                this.jumlah = jumlah;
        }

        public double getDiskon(){
                double diskon = 0;

                for (int i = 4; i <= jumlah; i += 4){
                        diskon += (harga / berat) * 4 * 0.02;
                }
                return diskon;
        }

        public void info(){
                double diskon = getDiskon();
                System.out.printf(
                        "Nama Buah: %s\n" +
                                "Berat: %.2f\n" +
                                "Harga: %.1f\n" +
                                "Jumlah Beli: %.1fkg\n" +
                                "Harga Sebelum Diskon: Rp%.2f\n" +
                                "Total Diskon: Rp%.2f\n" +
                                "Harga Setelah Diskon: Rp%.2f\n\n",
                        this.nama,this.berat,this.harga,this.jumlah,this.harga*this.jumlah,diskon,((this.harga*this.jumlah)-diskon)
                );
        }
}
void main() {
        Buah apel = new Buah("apel",0.4,7000,40);
        Buah mangga = new Buah("mangga",0.2,3500,15);
        Buah alpukat = new Buah("alpukat",0.25,10000,12);
        apel.info();
        mangga.info();
        alpukat.info();

}