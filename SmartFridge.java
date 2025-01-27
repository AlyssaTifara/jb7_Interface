public class SmartFridge extends Kulkas implements Audible{
    private int volume;

    public SmartFridge(int volume, int jumlahPintu, double harga, String warna, String merk) {
        super(jumlahPintu, harga, warna, merk);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void naikkanVolume(int increment) {
        volume += increment;
    }

    public void turunkanVolume(int decrement) {
        volume -= decrement;
    }

    public String getInfo() {
        return String.format("----------------------\n     Smart Fridge\n----------------------\nHarga : %.2f\nMerk : %s\nWarna : %s\nVolume : %d\njumlah Pintu : %d\n----------------------",
            getHarga(), getMerk(), getWarna(), volume, getJumlahPintu());
    }
}