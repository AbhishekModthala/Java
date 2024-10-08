enum Laptop {
    Macbook(2000), XPS(2200), Lenovo(1400), Samsung(1800);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class EnumEX {
    public static void main(String args[]) {
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + " : " + lap.getPrice());
        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " " + lap.getPrice());
        }
    }

}
