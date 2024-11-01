public class Main {
    public static void main(String[] args) {
        Kipas kipas = new Kipas(250_000, "Hitam", "LG", "Standing Fan");
        System.out.println(kipas.getInfo());

        TV tv = new TV("LCD", 34, 5_000_000, "Hitam", "Panasonic");
        System.out.println(tv.getInfo());

        Kulkas kulkas = new Kulkas(2, 10_000_000, "Hitam", "Sharp");
        System.out.println(kulkas.getInfo());

        SmartFridge smartFridge = new SmartFridge(40, 4, 25_000_000, "Silver", "Samsung");        
        System.out.println(smartFridge.getInfo());
    }
}