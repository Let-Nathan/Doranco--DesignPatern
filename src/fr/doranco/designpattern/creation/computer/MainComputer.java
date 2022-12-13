package fr.doranco.designpattern.creation.computer;

import java.util.Collection;

public class MainComputer {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "2GB", "500GB", "2,4Ghz");
        Computer server = ComputerFactory.getComputer("server", "16GB", "1TB", "2.9Ghz");
        System.out.println("Factory Pc configuration " + pc);
        System.out.println("Factory Server configuration " + server);
    }

}
