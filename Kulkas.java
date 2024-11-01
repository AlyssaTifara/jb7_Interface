public class Kulkas extends AlatElektronik{
    private int jumlahPintu;

    public Kulkas(int jumlahPintu, double harga, String warna, String merk){
        super(harga, warna, merk);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public String getInfo() {
        return String.format("----------------------\n        Kulkas\n----------------------\nHarga : %.2f\nMerk : %s\nWarna : %s\njumlah Pintu : %d\n----------------------",
            getHarga(), getMerk(), getWarna(), jumlahPintu);
    }
}