package fr.doranco.designpattern.creation.Cars;

public class Peugeot307 extends Peugeot {
    private String name = "Peugeot 307";
    public Peugeot307(int sit, int door, int power, String mark, String model, String motorType) {
        super(sit, door, power, mark, String.valueOf(PeugeotModelEnum.Peugeot_307), motorType);
    }
}
