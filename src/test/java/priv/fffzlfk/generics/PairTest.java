package priv.fffzlfk.generics;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PairTest {
    private final Pair<String> p = new Pair<>("Hello", "World");
    @Test
    void getFirst() {
        assertEquals("Hello", p.getFirst());
    }

    @Test
    void getLast() {
        assertEquals("World", p.getLast());
    }
}