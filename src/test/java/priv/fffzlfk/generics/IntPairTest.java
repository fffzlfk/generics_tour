package priv.fffzlfk.generics;

import org.junit.jupiter.api.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import static org.junit.jupiter.api.Assertions.*;

class IntPairTest {
    @Test
    void getSuperParameterizedType() {
        Class<IntPair> clazz = IntPair.class;
        Type t = clazz.getGenericSuperclass();
        if (t instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) t;
            Type[] types = pt.getActualTypeArguments(); // may have many types
            Type firstType = types[0];
            Class<?> typeClass = (Class<?>) firstType;
            assertEquals(typeClass, Integer.class);
        }
    }
}