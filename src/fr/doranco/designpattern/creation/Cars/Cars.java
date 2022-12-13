package fr.doranco.designpattern.creation.Cars;

public abstract class Cars  {
    protected int door;
    protected int power;
    protected String motorType;
    protected String mark;
    protected String model;
    protected int sit;
    protected Cars(int sit, int door, int power, String mark, String model, String motorType) {
        this.door = door;
        this.power = power;
        this.mark = mark;
        this.model = model;
        this.motorType = motorType;
        this.sit = sit;
    };

    @Override
    public String toString() {
        return "Cars{" +
                "door=" + door +
                ", power=" + power +
                ", motorType='" + motorType + '\'' +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", sit=" + sit +
                '}';
    }

    public int getDoor() {
        return this.door;
    }

    public Cars setDoor(int door) {
        this.door = door;
        return this;
    }

    public int getPower() {
        return this.power;
    }

    public Cars setPower(int power) {
        this.power = power;
        return this;
    }

    public Cars setName(String model) {
        this.model = model;
        return this;
    }


}
