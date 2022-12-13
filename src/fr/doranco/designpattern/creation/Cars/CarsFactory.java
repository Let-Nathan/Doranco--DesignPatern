package fr.doranco.designpattern.creation.Cars;

public class CarsFactory {

    public static Cars getCars(int sit, int door, int power, String mark, String model, String motorType) {
        if(mark.equals(CarsMarkEnnum.PEUGEOT.getMark()) ) {
            if(model.equals(PeugeotModelEnum.Peugeot_107.getName())) {
                return new Peugeot(sit, door, power, mark, model, motorType);
            }
        }
        return null;
    }
}
