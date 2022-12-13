package fr.doranco.designpattern.creation.tp3.disk;

public abstract class Disk {

    protected int size;
    protected int speedRead;
    protected int speedWriting;

    protected boolean readOnly;

    protected String type;

    public Disk(String type, int size, int speedRead, int speedWriting, boolean readOnly) {
        this.type = type;
        this.size = size;
        this.speedRead = speedRead;
        this.speedWriting = speedWriting;
        this.readOnly = readOnly;
    }

    @Override
    public String toString() {
        return "Disk{" +
                type + " " +
                "size = " + size +
                ", speedRead = " + speedRead +
                ", speedWriting = " + speedWriting +
                ", readOnly = " + readOnly +
                '}';
    }
}
