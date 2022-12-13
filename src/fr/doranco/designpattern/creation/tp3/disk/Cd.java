package fr.doranco.designpattern.creation.tp3.disk;

public class Cd extends Disk {
    public Cd(int size, int speedRead, int speedWriting, boolean readOnly) {
        super(DiskTypeEnnum.CD.getName(), size, speedRead, speedWriting, readOnly);
    }
}
