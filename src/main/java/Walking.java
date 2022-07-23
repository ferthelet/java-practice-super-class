public class Walking extends Shoe {
    public final boolean goreTex;

    // constructor
    public Walking(boolean goreTex, String brand, double size) {
        super(brand, size); //first
        this.goreTex = goreTex;
    }
}