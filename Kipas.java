public class Kipas extends AlatElektronik{
    private String jenis;

    public Kipas(double harga, String warna, String merk, String jenis) {
        super(harga, warna, merk);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    public String getInfo() {
        return String.format("----------------------\n        Kipas\n----------------------\nHarga : %.2f\nMerk : %s\nWarna : %s\nJenis : %s\n----------------------",
            getHarga(), getMerk(), getWarna(), jenis);
    }
}