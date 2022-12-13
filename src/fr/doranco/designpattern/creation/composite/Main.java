package fr.doranco.designpattern.creation.composite;

public class Main {
    public static void main(String[] args) {
        Trailer trailer = new Trailer(11);
        System.out.println("Trail weight is " + trailer.getWeight() );
        Tractor tractor = new Tractor(8);
        System.out.println("Tractor weight is " + tractor.getWeight() );

        TruckComposite halfTrailer = new TruckComposite();
        halfTrailer.add(trailer);
        halfTrailer.add(tractor);
        System.out.println("Weight of trail is " + halfTrailer.getWeight());
    }
}
