package fr.doranco.designpattern.creation.composite;

public class Tractor implements Composant {
    private final int weight;

    public Tractor(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }
}
