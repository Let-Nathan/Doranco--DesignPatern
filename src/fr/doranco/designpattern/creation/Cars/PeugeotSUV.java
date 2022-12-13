package fr.doranco.designpattern.creation.Cars;

public class PeugeotSUV extends Peugeot {
    private String name = "Peugeot SUV";
    public PeugeotSUV(int sit, int door, int power, String mark, String model, String motorType) {
        super(sit, door, power, mark, String.valueOf(PeugeotModelEnum.Peugeot_SUV_2008), motorType);
    }
}
