package Lab8;

public class Counter {
    static int x = 0;
    Status s;

    public Counter() {
    }

    public int get() {
        return x;
    }

    public int getAndIncrement() {
        x++;
        return x;
    }

    public int getAndDecrement() {
        x--;
        return x;
    }

    public Status getStatus() {
        if (x == 0) return s.ZERO;
        if (x >= 0) return s.POSITIVE;
        if (x <= 0) return s.NEGATIVE;
        return null;
    }

}
