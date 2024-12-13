class Paint {
    public String colorName;

    public Paint(String colorName) {
        this.colorName = colorName;
    }

    void paintSomething() {
        System.out.println("Painting something in " + colorName + " color.");
    }
}

public class ThisKW {
    public static void main(String[] args) {
        Paint p = new Paint("Red");

        p.paintSomething();
    }
}
