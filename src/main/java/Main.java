public class Main {
    public static void main(String[] args) {
        System.out.println("Hello super classes!");

        Shoe s = new Shoe("Clark", 8);
        System.out.println(s.brand + " " + s.size);
        Walking w = new Walking(true, "Sketchers", 8.5);
        System.out.println(w.brand + " " + w.goreTex);
        Running r = new Running(200, "Nike", 9);
        System.out.println(r.brand + " " + r.weight);
    }
}
