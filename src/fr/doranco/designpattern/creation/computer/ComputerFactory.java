package fr.doranco.designpattern.creation.computer;

public class ComputerFactory  {

    public static Computer getComputer(String computerType, String computerRam, String computerHdd, String computerCpu) {
        if(computerType == "pc") {
            Pc pc = new Pc(computerRam, computerCpu, computerHdd, computerType);
            return pc;
        } else if (computerType == "server") {
            Server srv = new Server(computerRam, computerCpu, computerHdd, computerType);
            return srv;
        }
        return null;
    }

}
