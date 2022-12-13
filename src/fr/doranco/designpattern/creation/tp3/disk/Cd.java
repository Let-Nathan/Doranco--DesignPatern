package fr.doranco.designpattern.creation.tp3.disk;

public class Cd extends Disk {
    public Cd(String type, int size, int speedRead, int speedWriting, boolean readOnly) {
        super(DiskTypeEnnum.CD.getType(), size, speedRead, speedWriting, readOnly);
    }
}
