public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}