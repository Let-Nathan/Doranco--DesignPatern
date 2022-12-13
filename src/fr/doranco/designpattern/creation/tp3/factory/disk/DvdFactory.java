package fr.doranco.designpattern.creation.tp3.factory.disk;

import fr.doranco.designpattern.creation.tp3.disk.Disk;
import fr.doranco.designpattern.creation.tp3.disk.DiskTypeEnnum;
import fr.doranco.designpattern.creation.tp3.disk.Dvd;

public final class DvdFactory implements DiskAbstractFactory {

    private String type;
    private int size;
    private int speedRead;
    private int speedWriting;
    private boolean readOnly;

    public DvdFactory(String type, int size, int speedRead, int speedWriting, boolean readOnly) {
        this.type = type;
        this.size = size;
        this.speedRead = speedRead;
        this.speedWriting = speedWriting;
        this.readOnly = readOnly;
    }

    public Disk createDisk() {
        return new Dvd(DiskTypeEnnum.DVD.getType(), size, speedRead, speedWriting, readOnly);
    }
}
