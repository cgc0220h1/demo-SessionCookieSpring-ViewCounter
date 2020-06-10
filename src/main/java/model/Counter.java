package model;

public class Counter {
    private int current;

    public Counter() {
    }

    public Counter(int current) {
        this.current = current;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int increment() {
        return current++;
    }
}
