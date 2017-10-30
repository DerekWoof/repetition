package mypackage.innerpackage;

public class Table extends Furniture {
    private int height;
    private Texture texture;

    public Table(boolean wooden, boolean upholstered, int height) {
        super(wooden, upholstered);
        this.height = height;
    }

    @Override
    public void build() {
        System.out.println("budujemy stół");
    }

}
