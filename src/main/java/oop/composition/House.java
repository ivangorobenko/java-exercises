package oop.composition;

public class House {
    private Room room;
    private Kitchen kitchen;

    public House(Room room, Kitchen kitchen) {
        this.room = room;
        this.kitchen = kitchen;
    }


    public void clean(){
        this.kitchen.clean();
        this.room.clean();
    }

    public boolean isClean(){
        return this.room.isClean() && this.kitchen.isClean();
    }
}
