package priv.fffzlfk.generics;

public class Pair<T> {
    private final T first;
    private final T last;

    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public T getLast() {
        return last;
    }
}
