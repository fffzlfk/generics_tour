package priv.fffzlfk.generics;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsTest {

    @Test
    void copy() {
        List<Integer> src = Arrays.asList(1, 2, 3);
        List<Integer> dest = Arrays.asList(new Integer[3]);
        Collections.copy(dest, src);
        assertEquals(dest, src);
    }
}