package fr.doranco.designpattern.creation.tp3;

import fr.doranco.designpattern.creation.tp3.computer.Computer;
import fr.doranco.designpattern.creation.tp3.disk.Disk;
import fr.doranco.designpattern.creation.tp3.factory.computer.ComputerFactory;
import fr.doranco.designpattern.creation.tp3.factory.computer.PCFactory;
import fr.doranco.designpattern.creation.tp3.factory.computer.ServerFactory;
import fr.doranco.designpattern.creation.tp3.factory.disk.CdFactory;
import fr.doranco.designpattern.creation.tp3.factory.disk.DiskFactory;


//add disk production chain
public class TestFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2GB", "16G", "2,4GHZ", "pc") );
        Computer server = ComputerFactory.getComputer(new ServerFactory("1TB", "16G", "2,9Ghz", "server") );
        System.out.println("Abstract factory pc config" + pc);
        System.out.println("Abstract factory server config" + server);

        Disk dvd = DiskFactory.getDisk(new CdFactory("cd", 5, 100, 400, true) );
        System.out.println(dvd);
    }
}
