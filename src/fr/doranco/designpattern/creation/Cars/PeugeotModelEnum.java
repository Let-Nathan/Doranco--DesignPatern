package fr.doranco.designpattern.creation.Cars;

public enum PeugeotModelEnum {
    Peugeot_107 ("107"),
    Peugeot_307 ("307"),
    Peugeot_SUV_2008 ("SUV 2008");

    private String modelPeugeot;

    private PeugeotModelEnum(String modelPeugeot) {
        this.modelPeugeot = modelPeugeot;
    }

    protected String getName() {
        return this.modelPeugeot;
    }
}
