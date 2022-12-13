package fr.doranco.designpattern.creation.Cars;

public class Peugeot107 extends Peugeot {

    public Peugeot107(int sit, int door, int power, String mark, String model, String motorType) {
        super(sit, door, power, mark, String.valueOf(PeugeotModelEnum.Peugeot_107), motorType);
    }
}
