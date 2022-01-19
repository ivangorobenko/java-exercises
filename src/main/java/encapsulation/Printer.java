package encapsulation;

public class Printer {

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    private int tonerLevel;
    private int pagesPrinted;
    private final boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (isTonerLevelNotValid(tonerLevel)) {
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    private boolean isTonerLevelNotValid(int tonerLevel) {
        return tonerLevel > 100 || tonerLevel < 0;
    }

    public int addToner(int levelToAdd) {
        if (isTonerLevelNotValid(levelToAdd)) return -1;
        int newTonerLevel = levelToAdd + this.tonerLevel;
        if (isTonerLevelNotValid(newTonerLevel)) return -1;
        this.tonerLevel = newTonerLevel;
        return newTonerLevel;
    }

    public void print(int pagesToPrint) {
        if (this.duplex) this.pagesPrinted = (pagesToPrint / 2) + (pagesToPrint % 2);
        else{
            this.pagesPrinted += pagesToPrint;
        }
    }
}
