package priv.fffzlfk.generics;

import java.util.ArrayList;
import java.util.List;

public class ExtendsTest {
    List<? extends Number> nums1 = new ArrayList<Number>();
    List<? extends Number> nums2 = new ArrayList<Integer>();
    List<? extends Number> nums3 = new ArrayList<Double>();

    void get() {
        Number x = nums1.get(0);
        // Integer y = nums2.get(0); // compile error
        // Double z = nums3.get(0);  // compile error
    }

    void set() {
        /*
        nums1.add(new Number() {
            @Override
            public int intValue() {
                return 0;
            }

            @Override
            public long longValue() {
                return 0;
            }

            @Override
            public float floatValue() {
                return 0;
            }

            @Override
            public double doubleValue() {
                return 0;
            }
        });
         */ // compile error
        // nums2.add(new Integer(1));    // compile error
        // nums3.add(new Double(1.2)); // compile error
    }
}
