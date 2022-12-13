package fr.doranco.designpattern.creation.Cars;

public class Peugeot extends Cars {

   public Peugeot(int sit, int door, int power, String mark, String model, String motorType){
       super(sit, door,power, CarsMarkEnnum.PEUGEOT.getMark(), model, motorType);

   }

}
