package fr.doranco.designpattern.creation.tp3.computer;

public abstract class Computer {
    protected String ram;
    protected String hdd;
    protected String cpu;

    protected String type;

    protected Computer(String ram, String hdd, String cpu, String type) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.type = type;
    };

    public String getRam() {
        return this.ram;
    };

    public String getHdd() {
        return this.hdd;
    };

    public String getCpu() {
        return this.cpu;
    };

    public String setType(String type) {
        return this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return "[ Type: " + type + "; Ram: " + ram + "; Hdd: "  + hdd + "; Cpu: " + cpu + " ]";
    }
}
