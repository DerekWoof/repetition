package mypackage.innerpackage;

public class Door extends Furniture implements Openable {
    private int height;

    public Door(boolean wooden, boolean upholstered, int height) {
        super(wooden, upholstered);
        this.height = height;
    }

    @Override
    public void open() {
        System.out.println("Otwieram drzwi");
    }

    @Override
    public void build() {
        System.out.println("Buduję drzwi");
    }
}
