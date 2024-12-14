class IceCream {
    public static int price = 200;
    private String flavour;
    private String size;

    public IceCream(String flavour, String size) {
        this.flavour = flavour;
        this.size = size;
    }

    void getIceCream() {
        System.out.println("Your " + size + " size " + flavour + " Flavour Ice-Cream is ready!");
        System.out.println("Your Bill is " + price);
    }
}

public class StaticKW {
    public static void main(String[] args) {
        IceCream vedant = new IceCream("Praylines & Cream", "Small");
        IceCream saumyya = new IceCream("Mint Chocochip", "Large");

        IceCream.price = 400;
        vedant.getIceCream();
        saumyya.getIceCream();
    }
}