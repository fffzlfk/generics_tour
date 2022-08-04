package priv.fffzlfk.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairHelperTest {

    @Test
    void addNumber() {
        assertEquals(3, PairHelper.add(new Pair<Number>(1, 2)));
    }

    void addInteger() {
//        assertEquals(3, PairHelper.add(new Pair<Integer>(1, 2)));
    }

    static int add(Pair<? extends Number> p) {
        Number first = p.getFirst();
        Number last = p.getLast();
        return first.intValue() + last.intValue();
    }

    @Test
    void addNumberBased() {
        assertEquals(579, add(new Pair<Integer>(123, 456)));
    }
}