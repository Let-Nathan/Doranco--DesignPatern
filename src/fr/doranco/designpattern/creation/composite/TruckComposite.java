package fr.doranco.designpattern.creation.composite;

import java.util.*;

public class TruckComposite implements Composant {

    private Collection<Composant> children;

    public TruckComposite() {
        children = new ArrayList<Composant>();
    }

    public int getWeight() {
        int result = 0;
        for (Iterator<Composant> i = children.iterator(); i.hasNext(); ) {
            Composant obj = i.next();
            Composant composant = obj;
            result += composant.getWeight();
        }
        return result;
    }

    public void add(Composant composant) {
      children.add(composant);
    }

    public void delete(Composant composant) {
        children.remove(composant);
    }

    public String getChild() {
        return children.toString();
    };
 }
