package com.pluralsight;

public class Room {
    private int bed;
    private int price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    public Room(int bed, int price, boolean occupied, boolean dirty, boolean available) {
        this.bed = bed;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getNumberOfBed() {
        return bed;
    }

    public int getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "Room{" +
                "bed=" + bed +
                ", price=" + price +
                ", occupied=" + occupied +
                ", dirty=" + dirty +
                ", available=" + available +
                '}';
    }
}
