package fr.doranco.designpattern.creation.tp3.factory.disk;

import fr.doranco.designpattern.creation.tp3.disk.Cd;
import fr.doranco.designpattern.creation.tp3.disk.Disk;
import fr.doranco.designpattern.creation.tp3.disk.DiskTypeEnnum;

public final class CdFactory implements DiskAbstractFactory {

    private String type;
    private int size;
    private int speedRead;
    private int speedWriting;

    private boolean readOnly;

    public CdFactory(String type, int size, int speedRead, int speedWriting, boolean readOnly) {
        this.type = type;
        this.size = size;
        this.speedRead = speedRead;
        this.speedWriting = speedWriting;
        this.readOnly = readOnly;
    }

    public Disk createDisk () {
      return new Cd(DiskTypeEnnum.CD.getType(), size, speedRead, speedWriting, readOnly);
    }
}
