package oop.composition;

public class Kitchen {
    private final boolean own;
    private final int storage;
    private final boolean sink;
    private boolean clean;

    public Kitchen(boolean own, int storage, boolean sink) {
        this.own = own;
        this.storage = storage;
        this.sink = sink;
        this.clean = false;
    }

    public void clean(){
        this.clean = true;
    }

    public boolean isClean(){
        return this.clean;
    }
}
