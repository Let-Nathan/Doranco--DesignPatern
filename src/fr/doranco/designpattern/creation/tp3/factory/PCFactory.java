package fr.doranco.designpattern.creation.tp3.factory;

import fr.doranco.designpattern.creation.tp3.computer.Computer;
import fr.doranco.designpattern.creation.tp3.computer.Pc;

public final class PCFactory implements ComputerAbstractFactory {

    private final String hdd;
    private final String ram;
    private final String cpu;
    private final String type;

    public PCFactory(String hdd, String ram, String cpu, String type) {
        this.hdd = hdd;
        this.ram = ram;
        this.cpu = cpu;
        this.type = type;
    }

    @Override
    public Computer createComputer() {
        return new Pc(hdd, ram, cpu, type);
    }
}
