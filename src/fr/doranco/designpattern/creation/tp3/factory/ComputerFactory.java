package fr.doranco.designpattern.creation.tp3.factory;

import fr.doranco.designpattern.creation.tp3.computer.Computer;
import fr.doranco.designpattern.creation.tp3.factory.computer.ComputerAbstractFactory;

public final class ComputerFactory  {

    private ComputerFactory() {

    }

    public static Computer getComputer(ComputerAbstractFactory factory) {
      return factory.createComputer();
    }

}
