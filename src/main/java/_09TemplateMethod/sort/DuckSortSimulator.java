package _09TemplateMethod.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DuckSortSimulator {

    public static void main(String[] args) {


        Duck[] ducks = { new Duck("Daffy", 8),
                        new Duck("Dewey", 6),
                        new Duck("Louie", 2),
                        new Duck("Donald", 10),
                        new Duck("Huey", 2)};

        System.out.println("Before sorting: ");
        display(ducks);
        System.out.println("----------------");
        System.out.println("After sorting: ");
        Arrays.sort(ducks);
        display(ducks);
    }


    private static void display(Duck[]  ducks) {
        for (Duck d : ducks) {
            System.out.println(d);
        }
    }


}
