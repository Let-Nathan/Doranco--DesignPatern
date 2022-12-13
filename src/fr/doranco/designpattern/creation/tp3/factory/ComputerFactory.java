package fr.doranco.designpattern.creation.tp3.factory;

import fr.doranco.designpattern.creation.tp3.computer.Computer;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
