package fr.doranco.designpattern.creation.composite;

public class Trailer implements Composant {
    private final int weight;

    public Trailer(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return this.weight;
    }
}
