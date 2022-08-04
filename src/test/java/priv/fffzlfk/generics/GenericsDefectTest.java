package priv.fffzlfk.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericsDefectTest {
    @Test
    void testGetClass() {
        Pair<String> p1 = new Pair<>("Hello", "World");
        Pair<Integer> p2 = new Pair<>(114, 514);
        Class c1 = p1.getClass();
        Class c2 = p2.getClass();

        assertEquals(c1, c2);
        assertEquals(c1, Pair.class);
    }
}
