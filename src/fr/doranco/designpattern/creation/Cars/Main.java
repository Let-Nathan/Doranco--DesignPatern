package fr.doranco.designpattern.creation.Cars;

//         On souhaite créer un projet qui gère une usine et donc qui permet de fabriquer 3 modèles de voiture :
//        - Peugeot 107 (2 sièges, 2 portes, moteur essence 110 CV),
//        - Peugeot 307 (4 sièges, 4 portes, moteur Diesel 120 CV),
//        - Peugeot SUV 2008 (5 sièges, 5 portes, 136 CV)
//        Notre usine doit être capable plus tard de fabriquer un nouveau type de marque de voiture (exemple : Renault
//        avec plusieurs modèles)
public class Main {

    public static void main(String[] args) {
        System.out.println( CarsFactory.getCars(4, 4, 200, CarsMarkEnnum.PEUGEOT.getMark(), PeugeotModelEnum.Peugeot_107.getName(), "Essence"));
    }
}
