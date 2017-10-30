package mypackage.innerpackage;

public class ComputerMouse {
    private int dpi;
    private boolean optical;
    public final static int MAX_BUTTON_COUNT = 5;
    public static int constructedCount = 0;

    public ComputerMouse(int dpi, boolean optical) {
        this.dpi = dpi;
        this.optical = optical;
        constructedCount++;
    }

    public ComputerMouse(int dpi) {
        this(dpi, false);
//        this.dpi = dpi;
//        optical = false;
    }

    public ComputerMouse() {
        this(100, false);
    }

    public ComputerMouse(ComputerMouse computerMouse) {
        this(computerMouse.dpi, computerMouse.optical);
    }

    public void b(String c) {
        System.out.println("abc");
        a();
    }

    public static void a() {
        System.out.println("a");
    }

}
