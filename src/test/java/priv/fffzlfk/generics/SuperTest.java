package priv.fffzlfk.generics;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SuperTest {
    List<? super Integer> array1 = new ArrayList<Integer>();
    List<? super Integer> array2 = new ArrayList<Number>();
    List<? super Integer> array3 = new ArrayList<Object>();

    void get() {
//        Integer integer = array1.get(0);
//        Number number = array2.get(0);
        Object o = array3.get(0);
    }

    void set() {
        array1.add(0);
        array2.add(0);
        array3.add(0);
    }
}
