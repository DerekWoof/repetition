package mypackage.innerpackage;

import com.sun.javafx.collections.MappingChange;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ComputerMouse myComputerMouse = new ComputerMouse();
        ComputerMouse myComputerMouse2 = myComputerMouse;
        ComputerMouse myComputerMouseCopy = new ComputerMouse(myComputerMouse);
        System.out.println(ComputerMouse.constructedCount);

        Furniture furniture = new Table(true, false, 100);
        build(furniture);
        build(new Table(true, false, 90));

        Direction myDirection = Direction.LEFT;
        Direction[] directions = Direction.values();
        String upString = "UP";
        Direction.valueOf(upString);

        List<String> stringList = new ArrayList<>();
        stringList.add("abc");

        List<Integer> integerList = new LinkedList<>();
        integerList.add(4);

        for(int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }

        HashMap<Integer, String> personBySeatNo = new HashMap<>();
        personBySeatNo.put(234, "Adam Nowak");
        System.out.println(personBySeatNo.get(234));
        personBySeatNo.keySet();

    }

    private static void build(Furniture furniture) {
        furniture.build();
    }

    private void conditionalsAndLoops() {
        int a = 20;
        int b = 15;

        if (b > a) {
            a = 234;
            System.out.println("b jest większe od a, zmieniono wartość a");
        } else if (b == a) {
            System.out.println("b jest równe a");
        } else {
            System.out.println("b jest mniejsze od a");
        }
        System.out.println();
        b = 1;
        switch (b) {
            case 5:
                System.out.println("b ma wartość 5");
                break;
            case 1:
                System.out.println("b ma wartość 1");
                break;
            default:
                System.out.println("b nie ma wartości 5 ani 1");
        }

        System.out.println();

        for(int i = 5; i < 18; i++) {
            System.out.println(i);
        }

        System.out.println();
        int i = 1000;
        while(i > 1) {
            System.out.println(i);
            i /= 2;
        }
        int j;


        i = 0;
        do {
            System.out.println(i);
            i--;
        } while(i > 0);
    }

    private void primitiveTypes() {
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        boolean myBoolean = true; // false
        int myInt = 500;
        float myFloat = 5.5F;
        char myChar = 'N';
        char myChar2 = 78;

        System.out.println(myChar == myChar2);
        System.out.println(myChar2);
    }
}
