package fr.doranco.designpattern.creation.tp3.disk;

public class Dvd extends Disk {
    public Dvd(String type, int size, int speedRead, int speedWriting, boolean readOnly) {
        super(DiskTypeEnnum.DVD.getType(), size, speedRead, speedWriting, readOnly);
    }
}
