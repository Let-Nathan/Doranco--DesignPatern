package fr.doranco.designpattern.creation.Cars;

public enum CarsMarkEnnum {
    PEUGEOT ("Peugeot");

    private String carsMark;

    private CarsMarkEnnum(String carsMark) {
        this.carsMark = carsMark;
    }

    public String getMark() {
        return this.carsMark;
    }
}
