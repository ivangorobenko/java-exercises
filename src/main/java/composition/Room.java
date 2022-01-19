package composition;

public class Room {
    private final boolean sofa;
    private boolean clean;


    public Room(boolean sofa) {
        this.sofa = sofa;
        this.clean = false;
    }

    public void clean(){
        this.clean = true;
    }

    public boolean isClean(){
        return this.clean;
    }

}
