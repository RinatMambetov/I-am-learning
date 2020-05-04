package lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListHomework {

    static ArrayList abc(String... array) {

        ArrayList<String> al = new ArrayList<>(array.length);

        for (String s : array) {
            if (!al.contains(s)) {
                al.add(s);
            }
        }

//        List<String> list = Arrays.asList(array); // array to list
//
//        ArrayList<String> al = new ArrayList<>(list); // list to arrayList
//
//        for (int i = 0; i < al.size() - 1; i++) { // remove repeated items
//            while (al.lastIndexOf(al.get(i)) != i) {
//                al.remove(al.get(i));
//            }
//        }

        Collections.sort(al); // sort arrayList

        System.out.print(al.toString()); // arrayList to string

        return al;
    }
}

class TestArrayListHomework {

    public static void main(String[] args) {
        ArrayListHomework.abc(args);
    }
}
