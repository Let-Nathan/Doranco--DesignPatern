package fr.doranco.designpattern.creation.tp3;

import fr.doranco.designpattern.creation.tp3.computer.Computer;
import fr.doranco.designpattern.creation.tp3.computer.Pc;
import fr.doranco.designpattern.creation.tp3.computer.Server;
import fr.doranco.designpattern.creation.tp3.factory.ComputerAbstractFactory;

public final class ComputerFactory  {

    private ComputerFactory() {

    }

    public static Computer getComputer(ComputerAbstractFactory factory) {
      return factory.createComputer();
    }

}
