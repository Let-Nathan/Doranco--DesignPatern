package fr.doranco.designpattern.creation.tp3.disk;

public abstract class Disk {

    /**
     * @size Disk max capacity
     * @type reference to DiskTypeEnnum
     */
    protected String type;
    protected int size;
    protected int speedRead;
    protected int speedWriting;

    protected boolean readOnly;


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
