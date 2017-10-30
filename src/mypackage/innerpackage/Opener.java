package mypackage.innerpackage;

public class Opener<T extends Openable> {

    public void open(T item) {
        item.open();
    }
}
