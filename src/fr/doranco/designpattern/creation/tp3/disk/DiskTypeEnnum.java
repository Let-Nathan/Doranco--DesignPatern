package fr.doranco.designpattern.creation.tp3.disk;

public enum DiskTypeEnnum {
    CD ("Cd"),
    DVD ("Dvd");

    private String type;
    DiskTypeEnnum(String type) {
        this.type = type;
    }

    public String getName() {
        return this.type;
    }
}
