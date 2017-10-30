package mypackage.innerpackage;

public abstract class Furniture {
    private boolean wooden;
    private boolean upholstered;

    public Furniture(boolean wooden, boolean upholstered) {
        this.wooden = wooden;
        this.upholstered = upholstered;
    }

    public abstract void build();

}
