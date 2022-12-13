package fr.doranco.designpattern.creation.tp3.factory.disk;

import fr.doranco.designpattern.creation.tp3.disk.Disk;

public final class DiskFactory {
    private DiskFactory(){};
    public static Disk getDisk(DiskAbstractFactory factory) {
        return factory.createDisk();
    }
}
