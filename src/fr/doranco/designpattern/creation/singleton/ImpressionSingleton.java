package fr.doranco.designpattern.creation.singleton;

public class ImpressionSingleton {

    private static ImpressionSingleton instance;

    private ImpressionSingleton() {

    }

    public synchronized static ImpressionSingleton getInstance() {
        if(instance == null) {
            instance = new ImpressionSingleton();
        }
        return instance;
    }

    public void printImpression() {
       System.out.println(instance);
    }

}
